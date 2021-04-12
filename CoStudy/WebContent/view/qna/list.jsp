<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="insertForm.do">글작성</a>
	<table border="1">
		<tr>
			<td>글번호</td>
			<td>이미지</td>
			<td>글제목</td>
			<td>작성자</td>
			<td>작성일자</td>
			<td>조회수</td>
		</tr>

		<c:forEach var="qna" items="${list }">
			<tr>
				<td>${qna.qna_no }</td>
				<td>${qna.parentNo }</td>
				
		<c:when test="${qna.parentNo > 1}">
			<c:choose>
				<c:when test="${qna.parentNo > 1}">
					
				
				</c:when>
			
			
			</c:choose>
		
		</c:when>
				
				
				
				<td>${qna.qna_title }</td>
				<td>${qna.qna_content }</td>
				<td>${qna.writedate }</td>
				<td>${qna.user_no }</td>
			</tr>
		</c:forEach>

	</table>
	<br>
	<br>

	


</body>
</html>