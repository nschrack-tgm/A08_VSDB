USE mysql;
DROP DATABASE IF EXISTS iKnow;
CREATE DATABASE iKnow;
USE iKnow;

DROP USER 'vsdb'@'localhost';
grant all on `iKnown`.* to 'vsdb'@'localhost' identified by 'password';
