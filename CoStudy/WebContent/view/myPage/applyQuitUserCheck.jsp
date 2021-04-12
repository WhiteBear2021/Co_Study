<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<section>

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
	   		
	   	<h2>본인 확인</h2>
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
	</section>

</body>
</html>