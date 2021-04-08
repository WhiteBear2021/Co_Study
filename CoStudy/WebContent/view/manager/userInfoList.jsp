<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원목록</title>
</head>
<body>
<table border = "1">
		<tr>
			<td>회원번호</td>
			<td>아이디</td>
			<td>비밀번호</td>
			<td>성</td>
			<td>이름</td>
			<td>전화번호</td>
			<td>우편번호</td>
			<td>생년월일</td>
			<td>이메일</td>
			<td>등록일</td>
			<!-- <td>작성자</td>
			<td>작성일자</td>
			<td>조회수</td> -->
		</tr>
		<c:forEach var="user" items="${list }">
		<tr>	
			<td>${user.user_no }</td>	
			<td>${user.user_id}</td>
			<td>${user.user_pw}</td>
			<td>${user.user_lastName}</td>
			<td>${user.user_firstName}</td>
			<td>${user.user_phoneNo}</td>
			<td>${user.user_post}</td>
			<td>${user.user_birth}</td>
			<td>${user.user_email}</td>
			<td>
				<fmt:parseDate var="dt" value="${user.user_register_date }" pattern="yyyy-MM-dd"/>
				<fmt:formatDate value="${dt }" pattern="yyyy/MM/dd"/>
			</td>			
		</tr>
		</c:forEach>
	</table>
</body>
</html>