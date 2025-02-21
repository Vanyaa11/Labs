import React, { useState, useEffect, useRef, startTransition } from 'react';
import styles from './add-students.module.scss';
import logo from '../../assets/images/Logo.svg';
import { QRCodeCanvas } from 'qrcode.react';
import { useNavigate } from 'react-router-dom';

import cross from '../../assets/images/cross-to-close.svg';
import buttonRight from '../../assets/images/add-studens-button-right.svg';
import lockIcon from '../../assets/images/add-lock-icon.svg';
import googlePlay from '../../assets/images/get-it-on-google-play.svg';
import appStore from '../../assets/images/download-on-the-app-store.svg';
import englishIcon from '../../assets/images/english-icon.svg';
import { useDispatch, useSelector } from 'react-redux';
import { fetchStudentsRequest } from '../../containers/students/action-creators';
import SelectPopup from './select-popup';
import arroxDown from '../../assets/images/arrow-down-select.svg';

const newStudents = [
  {
    id: '5VrW0EuLBEPJ09pyIbdUrSvTSl72',
    email: 'student-69@test.com',
    first_name: 'Adrienne',
    last_name: 'Hardin',
    role: 'student',
    custom_avatar_used: true,
    avatar_url:
      'data:image/png;base64,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',
    job_title: null,
    region_id: 'region-1',
    school_id: 'school-3',
    grade_id: 'grade-6',
    schoolName: 'Bracciano Bilingual Academy',
    gradeName: 'Year 2C',
    teacherName: 'Marcus McCoy',
    performance: 76,
    timeSpent: 2,
    homeworkCompletion: 64,
    generalTrend: 'On Track',
    weakest_skill: 'Vocabulary',
    strongest_skill: 'Grammar',
  },
  {
    id: 'Is3YqEY6jvVZwDxKpH8e2WgpBwC2',
    email: 'student-30@test.com',
    first_name: 'Alex',
    last_name: 'Page',
    role: 'student',
    custom_avatar_used: true,
    avatar_url:
      'data:image/png;base64,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',
    job_title: null,
    region_id: 'region-1',
    school_id: 'school-2',
    grade_id: 'grade-3',
    schoolName: 'Aldo Moro Elementary School',
    gradeName: 'Year 3A',
    teacherName: 'Sherrie Reynolds',
    performance: 78,
    timeSpent: 1,
    homeworkCompletion: 64,
    generalTrend: 'On Track',
    weakest_skill: 'Writing',
    strongest_skill: 'Other',
  },
  {
    id: 'WR3f9cbKg3VMcmxAFvTt5kq4zVr1',
    email: 'student-24@test.com',
    first_name: 'Allen',
    last_name: 'Vance',
    role: 'student',
    custom_avatar_used: true,
    avatar_url:
      'data:image/png;base64,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',
    job_title: null,
    region_id: 'region-1',
    school_id: 'school-2',
    grade_id: 'grade-3',
    schoolName: 'Aldo Moro Elementary School',
    gradeName: 'Year 3A',
    teacherName: 'Sherrie Reynolds',
    performance: 85,
    timeSpent: 1,
    homeworkCompletion: 64,
    generalTrend: 'On Track',
    weakest_skill: 'Reading',
    strongest_skill: 'Writing',
  },
  {
    id: 'JZWm2zFNhDVtjFiKtGQbFE78B572',
    email: 'student-115@test.com',
    first_name: 'Alyssa',
    last_name: 'Stevens',
    role: 'student',
    custom_avatar_used: true,
    avatar_url:
      'data:image/png;base64,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',
    job_title: null,
    region_id: 'region-1',
    school_id: 'school-5',
    grade_id: 'grade-10',
    schoolName: 'Enrico Fermi Educational Centre',
    gradeName: 'Year 1B',
    teacherName: 'Frankie Collins',
    performance: 78,
    timeSpent: 2,
    homeworkCompletion: 64,
    generalTrend: 'On Track',
    weakest_skill: 'Spelling',
    strongest_skill: 'Reading',
  },
  {
    id: 'GIgHTb78n0RjbZer3F3AfTGWRs13',
    email: 'student-2@test.com',
    first_name: 'Andrew',
    last_name: 'Barker',
    role: 'student',
    custom_avatar_used: true,
    avatar_url:
      'data:image/png;base64,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',
    job_title: null,
    region_id: 'region-1',
    school_id: 'school-1',
    grade_id: 'grade-1',
    schoolName: "St George's British International School",
    gradeName: 'Year 1A',
    teacherName: 'Kristin Watson',
    performance: 73,
    timeSpent: 5,
    homeworkCompletion: 64,
    generalTrend: 'Catching Up',
    weakest_skill: 'Reading',
    strongest_skill: 'Other',
  },
];

const AddStudents = () => {
  const popupRef = useRef(null);
  const schoolPopupRef = useRef(null);

  const dispatch = useDispatch();
  const { students, loading, error } = useSelector((state) => state.students);
  const filteredSchool = useSelector(
    (state) => state.dashboard.filters.schools,
  );
  const schoolsNames = useSelector((state) => state.schools);
  const [selectedSchool, setSelectedSchool] = useState('');
  const [isSchoolPopupVisible, setSchoolPopupVisible] = useState(false);
  const [isPopupVisible, setPopupVisible] = useState(false);
  const [selectedClass, setSelectedClass] = useState('');
  const [grade, setGrade] = useState('');
  const qrValue = 'https://example.com';
  const navigate = useNavigate();

  const schoolsNamesOptions = Object.values(schoolsNames).map(
    (school) => school.name,
  );

  useEffect(() => {
    if (filteredSchool && schoolsNames) {
      const selectedSchool = schoolsNames[filteredSchool[0]];
      if (selectedSchool) {
        setSelectedSchool(selectedSchool.name);
      }
    }
  }, [filteredSchool, schoolsNames]);

  const filteredStudents = grade
    ? newStudents.filter((student) => student.gradeName === grade)
    : newStudents;

  const uniqueGradeIds = [
    ...new Set(students.map((student) => student.gradeName)),
  ];

  const handleClassClick = () => {
    setPopupVisible(true);
  };

  const handleSelectClass = (className) => {
    setSelectedClass(className);
    setGrade(className);
    setPopupVisible(false);
  };

  const handleClosePopup = (event) => {
    if (popupRef.current && !popupRef.current.contains(event.target)) {
      setPopupVisible(false);
    }
  };

  const handleSchoolClick = () => {
    if (!filteredSchool) {
      setSchoolPopupVisible(true);
    }
  };
  const handleSelectSchool = (schoolName) => {
    setSelectedSchool(schoolName);
    setSchoolPopupVisible(false);
  };
  const handleCloseSchoolPopup = (event) => {
    if (
      schoolPopupRef.current &&
      !schoolPopupRef.current.contains(event.target)
    ) {
      setSchoolPopupVisible(false);
    }
  };

  useEffect(() => {
    if (isPopupVisible) {
      document.addEventListener('mousedown', handleClosePopup);
    } else {
      document.removeEventListener('mousedown', handleClosePopup);
    }
    return () => document.removeEventListener('mousedown', handleClosePopup);
  }, [isPopupVisible]);

  useEffect(() => {
    if (isSchoolPopupVisible) {
      document.addEventListener('mousedown', handleCloseSchoolPopup);
    } else {
      document.removeEventListener('mousedown', handleCloseSchoolPopup);
    }
    return () =>
      document.removeEventListener('mousedown', handleCloseSchoolPopup);
  }, [isSchoolPopupVisible]);

  useEffect(() => {
    dispatch(fetchStudentsRequest());
  }, [dispatch]);

  useEffect(() => {
    const currentTitle = document.title;
    if (currentTitle && !currentTitle.includes('Plingo')) {
      document.title = `Add students | Plingo`;
    } else {
      document.title = `Add students | Plingo`;
    }
  }, []);

  const handleAddStudentClick = () => {
    const parent = document.querySelector(
      '.react-ui-kit__app-wrapper_content--oyB5',
    );
    parent.style.backgroundColor = '';
    startTransition(() => {
      navigate(-1);
    });
  };

  useEffect(() => {
    const header = document.querySelector(
      '.react-ui-kit__ui-header_container--G3Qs',
    );
    if (header) {
      header.style.display = 'none';
      return () => {
        header.style.display = '';
      };
    }
  }, []);

  useEffect(() => {
    const parent = document.querySelector(
      '.react-ui-kit__app-wrapper_content--oyB5',
    );
    const originalBackgroundColor = parent.style.backgroundColor;
    parent.style.backgroundColor = '#004b52';
    return () => {
      parent.style.backgroundColor = originalBackgroundColor;
    };
  }, []);

  return (
    <div className={styles.addGroupPlayContainer}>
      <div className={styles.addHeaderGreen}>
        <img src={logo} alt='logo' className={styles.addHeaderLogoImg} />
        <div className={styles.addHeaderLogo}>
          <p className={styles.addHeaderLogoText}>Add students to</p>
          <img
            src={buttonRight}
            className={styles.addHeaderButtonRight}
            alt='Button right'
          />
          <div className={styles.addClassDropdownContainer}>
            <button
              className={
                isSchoolPopupVisible
                  ? styles.addClassDropdownTextActive
                  : styles.addClassDropdownText
              }
              onClick={handleSchoolClick}
            >
              {selectedSchool || 'Select school'}
              {selectedSchool && filteredSchool ? (
                <img
                  src={lockIcon}
                  className={styles.addLockIcon}
                  alt='Lock icon'
                />
              ) : (
                <img
                  src={arroxDown}
                  className={styles.addHeaderButtonRight}
                  alt='Button right'
                />
              )}
            </button>
            {isSchoolPopupVisible && (
              <div ref={schoolPopupRef}>
                <SelectPopup
                  options={schoolsNamesOptions}
                  onSelect={handleSelectSchool}
                  onClose={() => setSchoolPopupVisible(false)}
                />
              </div>
            )}
          </div>
          <img
            src={buttonRight}
            className={styles.addHeaderButtonRight}
            alt='Button right'
          />

          <div className={styles.addClassDropdownContainer}>
            <button
              className={
                isPopupVisible
                  ? styles.addClassDropdownTextActive
                  : styles.addClassDropdownText
              }
              onClick={handleClassClick}
            >
              {selectedClass ? selectedClass : 'Select class'}
              <img
                src={arroxDown}
                className={styles.addHeaderButtonRight}
                alt='Button right'
              />
            </button>
            {isPopupVisible && (
              <div ref={popupRef}>
                <SelectPopup
                  options={uniqueGradeIds}
                  onSelect={handleSelectClass}
                  onClose={() => setPopupVisible(false)}
                />
              </div>
            )}
          </div>
        </div>
        <button
          className={styles.addHeaderCloseButton}
          onClick={handleAddStudentClick}
        >
          <img
            src={cross}
            style={{ width: '16px', height: '16px' }}
            alt='cross'
          />
          CLOSE
        </button>
      </div>
      {grade ? (
        <div className={styles.addGroupPlayBody}>
          <div className={styles.addGroupPlayBodyContainer}>
            <div className={styles.scanToInstallContainer}>
              <img
                src={englishIcon}
                alt='English icon'
                style={{ width: '96px', height: '96px' }}
              />
              <p className={styles.scanToInstall}>
                Scan to install{' '}
                <span className={styles.plingoApp}>Plingo app </span> and join
                the class of
                <span className={styles.plingoApp}> Eric Todd </span>
              </p>
            </div>

            <div className={styles.addQRCodeContainer}>
              <div>
                <div style={{ padding: '15px', background: 'white' }}>
                  <QRCodeCanvas
                    value={qrValue}
                    size={370}
                    bgColor='#ffffff'
                    fgColor='#000000'
                    level='H'
                    qrStyle='square'
                    renderAs='canvas'
                    includeMargin={false}
                  />
                </div>
              </div>

              <div className={styles.downloadAppContainer}>
                <img
                  className={styles.downloadApp}
                  src={googlePlay}
                  alt='Google Play'
                />
                <img src={appStore} alt='App Store' />
              </div>
            </div>

            {filteredStudents && filteredStudents.length > 0 ? (
              <div className={styles.containerWithAddedStudents}>
                <p className={styles.addedStudents}>
                  Students joined: {filteredStudents.length}
                </p>
                <ul className={styles.studentCardContainer}>
                  {filteredStudents.map((student, index) => (
                    <li key={index} className={styles.studentCard}>
                      <img
                        src={student.avatar_url}
                        alt={`${student.first_name} ${student.last_name}`}
                        className={styles.studentAvatar}
                      />
                      <p className={styles.studentName}>
                        {student.first_name} {student.last_name}
                      </p>
                    </li>
                  ))}
                </ul>
              </div>
            ) : (
              <div className={styles.addRecommendedActivityContainer}>
                <p className={styles.waitingForStudentsToJoin}>
                  Waiting for students to join...
                </p>
                <div className={styles.containerOfNewStudents}></div>
              </div>
            )}
          </div>
        </div>
      ) : (
        <div className={styles.noSelectedClassTextContainer}>
          <p className={styles.noSelectedClassText}>
            Select class in the top panel
          </p>
        </div>
      )}
    </div>
  );
};

export const Component = AddStudents;
Component.displayName = 'AddStudents';

export default AddStudents;
