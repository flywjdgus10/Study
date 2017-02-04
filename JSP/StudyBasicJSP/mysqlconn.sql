insert into member
values('AA@naver.com','123','abc',now());
insert into member
values('BB@naver.com','1234','abcd',now());
insert into member
values('CC@naver.com','12345','abcde',now());

SELECT * from member

select * from member where id='AA@naver.com';

SELECT id, passwd FROM member WHERE id='AA@naver.com';

update member set passwd='3579' where id ='AA@naver.com'

DELETE from member WHERE id='BB@naver.com';
DELETE from member WHERE id='CC@naver.com'

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

SHOW TABLES
SELECT * FROM board