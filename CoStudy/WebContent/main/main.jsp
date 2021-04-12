<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="../bootstrap/bootstrap.min.css">

<meta charset="UTF-8">
<title>Insert title here</title>
<!-- style -->
<style>
 #page-wrapper {
    padding-left: 250px;
  }

	#sidebar-wrapper {
    position: absolute;
    width: 250px;
    margin-left: -250px;
    background: yellow;
    overflow-x: hidden;
    overflow-y: auto;
    margin-top: 50px;
   
  }
  
  #page-content-wrapper {
    width: 100%;
    padding: 20px;
    margin-left: 200px;
  }
  
  	.sidebar-nav {
    width: 250px;
    margin: 0;
    padding: 0;
    list-style: none;
  }
  
  .sidebar-nav li {
    text-indent: 1.5em;
    line-height: 2.8em;
  }
  
  .sidebar-nav li a {
    display: block;
    text-decoration: none;
    color: black;
  }
  
  .sidebar-nav > .sidebar-brand {
    font-size: 1.3em;
    line-height: 3em;
  }
  
.bg-dark {
    background-color: #320b86!important;
}

    /* footer */
    footer {
      color: white;
      padding: 15px;
    }

</style>
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
                            <a href="index.html"><img src="./img.png" alt="" style="max-width: 200px;"></a>
                        </div>
                        <!-- Main-menu -->
                        <div class="main-menu d-none d-lg-block">
                            <nav>                                                
                                <ul id="navigation">  
                                    <li><a href="#">contact1</a></li>
                                    <li><a href="#">contact2</a></li>
                                    <li><a href="#">contact3</a></li>
                                    <li class="hot"><a href="#">contact4</a>
                                        <ul class="submenu">
                                            <li><a href="#">contact4_1</a></li>
                                            <li><a href="#">contact4_2</a></li>
                                        </ul>
                                    </li>
                                    <li><a href="#">contact5</a>
                                        <ul class="submenu">
                                            <li><a href="#">contact5_1</a></li>
                                            <li><a href="#">contact5_2</a></li>
                                        </ul>
                                    </li>
                                  <li><a href="#">contact6</a></li>
                                    <li><a href="#">contact7</a></li>
                                </ul>
                            </nav>
                        </div>
                        <!-- Header Right -->
                        <div class="header-right">
                            <ul>
                                <li>
                                    
                                </li>
                                <li> <a href="#"><span class="flaticon-user"></span></a></li>
                                 <li> <a href="#"><span class="flaticon-user"></span></a></li>
                                
                            </ul>
                        </div>
                    </div>
                    <!-- Mobile Menu -->
                    <div class="col-12">
                        <div class="mobile_menu d-block d-lg-none"></div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Header End -->
    </header>
<div style="background-color: #3D5A5B">
    <br><br><br><br><br><br><br><br><br><br><br>
    <br><br><br><br><br><br><br><br><br><br><br>
    <br><br><br><br><br><br><br><br><br><br><br>
    <br><br><br><br><br><br><br><br><br><br><br>
</div>

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



	<div class="page-content-wrapper">
		<div class="container-fluid">
        <p>test</p>
        <p>test</p>
        <p>test</p>
        <p>test</p>
        <p>test</p>
        <p>test</p>
        <p>test</p>
        <p>test</p>
        <p>test</p>
        <p>test</p>
        <p>test</p>
        <p>test</p>
        <p>test</p>

       </div>         
    </div>
    
</div>








<footer class="container-fluid navbar-fixed-bottom">
	<h3 class="text-secondary">(주)Costudy 사업자 정보</h3>
	<p>(주)Costudy     |    경기도 시흥시 황고개로 206번길 43  </p>
	<p>CEO : 안주원     |     Git Master : 박현우    |    사업자등록번호 : 941602-00-035792 <span class="text-primary">사업자 정보확인</span></p>
	<p>통신판매업신고 : 1998-가연가연-0508    |     suhyeon27@Costudy.com </p>
	<p>회사번호 : 010-2978-8131     |     호스팅 사업자 : Kosta 211 Middle Project </p>
</footer>

<script type="text/javascript" src="../bootstrap/bootstrap.min.js"></script>
<script type="text/javascript" src="../bootstrap/jquery-ui.min.js"></script>
</body>
</html>