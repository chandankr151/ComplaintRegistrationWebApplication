<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>Note Taker : Home Page</title>
<%@include file="all_js_css.jsp"%>

</head>
<body>

	<div class="container-fluid p-0 m-0">

		<%@include file="navbar.jsp"%>
		
		<br>
		<div class="card py-10">
			<img alt="notepad-Image" class="img-fluid mx-auto" style="max-width:400px" src="images/notepad.png">
			<h1 class="text-primary text-uppercase text-center mt-3" >Start Taking Your Notes</h1>
			
			<div class="container text-center">
				<button class="btn-outline-primary text-center" >Start Here</button>
			</div>
		</div>
	</div>

</body>
</html>