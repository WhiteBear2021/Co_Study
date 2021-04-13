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
			   		<h3>참여 그룹 목록</h3>
					<hr style="width:800px">
			   		<table border="1">
			   				<tr>
			   					<td>스터디그룹번호</td>
			   					<td>스터디그룹이름</td>
			   					<td>스터디그룹정보</td>
			   					<td>스터디그룹위치</td>
			   					<td>등록일</td>
			   				</tr>
			  				<c:forEach var="studyGroup" items="${joinGroupList}">
								<tr>
									<td>${studyGroup.studygroup_no }</td>
									<td>${studyGroup.studygroup_name }</td>
									<td>${studyGroup.studygroup_info }</td>
									<td>${studyGroup.studygroup_location }</td>
									<td>${studyGroup.made_date }</td>		
								</tr>
							</c:forEach>
			   			</table>
			   		</div>
				</div>
</body>
</html>