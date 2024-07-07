package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entities.ComplaintRegister;
import com.helper.FactoryProvider;

public class RegisterComplaint extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterComplaint() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String projectName = request.getParameter("projectName");
		String moduleName = request.getParameter("moduleName");
		String subModuleName = request.getParameter("subModuleName");
		String issue = request.getParameter("issue").trim();
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();

		String priority = request.getParameter("priority");
		String status = request.getParameter("status");
		String frequency = request.getParameter("frequency");

		SessionFactory sessionFactory = FactoryProvider.getFactory();
		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		// Create a new complaint object and set its properties
		ComplaintRegister complaint = new ComplaintRegister();
		complaint.setProjectName(projectName);
		complaint.setModuleName(moduleName);
		complaint.setSubModuleName(subModuleName);
		complaint.setIssue(issue);
		complaint.setPriority(priority);
		complaint.setStatus(status);
		complaint.setFrequency(frequency);
		complaint.setDate(date);
		complaint.setTime(time);

		// Save the complaint object to the database
		session.save(complaint);

		// Commit transaction and close session
		tx.commit();
		session.close();

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<script type='text/javascript'>");
		out.println("alert('Complaint Updated Successfully');");
		out.println("window.location.href = 'index.jsp';");
		out.println("</script>");
		out.println("</body></html>");

	}
}