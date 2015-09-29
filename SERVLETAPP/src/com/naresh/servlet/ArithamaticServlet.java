package com.naresh.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ArithamaticServlet
 */

public class ArithamaticServlet extends HttpServlet {
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArithamaticServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstNo=request.getParameter("firstNo");
		String secondNo=request.getParameter("secondNo");
		String button=request.getParameter("s1");
		
		int a=Integer.parseInt(firstNo.trim());
		int b=Integer.parseInt(secondNo.trim());
		String msg="";
		int c=0;
		if(button.equals("ADD")){
			c=a+b;
			msg="Addition";
		}else if(button.equals("Subtract")){
			c=a-b;
			msg="Subtraction";
		}
		else{
			c=a*b;
			msg="multiplication";
		}
		PrintWriter out=response.getWriter();
		out.println("<center><h2>");
		out.println(msg+":"+c);
		out.println("</h2></center>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
