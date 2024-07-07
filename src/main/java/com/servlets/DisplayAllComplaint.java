package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.entities.ComplaintRegister;
import com.helper.FactoryProvider;

public class DisplayAllComplaint extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DisplayAllComplaint() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		SessionFactory sessionFactory = FactoryProvider.getFactory();
		Session session = sessionFactory.openSession();
        // Get all complaints
       
		String query = "from ComplaintRegister";
		Query q = session.createQuery(query);
		
		List<ComplaintRegister> list = q.list(); 
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
        for(ComplaintRegister cmpReg: list) {
        	out.println("<html><head></head><body>");
        	out.println("<h4>Ticket No: "+cmpReg.getTicketNo()+"</h4>");
        	out.println("<h4>ProjectName: "+cmpReg.getProjectName()+"</h4>");
        	out.println("<h4>ModuleName: "+cmpReg.getModuleName()+"</h4>");
        	out.println("<h4>SubModule Name: "+cmpReg.getSubModuleName()+"</h4>");
        	out.println("<h4>Issue: "+cmpReg.getIssue()+"</h4>");
        	out.println("<h4>Priority: "+cmpReg.getPriority()+"</h4>");
        	out.println("<h4>Status: "+cmpReg.getStatus()+"</h4>");
        	out.println("<h4>Frequency: "+cmpReg.getFrequency()+"</h4>");
        	out.println("<h4>Date: "+cmpReg.getDate()+"</h4>");
        	out.println("<h4>Time: "+cmpReg.getTime()+"</h4>");
        	out.println("</body></html");
        }
	}
}