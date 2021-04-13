<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
				   			<a href="studyDiaryFormAction.do">Study Diary 작성하러 가기</a>
				   			<h3>Study Diary List</h3>
				   			<hr style="width:800px">
							<ul>
								<li>글번호</li>
								<li>제목/키워드</li>
								<li>파일</li>
								<li>작성날짜</li>
							</ul>
							<c:forEach var="diary" items="${studyNoteList}">
								<ul>
									<li>${diary.studyNote_no}</li>
									<li>${diary.studyNote_keyword}</li>
									<li>${diary.studyNote_file}</li>
									<li>${diary.user_no}</li>				
								</ul>
							</c:forEach>
	   			</div>
	   		</div>
	
</body>
</html>