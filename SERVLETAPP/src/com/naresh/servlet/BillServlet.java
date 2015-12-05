package com.naresh.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BillServlet
 */
@WebServlet("/BillServlet")
public class BillServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BillServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		double price=0;
		String str1[]=(String[])session.getAttribute("pendrive");
		String str2[]=(String[])session.getAttribute("laptop");
		if(str1!=null){
			for(int i=0;i<str1.length;i++){
				price=price+250;
			}
		}
		if(str2!=null){
			for(int i=0;i<str2.length;i++){
				price=price+25000;
			}
		}
		PrintWriter out=response.getWriter();
		out.println("your are selected the following items<br>");
		out.println("<ul>");
		if(str1!=null){
			for(int i=0;i<str1.length;i++){
				out.println("<li>"+str1[i]+"</li>");
				out.println("<br>");
				
			}
		}
		if(str2!=null){
			for(int i=0;i<str2.length;i++){
				out.println("<li>"+str2[i]+"</li>");
				out.println("<br>");
				
			}
		}
		out.println("</ul>");
		out.println("Total Price: "+price);
		out.println("<br>");
		out.println("<a href=LogoutServlet>Logout</a>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
