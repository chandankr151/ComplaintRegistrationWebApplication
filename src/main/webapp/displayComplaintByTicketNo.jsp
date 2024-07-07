<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ComplaintByTicketNo</title>

<link rel="stylesheet" href="CSS/style.css">
</head>
<body>
		
	<div class="container">
		<p>Display Complaint By Ticket Number.</p>
		<form action="DisplayComplaintByTicketNo" method="post">
			<input class="inp" type="text" name="ticketNo" id="ticketNo" placeholder="Enter Ticket Number to close Complaint" />
		
			<button>DisplayComplaint</button>
		</form>
	</div>
</body>
</html>