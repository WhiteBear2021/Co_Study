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
	        <form action="makeGroupAction.do">
	        	<label>
	        	그룹 이름 : 
	        	<input type="text" name="studygroup_name">
	        	</label><br>
	        	<label>
	        	 그룹 소개 : 
	        	<input type="text" name="studygroup_info">
	        	</label><br>
	        	<label>
	        	그룹 지역 :
	        	<input type="text" name="studygroup_location ">
	        	</label><br>
	        	<label>
	        	 누적 신고수 : 
	        	<input type="text" name="report_number">
	        	</label><br>
	        	<label>
	        	최대인원 :	
	        	<input type="text" name="max_user_number">
	        	</label><br>
	        	<label>
	        	대면여부 :  
	        	<input type="radio" name="isface" value="Y">대면
	        	<input type="radio" name="isface" value="N">비대면
	        	</label><br>
	        	<label>
	        	카테고리 : 
	        	<input type="text" name="categori_no">
	        	</label><br>
	        	<label>
	        	<input type="hidden" name="user_no" value="1">
	        	</label><br>
	        	<input type="submit" value="그룹만들기">
	        </form>
	        <br>
	        
	        <br>
	       
	        <br>
	        
	        <br>
	       
	        <br>
	        
	        <br>
	        
	        <br>
	        
	        <br>
	        
	        <br>
	       
	        <br>
	    </div>
	</div>
</body>
</html>