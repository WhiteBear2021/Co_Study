<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width" , initial-scale="1">
<link rel="stylesheet" href="../css/myPage/myPage.css">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../common/header.jsp"></jsp:include><hr>
	<div id="wrap">
		<nav id="side_left">
			<ul>
				<li><a href="/CoStudy/myPage/studyDiaryListAction.do">공부일기
						아이콘</a></li>
				<li><a href="/CoStudy/myPage/scheduleListAction.do">일정관리
						아이콘</a></li>
				<li><a href="#">1:1 채팅목록 아이콘</a></li>
				<li><a href="/CoStudy/myPage/joinGroupListAction.do">참가 그룹
						목록 아이콘</a></li>
				<li><a href="/CoStudy/myPage/categoryUpdateFormAction.do">관심
						분야 수정 아이콘</a></li>
				<li><a href="/CoStudy/myPage/userUpdateFormAction.do">회원 정보
						수정 아이콘</a></li>
				<li><a href="/CoStudy/myPage/applyQuitUserCheckFormAction.do">회원
						탈퇴 신청 아이콘</a></li>
			</ul>
		</nav>
		<div id="contents">
			<h3>참여 그룹 목록</h3>
			<hr style="width: 800px">
			<table>

				<c:forEach var="studyGroup" items="${joinGroupList}">
					<tr>
						<td>그룹번호 : 
						 <a
							href="/CoStudy/groupPage/groupBoardList.do?studygroup_no=${studyGroup.studygroup_no }">${studyGroup.studygroup_no }</a>
							<hr> ${studyGroup.studygroup_name }<br>
							${studyGroup.studygroup_info }<br>
							${studyGroup.studygroup_location }<br>
							${studyGroup.made_date }
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
>>>>>>> branch 'GY' of https://github.com/WhiteBear2021/Co_Study.git
</html>