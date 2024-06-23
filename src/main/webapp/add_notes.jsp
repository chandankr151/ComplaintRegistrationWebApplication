<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Notes</title>

<%@include file="all_js_css.jsp"%>

</head>
<body>

	<div class="container-fluid p-0 m-0">

		<%@include file="navbar.jsp"%>
		<h1>Please fill your note details</h1>

		<form action="SaveNoteServlet" method="post">
			<div class="form-group">
				<label for="title">Note Title</label> <input type="text"
					class="form-control" id="title" name="title"
					aria-describedby="emailHelp" placeholder="Enter here" required>
			</div>
			<div class="form-group">
				<label for="content">Note Content</label>
				<textarea id="content" name="content"
					placeholder="Enter your content here" class="form-control"
					style="height: 300px" required></textarea>
			</div>

			<div class="container text-center">
				<button type="submit" class="btn btn-primary">Add</button>

			</div>
		</form>

	</div>
</body>
</html>