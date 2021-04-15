<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<link rel='stylesheet'
	href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css'>
<link rel="stylesheet" href="../css/groupMain_style.css">

<link type="text/css" rel="stylesheet" href="../css/timer.css">
<link type="text/css" rel="stylesheet"
	href="../css/groupSidebar_list.css">

</head>
<body>

	<div id="wrapper">
		<div id="sidebar-wrapper">
			<ul class="sidebar-nav">
				<!--nav-->
				<li>
					<nav id="side-userbox">
						<input type="image" name="user_name" value="이름">
					</nav>
				</li>
				<li>
					<nav id="side-timer">
						<section id="timer">
							<span id="time_output">00:00:00</span><br>
							<div class="content_center">
								<input type="button" id="timer_bnt_save" value="저장"> <input
									type="button" id="timer_bnt_start" value="시작">
							</div>
						</section>
					</nav>
				</li>
				<li>
					<nav id="side-todo">
						<h3 id="todo">TODO</h3>
						<div id="right-sidebar-userlist">
							<table class="table table-hover" id="list">
								<tr>
									<td><input type="radio">게임하기</td>
								</tr>
								<tr>
									<td><input type="radio">노래듣기</td>
								</tr>
								<tr>
									<td><input type="radio">영어 3시간 공부하기</td>
								</tr>
							</table>
						</div>

					</nav>
				</li>
				<li>
					<nav id="side-groupschedule">GroupSchedule</nav>
				</li>
			</ul>
		</div>
		<div id="page-content-wrapper">
			<div class="container-fluid">
				<div class="row">
					<div class="col-lg-12">
						<a href="#" class="btn" id="menu-toggle"><span
							class="glyphicon glyphicon-menu-hamburger"></span></a>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="container" class="row" id="group-Main-body">
		<input type="hidden" name="studyGroup_no" value="1">
		<div id="background-body">
			<div class="col-lg-9" id="peed">
				<div id="selectGroupBoard">
					<div style="overflow: scroll; width: 700px; height: 550px;">
						
						<c:forEach var="lists" items="${list }">


							<%-- <div id="board-list" class="post_reply_wrap"
								style="width: 600px; height: 270px;">
								<div id="board-list-p">
									<p>${lists.studyGroup_no }</p>
									<p>${lists.page_board_content }</p>
								</div>
								<div id="reply">
									<form action="">
										<input type="text" id="reply-text">
									</form>
								</div>
							</div> --%>
					
							<div style="width: 450px; height: 150px; background-color: gray;">

								<p>${lists.studyGroup_no }</p>
								<p>${lists.page_board_content }</p>
								<p>${lists.page_board_no }</p>

								<form action="insertGroupReply.do" method="get">

									<input type="hidden" name="studyGroup_no"
										value="${lists.studyGroup_no }">
									<h2>${lists.studyGroup_no }</h2>

									<input type="hidden" name="page_board_no"
										value="${lists.page_board_no }"> <input id="text"
										type="text" name="group_reply_writer"> <input
										id="text" type="text" name="group_reply_content">

									<button id="button" type="submit"
										style="width: 70px; height: 70px;">작성</button>


								</form>



							</div>

							<br>
							<br>
							<br>

							<br>

							<c:forEach var="relist" items="${relist }">
								<c:if test="${lists.page_board_no==relist.page_board_no }">
									<h6>댓글</h6>
									<p>${relist.group_reply_no }</p>
									<p>${relist.group_reply_writer }</p>
									<p>${relist.group_reply_content }</p>
									<p>${relist.page_board_no }</p>
								</c:if>
							</c:forEach>


						</c:forEach>


					</div>


				</div>

			</div>
			<div class="col-md-4">
			<div class="panel panel-info" class="col-md-4" id="panel-sideVar">
				<div>
					<h3 class="panel-title">Panel Title</h3>
				</div>
				<!-- 메뉴목록 -->
				<ul class="list-group">
					<li class="list-group-item">
					<input type="button" onclick="location.href='groupAcceptUser.do'" value="그룹신청 목록">
					</li>
				</ul>
			</div>
			</div>


			<form action="groupWriting.do" method="get">
				<div id="write">

					<input type="hidden" name="studygroup_no" value="${studygroup_no}">
					<input id="text-box" type="text" name="page_board_content"
						style="width: 600px; height: 70px;">
					<button id="button" type="submit"
						style="width: 70px; height: 70px;">작성</button>
				</div>

			</form>



			<div class="col-lg-3 col-md-12" id="group-Main-right"
				style="right: 0;">
				<div id="group-Main-right-top" class="col-md-5">
					<div id="right-sidebar-gibox"></div>
					<div id="right-sidebar-fileBox"></div>
					<a href="../chatting/chattingRoom.do?roomNo=${roomNo}"
						onclick="window.open(this.href, '_blank', 'width=800, height=1000'); return false;">그룹
						채팅</a>
				</div>
				<div id="group-Main-right-bottom" class="col-md-5">
					<div id="right-sidebar-userlist">
						<table class="table table-hover" id="userlist">
							<tr>
								<td>...</td>

							</tr>
							<tr>
								<td>...</td>
							</tr>
							<tr>
								<td>...</td>
							</tr>
							<tr>
								<td>...</td>
							</tr>
						</table>
					</div>
					<div id="right-sidebar-groupchat"></div>
				</div>
			</div>
		</div>
	</div>

</body>
<!-- partial -->
<script
	src='https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.2/jquery.min.js'></script>
<script src="../../js/side.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/prefixfree/1.0.7/prefixfree.min.js"></script>

<script type="text/javascript" src="../../js/jquery.js"></script>
<script type="text/javascript" src="../../js/timer.js"></script>


</body>
</html>
