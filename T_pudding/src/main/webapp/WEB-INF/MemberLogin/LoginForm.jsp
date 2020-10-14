<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../common.jsp"%>
<script type="text/javascript">
	function register() {
		location.href = "registerForm.me"; // => MemberRegisterController.java
	}
</script>
<c:set var="path" value="${pageContext.request.contextPath }" />
<!DOCTYPE HTML>
<html>
<head>
<title>Ex Machina by TEMPLATED</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<link
	href='http://fonts.googleapis.com/css?family=Roboto+Condensed:700italic,400,300,700'
	rel='stylesheet' type='text/css'>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="${path}/resources/js/skel.min.js"></script>
<script src="${path}/resources/js/skel-panels.min.js"></script>
<script src="${path}/resources/js/init.js"></script>
<link rel="stylesheet" href="${path}/resources/css/skel-noscript.css" />
<link rel="stylesheet" href="${path}/resources/css/style.css" />
<link rel="stylesheet" href="${path}/resources/css/style-desktop.css" />
</head>
<body class="no-sidebar">

	<!-- Header -->
	<div id="header">
		<div class="container">

			<!-- Logo -->
			<div id="logo">
				<h1>
					<a href="#">PUDDING</a>
				</h1>
			</div>

			<!-- Nav -->
			<nav id="nav">
				<ul>
					<li><a href="Main.pd">메인</a></li>
					<li><a href="${path}/resources/left-sidebar.html">푸딩차트</a></li>
					<li><a href="Dj.ms">푸딩 DJ</a></li>
					<li><a href="list.bd">게시판</a></li>
					<li><a href="${path}/resources/right-sidebar.html">Q&A</a></li>
					<li><a href="CNotice.ad">공지사항</a></li>
					<li class="active"><a href="loginForm.me">로그인</a></li>
					<li><a href="admin.ad">관리자</a></li>
				</ul>
			</nav>

		</div>
	</div>
	<!-- Header -->

	<!-- Banner -->
	<div id="banner">
		<div class="container"></div>
	</div>
	<!-- /Banner -->

	<!-- Main -->
	<div id="page">

		<!-- Main -->
		<div id="main" class="container">
			<div class="row">
				<div class="12u">
					<section>
						<header>
							<h2>로그인</h2>
							<br>
						</header>
						<form method="post" action="loginForm.me">
							<table border="1" width="40%" height="150px">
								<tr>
									<td>아이디</td>
									<td><input type="text" name="customer_id" value="park"></td>
								</tr>

								<tr>
									<td>비번</td>
									<td><input type="password" name="customer_passwd"></td>
								</tr>

								<tr>
									<td colspan="2"><input type="submit" value="로그인">
										<input type="button" value="아이디/비밀번호 찾기"> <input
										type="button" value="회원가입" onClick="register()"></td>
								</tr>
							</table>
						</form>
				</div>
			</div>
		</div>
		<!-- Main -->

	</div>
	<!-- /Main -->
	<!-- Copyright -->
	<div id="copyright" class="container">
		Design: <a href="http://templated.co">TEMPLATED</a> Images: <a
			href="http://unsplash.com">Unsplash</a> (<a
			href="http://unsplash.com/cc0">CC0</a>)
	</div>


</body>
</html>