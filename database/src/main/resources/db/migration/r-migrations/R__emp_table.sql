create table emp (
  empno    number(4, 0),
  ename    varchar2(10),
  job      varchar2(9),
  mgr      number(4, 0),
  hiredate date,
  sal      number(7, 2),
  comm     number(7, 2),
  deptno   number(2, 0),
  constraint pk_emp primary key (empno),
  constraint fk_deptno foreign key (deptno) references dept (deptno)
);

INSERT INTO ALEX581.EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES (7839, 'KING', 'PRESIDENT', null, TO_DATE('1981-11-17 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 5000.00, null, 10);
INSERT INTO ALEX581.EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES (7698, 'BLAKE', 'MANAGER', 7839, TO_DATE('1981-05-01 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 2850.00, null, 30);
INSERT INTO ALEX581.EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES (7782, 'CLARK', 'MANAGER', 7839, TO_DATE('1981-06-09 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 2450.00, null, 10);
INSERT INTO ALEX581.EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES (7566, 'JONES', 'MANAGER', 7839, TO_DATE('1981-04-02 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 2975.00, null, 20);
INSERT INTO ALEX581.EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES (7788, 'SCOTT', 'ANALYST', 7566, TO_DATE('1987-04-19 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 3000.00, null, 20);
INSERT INTO ALEX581.EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES (7902, 'FORD', 'ANALYST', 7566, TO_DATE('1981-12-03 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 3000.00, null, 20);
INSERT INTO ALEX581.EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES (7369, 'SMITH', 'CLERK', 7902, TO_DATE('1980-12-17 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 800.00, null, 20);
INSERT INTO ALEX581.EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES (7499, 'ALLEN', 'SALESMAN', 7698, TO_DATE('1981-02-20 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 1600.00, 300.00, 30);
INSERT INTO ALEX581.EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES (7521, 'WARD', 'SALESMAN', 7698, TO_DATE('1981-02-22 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 1250.00, 500.00, 30);
INSERT INTO ALEX581.EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES
  (7654, 'MARTIN', 'SALESMAN', 7698, TO_DATE('1981-09-28 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 1250.00, 1400.00, 30);
INSERT INTO ALEX581.EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES (7844, 'TURNER', 'SALESMAN', 7698, TO_DATE('1981-09-08 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 1500.00, 0.00, 30);
INSERT INTO ALEX581.EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES (7876, 'ADAMS', 'CLERK', 7788, TO_DATE('1987-05-23 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 1100.00, null, 20);
INSERT INTO ALEX581.EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES (7900, 'JAMES', 'CLERK', 7698, TO_DATE('1981-12-03 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 950.00, null, 30);
INSERT INTO ALEX581.EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES (7934, 'MILLER', 'CLERK', 7782, TO_DATE('1982-01-23 00:00:00', 'YYYY-MM-DD HH24:MI:SS'), 1300.00, null, 10);