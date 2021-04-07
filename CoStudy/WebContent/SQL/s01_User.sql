DROP TABLE userInfo;
create table userInfo(
  user_no Number primary key,
  category_no varchar2(18),
  user_id varchar2(20),
  user_pw varchar2(20),
  user_lastname varchar2(20),
  user_firstname varchar2(20),
  user_phoneno varchar2(20),
  user_post varchar2(10),
  user_address1 varchar2(100),
  user_address2 varchar2(200),
  user_birth Date,
  user_email varchar2(50),
  user_register_date Date);
  
insert into userInfo values('1','cate01','kosta211','k1234','Ko','sta','010-1234-5678','07420','GumCheon','GaSan',to_date('20210406','yyyymmdd'),'kosat@gmail.com',sysdate);

COMMIT;

SELECT * FROM userinfo;