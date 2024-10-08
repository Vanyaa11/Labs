import * as yup from "yup";
export const OTP_SCHEMA = yup.object().shape({
  otp: yup.array().of(yup.string().required("OTP must have 6 digits")),
});
