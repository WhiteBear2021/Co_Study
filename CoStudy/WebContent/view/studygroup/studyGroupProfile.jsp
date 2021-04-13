<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width", initial-scale="1">
<link rel="stylesheet" type="text/css" href="../../bootstrap/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="../../css/studygroup.css">
<title>Insert title here</title>
</head>
<body>
   	<div class="container">	
   		<ul class="nav navbar-nav navbar-left">
   			<ul>
   			</ul>
   		</ul>
	    <div class="form-group studygroupUpdate">
	        <h3>StudyGroup 만들기</h3>
	        <input type="hidden" name="studygroup_no" value="${studygroup.studygroup_no}">
	       	그룹 번호 :  ${studygroup.studygroup_no}
	        <br>
	        그룹 이름 : ${studygroup.studygroup_name}
	        <br>
	        그룹 소개 : ${studygroup.studygroup_info}
	        <br>
	        그룹 지역 :${studygroup.studygroup_location }
	        <br>
	        누적 신고수 : ${studygroup.report_number }
	        <br>
	        최대인원 :	${studygroup.max_user_number }
	        <br>
	        현재인원 : ${studygroup.current_user_number }
	        <br>
	        만든 날짜 : ${studygroup.made_date }
	        <br>
	        대면여부 : ${studygroup.isface }
	        <br>
	        카테고리 : ${studygroup.categori_no }
	        <br>
	        방장 번호 : ${studygroup.user_no }
	        <br>
	        해시태그 : ${studygroup.hashtag }
	    </div>
	</div>
</body>
</html>