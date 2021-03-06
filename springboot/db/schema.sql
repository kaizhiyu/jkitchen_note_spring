DROP TABLE USER;
DROP TABLE STUDENT;

CREATE TABLE IF NOT EXISTS USER
(
    ID         INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    USERNAME   VARCHAR(100),
    EMAIL      VARCHAR(1),
    BALANCE    DOUBLE,
    CREATETIME DATE DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS STUDENT
(
    ID       INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    NAME     VARCHAR(100),
    SUMSCORE VARCHAR(100),
    AVGSCORE VARCHAR(100),
    AGE      INT
);
