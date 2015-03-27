USE mysql;
DROP DATABASE IF EXISTS iKnow;
CREATE DATABASE iKnow;
USE iKnow;

grant all on `iKnow`.* to 'vsdb'@'localhost' identified by 'password';

CREATE TABLE Beitrag (
 titel VARCHAR(255) NOT NULL,
 inhalt TEXT
)ENGINE=INNODB;

ALTER TABLE Beitrag ADD CONSTRAINT PK_Beitrag PRIMARY KEY (titel);


CREATE TABLE Tag (
 stichwort VARCHAR(255) NOT NULL
)ENGINE=INNODB;

ALTER TABLE Tag ADD CONSTRAINT PK_Tag PRIMARY KEY (Stichwort);

CREATE TABLE verbunden(
	titel VARCHAR(255),
	stichwort VARCHAR(255),
	PRIMARY KEY(title,stichwort),
	FOREIGN KEY(titel) REFERENCES Beitrag(titel)
		ON UPDATE CASCADE ON DELETE CASCADE,
	FOREIGN KEY(stichwort) REFERENCES Tag(stichwort)
		ON UPDATE CASCADE
		ON DELETE CASCADE
)ENGINE=INNODB;

