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
		                <li><a href="#">1:1 채팅목록 아이콘</a></li>
		                <li><a href="/CoStudy/myPage/joinGroupListAction.do">참가 그룹 목록 아이콘</a></li>
		                <li><a href="/CoStudy/myPage/categoryUpdateFormAction.do">관심 분야 수정 아이콘</a></li>
		                <li><a href="/CoStudy/myPage/userUpdateFormAction.do">회원 정보 수정 아이콘</a></li>
		                <li><a href="/CoStudy/myPage/applyQuitUserCheckFormAction.do">회원 탈퇴 신청 아이콘</a></li>
		   			</ul>
		   		</nav>
	   		<div id="contents">
			   	<h3>본인 확인 Check</h3>
			   	<hr style="width:800px">
			    <p>회원 정보 확인을 위하여 비밀번호를 입력하세요</p>
			    <p>${sessionScope.user.user_id}</p>
			    <form action="applyQuitUser" method="post">
				    비밀번호 : <input type="password" name="user_pw"><br>
				    <input type="checkbox" id="showPW">비밀번호표시
				    <br>
				    <a href="#">비밀번호 찾기</a><br>
				    <input type="reset" value="cancel">
				    <input type="submit" value="submit">
			    </form>
			</div>
		</div>
</body>
</html>