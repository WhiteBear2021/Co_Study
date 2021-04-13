<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<h3>글쓰기</h3>
<hr>
<form action="noticeCreateAction.do" method="post" enctype="multipart/form-data">
	<input type="hidden" name="manager_no" value=1>
	제목 : <input type="text" name="notice_title"><br>
	내용 <br>
	<textarea rows="6" cols="70" name="notice_content"></textarea>
	<br>
	<input type="submit" value="등록">
</form>

</body>
</html>