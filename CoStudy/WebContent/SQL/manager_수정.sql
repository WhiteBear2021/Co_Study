create table manager_qna(
  qna_no number PRIMARY KEY,--번호
  qna_title VARCHAR2(100),--제목
  qna_content VARCHAR2(500),--내용
  regdate DATE,--작성날짜
  parentNo number DEFAULT 0,--부보번호 qna_no이 3이면 3
  ISREAD NUMBER DEFAULT 0,--읽음 여부 
  levels NUMBER DEFAULT 1,--깊이
   USER_NO number,--회원 번호
   MANAGER_NO number--관리자 번호
);
  
CREATE SEQUENCE seq_m_qna_no
START WITH 1
INCREMENT BY 1;


--공지사항 데이터
insert into notice values(notice_no.nextval,'[공지] 고객센터 일부 서비스의 일시 중단 안내','회원님들께 보다 나은 서비스를 제공해드리고자
한 달 동안 고객 상담 시스템을 재정비하고, 더불어 내부적인 개선 작업을 진행할 예정입니다.

이에 따라 아래와 같이 고객센터 일부 서비스를 일시 중단하오니 양해 부탁드립니다.',sysdate,1);
insert into notice values(seq_notice.nextval,'[공지] 고객센터 일부 서비스의 일시 중단 안내','회원님들께 보다 나은 서비스를 제공해드리고자
한 달 동안 고객 상담 시스템을 재정비하고, 더불어 내부적인 개선 작업을 진행할 예정입니다.

이에 따라 아래와 같이 고객센터 일부 서비스를 일시 중단하오니 양해 부탁드립니다.',sysdate,1);

insert into notice values(seq_notice.nextval,'메시지 알림 보관 기간이 변경됩니다.','메시지 알림의 보관 기간이 아래와 같이 변경될 예정입니다.
관련 내용을 사전에 안내해드리니, 꼭! 확인해 주시기를 바랍니다.',sysdate,1);

insert into notice values(seq_notice.nextval,'[업데이트] iOS 앱 v5.5.0 / 안드로이드 앱 v5.2.15','업데이트에 관한 자세한 내용은 아래의 안내를 참고해 주세요.',sysdate,1);

insert into notice values(seq_notice.nextval,'개인정보처리방침 변경 안내','개인정보취급방침이 아래와 같이 일부 개정되었음을 안내드립니다.

자세한 정보는 하단에 기재해드린 내용을 참고해 주시기 바랍니다.',sysdate,1);

insert into notice values(seq_notice.nextval,'서비스 검색 기능이 업데이트 되었습니다.','원하는 서비스를 더욱 편리하고 정확하게 검색·비교하실 수 있도록, ?서비스 검색 기능?이 업데이트 되었습니다.

자세한 내용은 하단의 안내를 참고해 주세요.

 ',sysdate,1);
 
 insert into notice values(seq_notice.nextval,' iOS 앱 v10.x 서비스 종료','모바일 앱 iOS 10.x 버전의 지원을 종료할 예정입니다.
관련 내용을 사전에 안내해드리니, 꼭! 확인해주세요. ',sysdate,1);

insert into notice values(seq_notice.nextval,'계정 보호 및 보안 기능에 대해 안내 드립니다.','지만 피싱 사이트 또는 악성코드에 감염된 단말기 등을 통해 아이디, 비밀번호가 유출되거나 보안이 약한 일부 사이트에서 아이디, 비밀번호가 유출되면 동일한 정보로 가입한 다른 사이트에서도 연달아 피해가 발생할 수 있습니다. 네이버는 아이디와 비밀번호가 유출되더라도 네이버에서 제공하는 여러 보안 기능을 이용하여 타인의 로그인을 차단하거나, 중요한 자료를 안전하게 보호하여 피해를 예방할 수 있도록 조치하고 있습니다.',sysdate,1);

insert into notice values(seq_notice.nextval,'계정 보호 및 보안 기능에 대해 안내 드립니다.','공하지만 피싱 사이트 또는 악성코드에 감염된 단말기 등을 통해 아이디, 비밀번호가 유출되거나 보안이 약한 일부 사이트에서 아이디, 비밀번호가 유출되면 동일한 정보로 가입한 다른 사이트에서도 연달아 피해가 발생할 수 있습니다. 네이버는 아이디와 비밀번호가 유출되더라도 네이버에서 제공하는 여러 보안 기능을 이용하여 타인의 로그인을 차단하거나, 중요한 자료를 안전하게 보호하여 피해를 예방할 수 있도록 조치하고 있습니다.',sysdate,1);
