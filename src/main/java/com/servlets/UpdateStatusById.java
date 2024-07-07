package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entities.ComplaintRegister;
import com.helper.FactoryProvider;

public class UpdateStatusById extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UpdateStatusById() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String status = "Closed";

		int ticketId = Integer.parseInt(request.getParameter("ticketNo"));
		SessionFactory sessionFactory = FactoryProvider.getFactory();
		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		ComplaintRegister complain = session.get(ComplaintRegister.class, ticketId);
		complain.setStatus(status);

		tx.commit();
		session.close();

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<script type='text/javascript'>");
		out.println("alert('Complaint Closed Successfully');");
		out.println("window.location.href = 'index.jsp';");
		out.println("</script>");
		out.println("</body></html>");

	}
}