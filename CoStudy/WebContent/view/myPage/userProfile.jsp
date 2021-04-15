<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width", initial-scale="1">
<jsp:include page="../common/header.jsp"></jsp:include>
<link rel="stylesheet" href="../css/myPage/myPage.css">
<link rel="stylesheet" href="../bootstrap-icons/font/bootstrap-icons.css">
<title>Insert title here</title>

</head>
<body>

		<section class="container col-lg-12">
			<div class="row">
				<div class="col-lg-3 bg-secondary m-5 text-center">
						<nav id="side_left" class="my-auto">
							<ul class="list-unstyled ">
								<li class="p-1"><a href="/CoStudy/myPage/studyDiaryListAction.do">공부일기</span>&nbsp;&nbsp;<i class="bi bi-journal-check fs-1"></i></a></li>
								<li class="p-1"><a href="/CoStudy/myPage/scheduleListAction.do">일정관리&nbsp;&nbsp; <i class="bi bi-calendar-month fs-1"></i></a></li>
								<li class="p-1"><a href="#">1:1 채팅목록&nbsp;&nbsp;<i class="bi bi-chat-square-quote fs-1"></i></a></li>
								<li class="p-1"><a href="/CoStudy/myPage/joinGroupListAction.do">참가 그룹 목록&nbsp;&nbsp;<i class="bi bi-chat-quote fs-1"></i></a></li>
								<li class="p-1"><a href="/CoStudy/myPage/categoryUpdateFormAction.do">관심 분야 수정&nbsp;&nbsp;<i class="bi bi-pencil-fill fs-1"></i></a></li>
								<li class="p-1"><a href="/CoStudy/myPage/userUpdateFormAction.do">회원 정보 수정&nbsp;&nbsp;<i class="bi bi-pencil-square fs-1"></i></a></li>
								<li class="p-1"><a href="/CoStudy/myPage/applyQuitUserCheckFormAction.do">회원 탈퇴 신청&nbsp;&nbsp;<i class="bi bi-x-circle fs-1"></i></a></li>
							</ul>
						</nav>
				</div>
				<div class="col-8" id="contents">
					<h3>My Profile</h3>
					<hr style="width:800px;" class="text-primary">
					<div class="row">
						<div class="bg-white col-4 border border-primary my-auto text-center">
								<h4>CoStudy Profile</h4>
								<i class="bi bi-person-square fs-1"></i><br>
								<b>NickName : CoStudy</b>
						</div>
						<div class="bg-white col-6 border border-primary p-0 m-4">
							<h4>Infomation</h4>
							<label>
							<p class="m-0 p-1">아이디</p> ${sessionScope.user.user_id}
							</label>
							<br>
							<label>
							<p class="m-0 p-1">생년월일</p> ${sessionScope.user.user_birth}
							</label>
							<br>
							<label>
							<p class="m-0 p-1">이름</p> ${sessionScope.user.user_lastName}${sessionScope.user.user_firstName}
							</label>
							<br>
							<label>
							<p class="m-0 p-1">휴대전화 번호</p>${sessionScope.user.user_phoneNo }
							</label>
							<br>
							<label>
							<p class="m-0 p-1">주소</p> ${sessionScope.user.user_address1}${sessionScope.user.user_address2}
							</label>
							<br>
							<label>
							<p class="m-0 p-1">이메일 주소</p> ${sessionScope.user.user_email }
							</label>
							<br>
							<label>
							<p class="m-0 p-1">	가입일</p>  ${sessionScope.user.user_register_date }
							</label>

						</div>
					</div>
					
					
				</div>
			</div>
		</section>		

	<jsp:include page="/view/common/footer.jsp"></jsp:include> 
</body>
</html>