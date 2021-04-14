<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width", initial-scale="1">
<link rel="stylesheet" href="../css/myPage/myPage.css">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../common/header.jsp"></jsp:include><hr> 
			<div id="wrap">
				<nav id="side_left">
		   			<ul>
		                <li><a href="/CoStudy/myPage/studyDiaryListAction.do">공부일기 아이콘</a></li>
		                <li><a href="/CoStudy/myPage/scheduleListAction.do">일정관리 아이콘</a></li>
		                <li><a href="#">1:1 채팅목록 아이콘3</a></li>
		                <li><a href="/CoStudy/myPage/joinGroupListAction.do">참가 그룹 목록 아이콘</a></li>
		                <li><a href="/CoStudy/myPage/categoryUpdateFormAction.do">관심 분야 수정 아이콘</a></li>
		                <li><a href="/CoStudy/myPage/userUpdateFormAction.do">회원 정보 수정 아이콘</a></li>
		                <li><a href="/CoStudy/myPage/applyQuitUserCheckFormAction.do">회원 탈퇴 신청 아이콘</a></li>
		   			</ul>
		   		</nav>
	   			<div id="contents">
		   			<h3>공부일기 쓰기</h3>
		   			<hr style="width:800px">
		   			<div id="diary-form">
			   			<form action="studyDiaryAction.do">
			   					<input type="hidden" name="user_no" value="${sessionScope.user.user_no}">
			   					<label>
			   					키워드 : <input type="text" name="studyNote_keyword">
			   					</label><br>
			   					<label>
			   					글내용 :
			   					<textarea rows="10" cols="50" name="studyNote_content"></textarea> 
			   					</label><br>
			   					<label>
			   					파일 : <input type="file" name="studyNote_file"> 
			   					</label><br>
			   					<input type="submit" value="글작성">
				   			</form>
				   		</div>
			   		</div>
		   		</div>

</body>
</html>