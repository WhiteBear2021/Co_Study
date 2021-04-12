<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="no-js" lang="zxx">
<head>
<meta charset="UTF-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- CSS here -->
<link rel="stylesheet" href="bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="css/main.css">
<link rel="stylesheet" href="css/flaticon.css">
<link rel="stylesheet" href="css/slicknav.css">
<link rel="stylesheet" href="css/fontawesome-all.min.css">
<link rel="stylesheet" href="css/style.css">
</head>

<body>
 
<jsp:include page="view/common/header.jsp"></jsp:include> 

<!-- content -->

<div id="page-wrapper">

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
<jsp:include page="view/common/footer.jsp"></jsp:include> 

</body>
</html>