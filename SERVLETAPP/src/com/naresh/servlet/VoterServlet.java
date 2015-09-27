/**
 * 
 */
package com.naresh.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author Naresh
 *
 */
public class VoterServlet extends GenericServlet{

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
			String s1=request.getParameter("age");
			int age=Integer.parseInt(s1);
			PrintWriter out =response.getWriter();
			if(age>=18)
				out.println("<font color=green>Ur Eligiable to Vote</font>");
			else
				out.println("<font color=red>Ur Not Eligiable to Vote</font>");
		
	}
}
