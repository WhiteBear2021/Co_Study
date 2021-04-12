<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="../../css/managerstyle.css">
<link rel="stylesheet" href="../../css/button.css">

<style>
body {
	background-color: #3D5A5B;
}

.pcoded-navbar.menu-light.theme-horizontal .pcoded-inner-navbar>li.active a,
	.pcoded-navbar.menu-light.theme-horizontal .pcoded-inner-navbar>li.pcoded-trigger a,
	.pcoded-navbar.menu-light.theme-horizontal .pcoded-inner-navbar>li:hover a
	{
	color: #3D5A5B;
	background: transparent;
}
</style>
<body class="">

	<nav class="pcoded-navbar menu-light ">
		<div class="navbar-wrapper  ">
			<div class="navbar-content scroll-div ">

				<div class="">
					<div class="main-menu-header">
						<img class="img-radius" alt="User-Profile-Image">
						<div class="user-details">
							<div id="more-details">
								관리자 <i class="fa fa-caret-down"></i>
							</div>
						</div>
					</div>
					<div class="collapse" id="nav-user-link">
						<ul class="list-unstyled">
							<li class="list-group-item"><a href="#"><i
									class="feather icon-user m-r-5"></i>정보 수정</a></li>
							<li class="list-group-item"><a href="#"><i
									class="feather icon-settings m-r-5"></i>정보수정</a></li>
							<li class="list-group-item"><a href="#"><i
									class="feather icon-log-out m-r-5"></i>로그아웃</a></li>
						</ul>
					</div>
				</div>

				<ul class="nav pcoded-inner-navbar ">

					<li class="nav-item pcoded-hasmenu"><a href="#!"
						class="nav-link "><span class="pcoded-micon"><i
								class="feather icon-layout"></i></span><span class="pcoded-mtext">디자인
								관리</span></a>
						<ul class="pcoded-submenu">
							<li><a href="#" target="_blank">배너 이미지 변경</a></li>
							<li><a href="#" target="_blank">이미지 편집</a></li>
						</ul></li>
					<li class="nav-item pcoded-hasmenu"><a href="#"
						class="nav-link "><span class="pcoded-micon"><i
								class="feather icon-layout"></i></span><span class="pcoded-mtext">사용자
								관리</span></a>
						<ul class="pcoded-submenu">
							<li><a href="userInfo.do" target="_blank">전체 회원 리스트</a></li>
							<li><a href="#" target="_blank">통계_회원</a></li>
							<li><a href="#" target="_blank">새로운 회원</a></li>
						</ul></li>
					<li class="nav-item pcoded-hasmenu"><a href="#"
						class="nav-link "><span class="pcoded-micon"><i
								class="feather icon-layout"></i></span><span class="pcoded-mtext">공지사항
								관리</span></a>
						<ul class="pcoded-submenu">
							<li><a href="/CoStudy/Notice/noticeInfoAction"
								target="_blank">공지사항 리스트</a></li>
							<li><a href="/CoStudy/Notice/noticeAction" target="_blank">공지사항
									등록</a></li>

						</ul></li>
					<li class="nav-item pcoded-hasmenu"><a href="#!"
						class="nav-link "><span class="pcoded-micon"><i
								class="feather icon-layout"></i></span><span class="pcoded-mtext">자주묻는질문
								관리</span></a>
						<ul class="pcoded-submenu">
							<li><a href="#" target="_blank">자주묻는질문 리스트</a></li>
							<li><a href="#" target="_blank">자주묻는질문 등록</a></li>

						</ul></li>

					<li class="nav-item"><a href="/CoStudy/Qna/QnaInfoAction" class="nav-link "><span
							class="pcoded-micon"><i class="feather icon-home"></i></span><span
							class="pcoded-mtext">1:1 문의 관리</span></a></li>
							
							
					<li class="nav-item pcoded-hasmenu"><a href="#!"
						class="nav-link "><span class="pcoded-micon"><i
								class="feather icon-layout"></i></span><span class="pcoded-mtext">스터디그룹
								관리</span></a>
						<ul class="pcoded-submenu">
							<li><a href="#" target="_blank">스터디그룹 리스트</a></li>
							<li><a href="#" target="_blank">통계_스터디그룹</a></li>

						</ul></li>

					<li class="nav-item"><a href="#" class="nav-link "><span
							class="pcoded-micon"><i class="feather icon-home"></i></span><span
							class="pcoded-mtext">신고 관리</span></a></li>
				</ul>



			</div>
		</div>
	</nav>
	<header
		class="navbar pcoded-header navbar-expand-lg navbar-light header-blue">


		<div class="m-header">
			<a class="mobile-menu" id="mobile-collapse" href="#!"><span></span></a>
			<a href="#!" class="b-brand"> </a> <a href="#!" class="mob-toggler">
				<i class="feather icon-more-vertical"></i>
			</a>
		</div>


	</header>

	<div class="pcoded-main-container">
		<div class="pcoded-content">
			<div class="page-header">
				<div class="page-block">
					<div class="row align-items-center">
						<div class="col-md-12">
							<div class="page-header-title">
								<h5 class="m-b-10">공지사항</h5>
							</div>
							<ul class="breadcrumb">
								<li class="breadcrumb-item"><a href="#"><i
										class="feather icon-home"></i></a></li>
								<li class="breadcrumb-item"><a href="#!">Main</a></li>
								<li class="breadcrumb-item"><a href="#!">Main</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>


			<div class="row">
				<!--여기에다가만들기  -->
			</div>

		</div>
	</div>

</body>
<script src="../../js/vendor-all.min.js"></script>
<script src="../../js/plugins/bootstrap.min.js"></script>
<script src="../../js/ripple.js"></script>
<script src="../../js/pcoded.min.js"></script>

<!-- Apex Chart -->
<script src="../../js/plugins/apexcharts.min.js"></script>


<!-- custom-chart js -->

<script src="../../js/pages/dashboard-main.js"></script>
<script src="../../js/pages/button.js"></script>
</html>