<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width", initial-scale="1">

<title>Insert title here</title>

<body>

	<section id="wrap">
			<nav>
	   			<ul>
	                <li><a href="/CoStudy/myPage/studyDiaryListAction.do">공부일기 아이콘1</a></li>
	                <li><a href="/CoStudy/myPage/scheduleListAction.do">일정관리 아이콘2</a></li>
	                <li><a href="#">1:1 채팅목록 아이콘3</a></li>
	                <li><a href="/CoStudy/myPage/joinGroupListAction.do">참가 그룹 목록 아이콘4</a></li>
	                <li><a href="/CoStudy/myPage/categoryUpdateFormAction.do">관심 분야 수정 아이콘5</a></li>
	                <li><a href="/CoStudy/myPage/userUpdateFormAction.do">회원 정보 수정 아이콘6</a></li>
	                <li><a href="/CoStudy/myPage/applyQuitUserCheckFormAction.do">회원 탈퇴 신청 아이콘7</a></li>
	   			</ul>
	   		</nav>
	   		<article id="study-list">
				   			<a href="studyDiaryFormAction.do">Study Diary 작성하러 가기</a>
				   			<h3>Study Diary List</h3>
							<ul>
								<li>글번호</li>
								<li>제목/키워드</li>
								<li>파일</li>
								<li>작성날짜</li>
							</ul>
							<c:forEach var="diary" items="${studyNoteList}">
								<ul>
									<li>${dairy.studyNote_no}</li>
									<li>${dairy.studyNote_keyword}</li>
									<li>${dairy.studyNote_file}</li>
									<li>${dairy.user_no}</li>				
								</ul>
							</c:forEach>
	   		</article>
	</section>
</body>
</html>