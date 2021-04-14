<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="no-js" lang="zxx">
<head>
<meta charset="UTF-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- CSS here -->
<link rel="stylesheet" href="../../bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="../../css/main.css">
<link rel="stylesheet" href="../../css/flaticon.css">
<link rel="stylesheet" href="../../css/slicknav.css">
<link rel="stylesheet" href="../../css/fontawesome-all.min.css">
<link rel="stylesheet" href="../../css/style.css">
</head>

<body>
 
 <header>
	 <!-- Header Start -->
        <div class="header-area">
            <div class="main-header header-sticky">
                <div class="container-fluid">
                    <div class="menu-wrapper">
                         <!-- Logo -->
                        <div class="logo">
                            <a href="index.html">
                            	<img src="./img.png" alt="" style="max-width: 200px;">
                            </a>
                        </div> 
                        <!-- Main-menu -->
                        <div class="main-menu d-none d-lg-block">
                            <nav>  
                                <ul id="navigation">  
                                    <li>
                                    <a href="#">그룹 참가하기</a>
                                    </li>
                                    <li class="hot">
                                    <a href="#">그룹 만들기</a>
                                    </li>
                                    <li>
                                    <a href="#">마이페이지</a>
                                        <ul class="submenu">
                                            <li>
                                            <a href="/CoStudy/user/myPageAction.do">나의 프로필</a>
                                            </li>
                                            <li>
                                            <a href="/CoStudy/myPage/studyDiaryListAction.do">공부 일기</a>
                                            </li>
                                            <li>
                                            <a href="/CoStudy/myPage/scheduleListAction.do">일정 관리</a>
                                            </li>
                                            <li>
                                            <a href="/CoStudy/myPage/joinGroupListAction.do">1:1 채팅 목록</a>
                                            </li>
                                            <li>
                                            <a href="/CoStudy/myPage/joinGroupListAction.do">참가 그룹 목록</a>
                                            </li>

                                        </ul>
                                    </li>
                                    <li>
                                    <a href="#">고객지원</a>
                                        <ul class="submenu">
                                            <li>
                                            <a href="#">공지 사항</a>
                                            </li>
                                            <li>
                                            <a href="#">1:1 질문하기</a>
                                            </li>
                                            <li>
                                            <a href="#">자주하는 질문</a>
                                            </li>
                                             <li>
                                            <a href="#">신고하기</a>
                                            </li>
                                        </ul>
                                    </li>
                                </ul>
                            </nav>
                        </div>
                        <!-- Header Right -->
                        <div class="header-right">
                            <ul>
                                <li>
                                    
                                </li>
                                <li>
                                 <a href="#">
                                 <span class="flaticon-user">
                                 </span>
                                 </a>
                                 </li>
                                 <li> 
                                 <a href="#">
                                 <span class="flaticon-user">
                                 </span>
                                 </a>
                                 </li>
                                
                            </ul>
                        </div>
                    </div>
                    <!-- Mobile Menu -->
                    <div class="col-12">
                        <div class="mobile_menu d-block d-lg-none">
                        	<div class="slicknav_menu">
                        		<a href="#" aria-haspopup="true" role="button" tabindex="0" class="slicknav_btn slicknav_collapsed" style>
                        		<span class="slicknav_menutxt">MENU</span>
                        		<span class="slicknav_icon">
                        		<span class="slicknav_icon-bar"></span>
                        		<span class="slicknav_icon-bar"></span>
                        		<span class="slicknav_icon-bar"></span>
                        		<span class="slicknav_icon-bar"></span>
                        		</span>
                        		</a>
                        		<ul class="slicknav_nav slicknav_hidden" aria-hidden="true" role="menu" style="display: none;">  
                                    <li>
                                    <a href="#" role="menuitem" tabindex="-1">그룹 참가하기</a>
                                    </li>
                                    <li>
                                    <a href="#" role="menuitem" tabindex="-1">그룹 만들기</a>
                                    </li>
                                    <li class="hot slicknav_collapsed slicknav_parent">
                                    <a href="#" role="menuitem" aria-haspopup="true" tabindex="-1" class="slicknav_item slicknav_row" style>
                                    <a href="#" tabindex="-1">마이페이지</a>
                                        <span class="slicknav_arrow">+</span>
                                        </a>
                                        <ul class="submenu slicknav_hidden" role="menu" aria-hidden="true" style="display: none;">
                                            <li>
                                            <a href="#" role="menuitem" tabindex="-1">나의 프로필</a>
                                            </li>
                                            <li>
                                            <a href="#" role="menuitem" tabindex="-1">공부 일기</a>
                                            </li>
                                            <li>
                                            <a href="#" role="menuitem" tabindex="-1">일정 관리</a>
                                            </li>
                                            <li>
                                            <a href="#" role="menuitem" tabindex="-1">1:1 치탱 목록</a>
                                            </li>
                                            <li>
                                            <a href="#" role="menuitem" tabindex="-1">참가 그룹 목록</a>
                                            </li>
                                            <li>
                                            <a href="#" role="menuitem" tabindex="-1">관심분야 수정</a>
                                            </li>
                                            <li>
                                            <a href="#" role="menuitem" tabindex="-1">회원정보 수정</a>
                                            </li>
                                            <li>
                                            <a href="#" role="menuitem" tabindex="-1">회원 탈퇴 신청</a>
                                            </li>
                                        </ul>
                                    </li>
                                    <li class="slicknav_collapsed slicknav_parent">
                                    <a href="#" role="menuitem" aria-haspopup="true" tabindex="-1" class="slicknav_item slicknav_row" style>
                                    <a href="#" tabindex="-1">고객 지원</a>
                                        <span class="slicknav_arrow">+</span>
                                        </a>
                                        <ul class="submenu slicknav_hidden" role="menu" aria-hidden="true" style="display: none;">
                                            <li>
                                            <a href="#" role="menuitem" tabindex="-1">공지 사항</a>
                                            </li>
                                            <li>
                                            <a href="#" role="menuitem" tabindex="-1">1:1 질문하기</a>
                                            </li>
                                             <li>
                                            <a href="#" role="menuitem" tabindex="-1">자주하는 질문</a>
                                            </li>
                                             <li>
                                            <a href="#" role="menuitem" tabindex="-1">신고하기</a>
                                            </li>
                                        </ul>
                                    </li>
                                </ul>
                        	</div>
                    </div>
                </div>
            </div>
        </div>
     </div>
        <!-- Header End -->
    </header>

<!-- content -->

<div id="page-wrapper">
   <div  id="sidebar-wrapper">
       <ul class="sidebar-nav">
      <li class="sidebar-brand">
        <a href="#">내 스터디 그룹</a>
      </li>
      <li class="sidevar-item"><a href="#" class="sidevar-link">그룹 1</a></li>
      <li class="sidevar-item"><a href="#" class="sidevar-link">그룹 2</a></li>
      <li class="sidevar-item"><a href="#" class="sidevar-link">그룹 3</a></li>
      <li class="sidevar-item"><a href="#" class="sidevar-link">그룹 4</a></li>
    </ul>
  </div>



   <div id="demo" class="carousel slide" data-ride="carousel"> 
   <div class="carousel-inner">
    <!-- 슬라이드 쇼 --> 
    <div class="carousel-item active"> <!--가로-->
     <img class="d-block w-100" src="https://images.pexels.com/photos/213399/pexels-photo-213399.jpeg?auto=compress&cs=tinysrgb&h=650&w=940" alt="First slide"> 
     <div class="carousel-caption d-none d-md-block">
     
      </div> 
      </div> 
      <div class="carousel-item"> 
      <img class="d-block w-100" src="https://images.pexels.com/photos/2355519/pexels-photo-2355519.jpeg?auto=compress&cs=tinysrgb&dpr=3&h=750&w=1260" alt="Second slide"> </div> 
      <div class="carousel-item"> 
      <img class="d-block w-100" src="https://images.pexels.com/photos/2544554/pexels-photo-2544554.jpeg?auto=compress&cs=tinysrgb&h=650&w=940" alt="Third slide"> </div> 
      <!-- / 슬라이드 쇼 끝 -->
      
       <!-- 왼쪽 오른쪽 화살표 버튼 --> 
       <a class="carousel-control-prev" href="#demo" data-slide="prev"> 
       <span class="carousel-control-prev-icon" aria-hidden="true"></span> 
       <!-- <span>Previous</span> --> 
       </a> 
       <a class="carousel-control-next" href="#demo" data-slide="next"> 
       <span class="carousel-control-next-icon" aria-hidden="true"></span> 
       <!-- <span>Next</span> --> </a> 
       
       <!-- / 화살표 버튼 끝 --> 
       <!-- 인디케이터 --> 
       <ul class="carousel-indicators"> <li data-target="#demo" data-slide-to="0" class="active"></li> 
       <!--0번부터시작--> 
       <li data-target="#demo" data-slide-to="1"></li> 
       <li data-target="#demo" data-slide-to="2"></li> 
       </ul> 
       
       <!-- 인디케이터 끝 --> 
       </div>

    
	</div>
</div>


	<footer class="container-fluid navbar-fixed-bottom" id="foo">
		<h3 class="text-secondary" id="fo">(주)Costudy 사업자 정보</h3>
		<p>(주)Costudy | 경기도 시흥시 황고개로 206번길 43</p>
		<p>
			CEO : 안주원 | Git Master : 박현우 | 사업자등록번호 : 941602-00-035792 <span
				class="text-primary">사업자 정보확인</span>
		</p>
		<p>통신판매업신고 : 1998-가연가연-0508 | suhyeon27@Costudy.com</p>
		<p>회사번호 : 010-2978-8131 | 호스팅 사업자 : Kosta 211 Middle Project</p>
	</footer>


	<script type="text/javascript" src="../../bootstrap/bootstrap.min.js"></script>
	<script type="text/javascript" src="../../bootstrap/jquery-ui.min.js"></script>


	<script src="../../js/jquery-1.12.4.min.js"></script>

	<script src="../../js/jquery.slicknav.min.js"></script>

	<script src="../../css/js/main.js"></script>
	
	
	   <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" 
   integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" 
   crossorigin="anonymous">
   </script>
   <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" 
   integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" 
   crossorigin="anonymous">
   </script> 
   <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" 
   integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous">
   </script> 
 <script> $('.carousel').carousel({ interval: 2000 }) </script>  
</body>
</html>