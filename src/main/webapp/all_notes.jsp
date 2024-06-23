<%@page import="java.text.SimpleDateFormat"%>
<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="java.util.Date"%>
<%@page import="java.time.LocalDate"%>
<%@page import="org.hibernate.query.Query"%>
<%@page import="com.helper.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@page import="java.util.List"%>
<%@page import="com.entities.Note"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All note taker</title>

<%@include file="all_js_css.jsp"%>
</head>
<body>
	<div class="container">
		<%@include file="navbar.jsp"%>
		<h1 class="text-uppercase">All Notes:</h1>

		<div class="row">
			<div class="col-12">
				<%
				Session session2 = FactoryProvider.getFactory().openSession();

				Query query = session2.createQuery("from Note");
				List<Note> list = query.list();

				for (Note note : list) {
				%>

				<div class="card mt-3">
					<img src="images/notepad.png" style="max-width: 60px"
						class="card-img-top m-4 mx-auto" alt="...">
					<div class="card-body px-5">
						<h5 class="card-title"><%=note.getTitle()%></h5>
						<p class="card-text">
							<%=note.getContent()%>
						</p>
						<p>
							<b class="text-primary">
								<% out.print("Created Date: " + note.getAddedDate()); %>
							</b>
						</p>
						<div class="container text-center mt-2">
							<a href="DeleteServlet?note_id=<%=note.getId()%>"
								class="btn btn-danger">Delete</a> <a
								href="edit.jsp?note_id=<%=note.getId()%>"
								class="btn btn-primary">Update</a>
						</div>
					</div>
				</div>

				<%
				}
				session2.close();
				%>
			</div>
		</div>

	</div>
</body>
</html>