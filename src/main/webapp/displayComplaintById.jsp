<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Complaint by Id</title>

<link rel="stylesheet" href="CSS/style.css">
</head>
<body>
	<div class="container">
		<p>Complaint by Id</p>
		
		<form action="DisplayComplaintById" method="post">
			<input class="inp" type="text" name="ticketNo" id="ticketNo" placeholder="Enter Ticket Number as id to get Complaint" />
		
			<button>DisplayComplaint</button>
		</form>
	</div>
</body>
</html>