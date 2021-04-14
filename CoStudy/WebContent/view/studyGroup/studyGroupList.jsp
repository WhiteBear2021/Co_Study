<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<jsp:include page="../common/header.jsp"></jsp:include><hr>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="makeGroupFormAction.do">방 만들기</a>
	<table border="1">
		<tr>
			<td>번호</td>
			<td>스터디 이름</td>
			<td>작성날자</td>
			<td>카테고리</td>
			<td>지역</td>
			<td>현재인원</td>
			<td>최대인원</td>
		</tr>
		<c:forEach var="studyGroup" items="${studyGroupList }">
			<tr>
				<td><a href="studyGroupDetailAction.do?studygroup_no=${studyGroup.studygroup_no }">${studyGroup.studygroup_no }</a></td>
				<td>${studyGroup.studygroup_name }</td>
				<td>${studyGroup.made_date }</td>
				<td>${studyGroup.categori_no }</td>
				<td>${studyGroup.studygroup_location }</td>
				<td>${studyGroup.current_user_number }</td>
				<td>${studyGroup.max_user_number }</td>				
			</tr>
		</c:forEach>
	</table>
	
	<!-- 페이지 영역 -->
	<!-- 이전 영역 -->
	<c:if test="${studyGroupListVO.startPage > 5 }">
		<a href="stduyGroupListAction.do?pageNum=${studyGroupListVO.startPage -1 }">[이전]</a>
	</c:if>
	
	<!-- 페이지 목록 -->
	<c:forEach var="pageNO" begin="${studyGroupListVO.startPage }" end="${studyGroupListVO.endPage }">
		<c:if test="${studyGroupListVO.requestPage == pageNo }"><b></c:if>
		<a href="studyGroupListAction.do?pageNum=${pageNo }">[${pageNo }]</a>
		<c:if test="${studyGroupListVO.requestPage == pageNo }"></b></c:if>
	</c:forEach>
	
	<!-- 이후 영역 -->
	<c:if test="${studyGroupListVO.endPage < studyGroupListVO.totalPageCount }">
		<a href="studyGroupListAction.do?pageNum=${studyGroupListVO.endPage +1 }">[이후]</a>
	</c:if>
	
	
	
	
	
	
</body>
<jsp:include page="../common/footer.jsp"></jsp:include> 
</html>