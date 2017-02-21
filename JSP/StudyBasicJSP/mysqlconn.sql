/*
SHOW TABLES

CREATE table board(
	num int not null PRIMARY KEY AUTO_INCREMENT,
	writer varchar(10) not null,
	email varchar(30) ,
	subject varchar(50) not null,
	passwd varchar(12) not null,
	reg_date DATETIME not null,
	readcount int default 0,
	ref int not null,
	re_step smallint not null,
	re_level smallint not null,
	content text not null,
	ip varchar(20) not null
);

SELECT * FROM board
SELECT COUNT(*) FROM board

DELETE FROM board
DELETE from member WHERE id='CC@naver.com'

insert into member
values('AA@naver.com','123','abc',now());

update member set passwd='3579' where id ='AA@naver.com'

ALTER TABLE member
ADD address VARCHAR(100) NOT NULL;
ALTER Table cart MODIFY Column book_image VARCHAR(16) DEFAULT 'nothing.jpg'


SHOW COLUMNS FROM book LIKE 're_date'

*/
SHOW TABLES
SELECT * FROM book
INSERT INTO manager VALUES('flywjdgus10','wjd1470');






















