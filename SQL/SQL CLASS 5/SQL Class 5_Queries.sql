SELECT SALARY, FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE FIRST_NAME='Steven' OR LAST_NAME='Smith'
ORDER BY SALARY;

SELECT *
FROM EMPLOYEES
WHERE JOB_ID LIKE '%MAN%';

SELECT SUM(SALARY)
FROM EMPLOYEES;

SELECT SUM(SALARY), DEPARTMENT_ID
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID
ORDER BY SUM(SALARY) DESC;

SELECT AVG(SALARY), JOB_ID
FROM EMPLOYEES
GROUP BY JOB_ID
HAVING AVG(SALARY)>5000
ORDER BY 1;

--LEST DISPLAY MIN SALARY IN EACH DEPARTMENT
--AND WE WANT TO SEE ONLY DEPARTMENT WHOSE MIN SALARY IS <5000
--DISPLAY ONLY DEPARTMENT FROM 50 TO 100

SELECT MIN(SALARY), DEPARTMENT_ID
FROM EMPLOYEES
WHERE DEPARTMENT_ID BETWEEN 50 AND 100
GROUP BY DEPARTMENT_ID
HAVING MIN(SALARY)<5000
ORDER BY 2 DESC;

--DISPLAY EMP FIRST NAME, SALARY, DEP ID AND DEPART NAME

SELECT FIRST_NAME, SALARY , E.DEPARTMENT_ID, DEPARTMENT_NAME
FROM EMPLOYEES E JOIN DEPARTMENTS D
ON E.DEPARTMENT_ID=D.DEPARTMENT_ID
WHERE SALARY>7000
ORDER BY 2;

-- DISPLAY EMP FIRST NAME, SALARY, JOB_ID ONLY THOSE EMPLOYEE THAT WORK IN COUNTRY UNITED STATES
SELECT FIRST_NAME, SALARY, JOB_ID, COUNTRY_NAME
FROM EMPLOYEES E JOIN DEPARTMENTS D
ON E.DEPARTMENT_ID=D.DEPARTMENT_ID
JOIN LOCATIONS L
ON D.LOCATION_ID=L.LOCATION_ID
JOIN COUNTRIES C
ON L.COUNTRY_ID=C.COUNTRY_ID
WHERE COUNTRY_NAME='United States of America';

SELECT FIRST_NAME, SALARY , E.DEPARTMENT_ID, DEPARTMENT_NAME
FROM EMPLOYEES E JOIN DEPARTMENTS D
ON E.DEPARTMENT_ID=D.DEPARTMENT_ID;--> 106

SELECT FIRST_NAME, SALARY , E.DEPARTMENT_ID, DEPARTMENT_NAME
FROM EMPLOYEES E LEFT JOIN DEPARTMENTS D
ON E.DEPARTMENT_ID=D.DEPARTMENT_ID;--> COMMON+LEFT TABLE DATA=106+1=107

SELECT FIRST_NAME, SALARY , D.DEPARTMENT_ID, DEPARTMENT_NAME
FROM EMPLOYEES E RIGHT JOIN DEPARTMENTS D
ON E.DEPARTMENT_ID=D.DEPARTMENT_ID;--> COMMON+RIGHT TABLE DATA= 106+16=122

SELECT FIRST_NAME, SALARY , D.DEPARTMENT_ID, DEPARTMENT_NAME
FROM EMPLOYEES E FULL JOIN DEPARTMENTS D
ON E.DEPARTMENT_ID=D.DEPARTMENT_ID;

SELECT FIRST_NAME FROM EMPLOYEES
UNION ALL
SELECT DEPARTMENT_NAME FROM DEPARTMENTS;
--DISPLAY EMPLOYEES AND THEIR MANAGERS 

SELECT E.FIRST_NAME AS EMPLOYEE_NAME, E.LAST_NAME AS EMPLOYEE_LASTNAME,
        M.FIRST_NAME AS MANAGER_NAME, M.LAST_NAME AS MANAGER_LASTNAME, M.MANAGER_ID
FROM EMPLOYEES E JOIN EMPLOYEES M
ON E.MANAGER_ID=M.EMPLOYEE_ID;

SELECT * FROM EMPLOYEES 
WHERE MANAGER_ID=102;


SELECT E.FIRST_NAME AS EMPLOYEE, E.LAST_NAME AS EMP_LASTNAME,
        C.FIRST_NAME COWORKER, C.LAST_NAME CO_LASTNAME
    
FROM EMPLOYEES E JOIN EMPLOYEES C
ON E.DEPARTMENT_ID=C.DEPARTMENT_ID
WHERE E.FIRST_NAME!=C.FIRST_NAME;

--DISPLAY EMPLYESS THAT GOT HIRED ON THE SAME DATE




