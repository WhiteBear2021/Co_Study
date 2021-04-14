<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width", initial-scale="1">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/myPage/myPage.css">
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
		        <h3>My Profile</h3>
		        <hr style="width:800px">
		        <div class="form-group">
					<form action="userUpdateAction.do" method="post">
					        <input type="hidden" name="user_no" value="${user.user_no}">
					        <label>
					        	아이디 : ${sessionScope.user.user_id}
					        </label><br>
					        <label>
					        	비밀번호 : <input type="password" name="user_pw" value="${sessionScope.user.user_pw}">
					        </label><br>
					        <label>
					        	생년월일 : ${sessionScope.user.user_birth}
					        </label><br>
					        <label>
					        	  성 : <input type="text" name="user_lastName" value="${sessionScope.user.user_lastName}"> 이름 : <input type="text" name="user_firstName" value="${sessionScope.user.user_firstName}">
					        </label><br>
					        <label>
					        	 휴대전화 번호 : <input type="text" name="user_phoneNo" value="${sessionScope.user.user_phoneNo}">
					        </label><br>
					        <label>
					        	우편번호 : <input type="text" name="user_post" value="${sessionScope.user.user_post }">
					        </label><br>
					        <label>
					        	 주소 : <input type="text" name="user_address1" value="${sessionScope.user.user_address1 }">
					        </label><br>
					        <label>
					        	  상세주소 : <input type="text" name="user_address2" value="${sessionScope.user.user_address2}">
					        </label><br>
					        <label>
					        	  이메일주소 : <input type="text" name="user_email" value="${sessionScope.user.user_email }">
					        </label><br>
					        <label>
					        	  가입일 : <input type="text" name="user_register_date" value="${sessionScope.user.user_register_date}">
					        </label><br>
							<input type="submit" value="수정"></button>
							<input type="reset" value="취소"></button>
				        </form>
			        </div>
		        </div>
	        </div>


</body>
</html>