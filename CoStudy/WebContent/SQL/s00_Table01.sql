
insert into category values(1,'IT');  
insert into user_Info values(1,'kosta211','k1234','Ko','sta','010-1234-5678','07420',to_date('20210406','yyyymmdd'),'kosat@gmail.com',1,'GumCheon','GaSan',sysdate);

COMMIT;

SELECT * FROM user_info;