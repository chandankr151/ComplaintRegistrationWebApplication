package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entities.ComplaintRegister;
import com.helper.FactoryProvider;

public class CloseStatusById extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CloseStatusById() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int ticketId = Integer.parseInt(request.getParameter("ticketNo"));
		SessionFactory sessionFactory = FactoryProvider.getFactory();
		Session session = sessionFactory.openSession();

		ComplaintRegister complain = session.get(ComplaintRegister.class, ticketId);
		complain.setStatus("Closed");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<script type='text/javascript'>");
		out.println("alert('Session Closed Successfully');");
		out.println("window.location.href = 'index.jsp';");
		out.println("</script>");
		out.println("</body></html>");     
		
        session.close();
	}
}