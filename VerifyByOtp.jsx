

import { useState, useEffect, useRef } from "react";
import { useNavigate, useLocation, Link } from "react-router-dom";
import axios from "axios";
import { API_ENDPOINT } from "../../../../config/Constants";
import toast from "react-hot-toast";
import { PrimaryButton } from "../../../../Components";
import { getRegistrationState } from "../../../../helpers";
import clsx from "clsx";
import styles from "./styles.module.css";
import { useForm } from "react-hook-form";
import { yupResolver } from "@hookform/resolvers/yup";
import { OTP_SCHEMA } from "../../Validations/otp.schema";
const DEFAULT_OTP_VALUES = ["", "", "", "", "", ""];
const VerifyPhoneNumber = () => {
  const navigate = useNavigate();
  const location = useLocation();
  const { country_code, phone_number, customer_id, afterLogin } =
    getRegistrationState();
  const {
    handleSubmit,
    register,
    setValue,
    setError,
    getValues,
    formState: { errors },
  } = useForm({
    defaultValues: {
      otp: DEFAULT_OTP_VALUES,
    },
    resolver: yupResolver(OTP_SCHEMA),
  });
  const [resendDisabled, setResendDisabled] = useState(true);
  const [minutes, setMinutes] = useState(2);
  const [seconds, setSeconds] = useState(0);
  const [loading, setLoading] = useState(false);
  const codeRef = useRef();
  const attemptReference = useRef(1);
  const handlePaste = (e) => {
    e.preventDefault();
    const pasteData = e.clipboardData.getData("text/plain").trim();
    if (/^\d{6}$/.test(pasteData)) {
      const newValues = pasteData.split("");
      setValue("otp", newValues);
    }
  };
  const handleChange = (index, value) => {
    if (/^\d*$/.test(value) && value.length <= 1) {
      setValue(`otp.${index}`, value, {
        shouldDirty: true,
        shouldTouch: true,
        shouldValidate: true,
      });
      if (value && index < getValues("otp").length - 1) {
        document.getElementById(`otp-input-${index + 1}`).select();
      }
    }
  };
  const onSubmit = async (data) => {
    const verificationCode = data.otp.join("");
    try {
      setLoading(true);
      const requestBody = {
        country_code: country_code,
        phone_number: phone_number,
        customer_id: customer_id,
        verification_code: verificationCode,
      };
      const response = await axios.post(
        `${API_ENDPOINT}/customer/register/verify_otp`,
        requestBody,
        {
          headers: {
            "Content-Type": "application/json",
          },
        }
      );
      if (response.data.status_code === 200) {
        if (afterLogin) {
          return navigate("/dashboard");
        } else {
          return navigate("../congrats");
        }
      }
      if (response.data.status_code === 400) {
        const errorMessage =
          "The OTP you entered is incorrect. Please check the code and try again.";
        setError("otp.5", { message: errorMessage }, { shouldFocus: true });
        return toast.error(errorMessage);
      }
      const errorMessage =
        "An error occurred while verifying OTP. Please try again later.";
      setError("otp.5", { message: errorMessage }, { shouldFocus: true });
      return toast.error(errorMessage);
    } catch (error) {
      setError(
        "otp.5",
        {
          message:
            "An error occurred while verifying OTP. Please confirm entered OTP",
        },
        { shouldFocus: true }
      );
    } finally {
      setLoading(false);
    }
  };
  const handleKeyDown = (e, index) => {
    if (e.key === "Enter") {
      handleSubmit(onSubmit)();
    }
    const values = getValues("otp");
    if (e.key === "ArrowLeft" && index > 0) {
      document.getElementById(`otp-input-${index - 1}`).focus();
    } else if (e.key === "ArrowRight" && index < values.length - 1) {
      document.getElementById(`otp-input-${index + 1}`).focus();
    } else if (e.key === "Backspace" && index > 0 && !values[index]) {
      document.getElementById(`otp-input-${index - 1}`).focus();
    }
  };
  const handleResendCode = async (event) => {
    event.preventDefault();
    const resetMinutesValue =
      {
        1: 2,
        2: 3,
      }[attemptReference.current] ?? 5;
    setResendDisabled(true);
    setMinutes(resetMinutesValue);
    setSeconds(0);
    attemptReference.current += 1;
    try {
      await axios.post(`${API_ENDPOINT}/customer/register/generate_otp`, {
        country_code: country_code,
        phone_number: phone_number,
      });
    } catch (error) {
      toast.error("Something went wrong during sending code");
    }
  };
  useEffect(() => {
    let timer;
    if (minutes >= 0 && seconds >= 0) {
      timer = setTimeout(() => {
        if (seconds === 0) {
          if (minutes === 0) {
            setResendDisabled(false);
            clearTimeout(timer);
          } else {
            setMinutes(minutes - 1);
            setSeconds(59);
          }
        } else {
          setSeconds(seconds - 1);
        }
      }, 1000);
    }
    return () => {
      clearTimeout(timer);
    };
  }, [minutes, seconds]);
  useEffect(() => {
    if (codeRef.current) codeRef.current.focus();
  }, []);
  const error = errors.otp?.find((e) => e?.message)?.message;
  return (
    <section className={styles["container"]}>
      <h1 className={styles["heading"]}>Enter the 6-digit code</h1>
      <p className={styles["description"]}>
        We sent it to{" "}
        <span className="font-weight-bold">
          {country_code}******{phone_number?.slice(-3)}
        </span>
      </p>
      <section className={styles["dots-container"]}>
        <div className={clsx(styles["dot"], styles["dot-finished"])}></div>
        <div className={clsx(styles["dot"], styles["dot-finished"])}></div>
        <div className={clsx(styles["dot"], styles["dot-finished"])}></div>
        <div className={clsx(styles["dot"], styles["dot-finished"])}></div>
        <div className={clsx(styles["dot"], styles["active-dot"])}></div>
        <div className={clsx(styles["dot"], styles["jump-second"])}></div>
      </section>
      <form
        className={styles["form-container"]}
        onSubmit={handleSubmit(onSubmit)}
      >
        <label htmlFor="otp-code" className="form-label fs-6">
          Your 6-digit code
        </label>
        <section className={styles["otp-container"]}>
          {DEFAULT_OTP_VALUES.map((value, index) => (
            <input
              disabled={loading}
              key={index}
              id={`otp-input-${index}`}
              className={clsx(
                styles["otp-input"],
                Boolean(error) && styles["input-error"]
              )}
              onInput={(e) => handleChange(index, e.target.value)}
              onKeyDown={(e) => handleKeyDown(e, index)}
              onPaste={handlePaste}
              maxLength={1}
              autoFocus={index === 0}
              {...register(`otp.${index}`)}
            />
          ))}
        </section>
        {Boolean(error) && <p className={styles["error"]}>{error}</p>}
        {resendDisabled ? (
          <p className={styles["resend-in"]}>
            Resend Code in {String(minutes).padStart(2, "0")}:
            {String(seconds).padStart(2, "0")}
          </p>
        ) : (
          <button className={styles["resend"]} onClick={handleResendCode}>
            Resend Code
          </button>
        )}
        <PrimaryButton
          className={styles["apply"]}
          disabled={Boolean(error)}
          loading={loading}
          type="submit"
        >
          Submit
        </PrimaryButton>
      </form>
      {!location.state?.afterLogin && (
        <Link to="/registration/generate_otp" className={styles["back"]}>
          Back
        </Link>
      )}
    </section>
  );
};
export default VerifyPhoneNumber;
