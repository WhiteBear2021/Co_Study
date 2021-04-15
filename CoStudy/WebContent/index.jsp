<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="no-js" lang="zxx">
<head>
<meta charset="UTF-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

</head>

<body>
 
<jsp:include page="view/common/header.jsp"></jsp:include> 

<!-- content -->

<div id="page-wrapper">

   <div id="demo" class="carousel slide" data-ride="carousel"> 
   <div class="carousel-inner">
    <!-- 슬라이드 쇼 --> 
    <div class="carousel-item active"> <!--가로-->
     <img class="d-block" src="https://cdn.geojenews.com/news/photo/201912/52693_38034_361.jpg" alt="First slide">  </div> 
      <div class="carousel-item"> 
      <img class="d-block" src="https://www.theguru.co.kr/data/photos/20200731/art_15960061554972_7668c4.png" alt="Second slide"> </div> 
      <div class="carousel-item"> 
      <img class="d-block" src="https://i.pinimg.com/originals/56/94/e2/5694e2e5cfabd75a36724889b187fbd8.jpg" alt="Third slide"> </div> 
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
<jsp:include page="view/common/footer.jsp"></jsp:include> 

</body>
</html>