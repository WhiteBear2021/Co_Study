<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="noticeAction">글작성</a>
	<table border="1">
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>내용</td>
			<td>작성닐자</td>
			<td>관리자번호</td>
		</tr>
		<c:forEach var="notice" items="${list }">
			<tr>
				<td>${notice.notice_no }</td>
				<td>${notice.notice_title }</td>
				<td>${notice.notice_content }</td>
				<td>${notice.notice_date }</td>
				<td>${notice.manager_no }</td>				
			</tr>
		</c:forEach>
	</table>
</body>
</html>