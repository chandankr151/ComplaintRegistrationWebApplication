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

public class DisplayComplaintById extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DisplayComplaintById() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int ticketId = Integer.parseInt(request.getParameter("ticketNo"));
		SessionFactory sessionFactory = FactoryProvider.getFactory();
		Session session = sessionFactory.openSession();

		ComplaintRegister complain = session.get(ComplaintRegister.class, ticketId);
		System.out.println(complain);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
        
        	out.println("<html><head></head><body>");
        	out.println("<h4>Ticket No: "+complain.getTicketNo()+"</h4>");
        	out.println("<h4>ProjectName: "+complain.getProjectName()+"</h4>");
        	out.println("<h4>ModuleName: "+complain.getModuleName()+"</h4>");
        	out.println("<h4>SubModule Name: "+complain.getSubModuleName()+"</h4>");
        	out.println("<h4>Issue: "+complain.getIssue()+"</h4>");
        	out.println("<h4>Priority: "+complain.getPriority()+"</h4>");
        	out.println("<h4>Status: "+complain.getStatus()+"</h4>");
        	out.println("<h4>Frequency: "+complain.getFrequency()+"</h4>");
        	out.println("<h4>Date: "+complain.getDate()+"</h4>");
        	out.println("<h4>Time: "+complain.getTime()+"</h4>");
        	out.println("</body></html");
        
		

        session.close();
		
	}
}