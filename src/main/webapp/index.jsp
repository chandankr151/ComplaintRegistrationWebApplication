<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>RegisterComplaint Home Page</title>

<link rel="stylesheet" href="CSS/style.css">
</head>
<body>

	<div class="container">

		<h1>Welcome to Home Page</h1>
		<p>Complaint Registration Form</p>

		<form action="RegisterComplaint.jsp" method="post">

			<input type="submit" value="Register Complaint">
		</form>

		<form action="DisplayAllComplaint" method="post">
			<input type="submit" value="Display Complaints">
		</form>

		<form action="displayComplaintById.jsp" method="post">
			<input type="submit" value="Display Complaint by Id">
		</form>

		<form action="displayComplaintByTicketNo.jsp" method="post">
			<input type="submit" value="Display Complaint by Ticket No">
		</form>

		<form action="UpdateStatusById.jsp" method="post">
			<input type="submit" value="Close Complaint status by id">
		</form>
	</div>

</body>
</html>