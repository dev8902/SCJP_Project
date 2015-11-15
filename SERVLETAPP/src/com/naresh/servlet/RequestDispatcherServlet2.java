package com.naresh.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestDispatcherServlet2
 */
@WebServlet("/RequestDispatcherServlet2")
public class RequestDispatcherServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestDispatcherServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String productId=request.getParameter("productId");
		String productName=request.getParameter("productName");
		String quality=request.getParameter("quality");
		ServletContext context=getServletContext();
		context.setAttribute("quality", quality);
		RequestDispatcher rd=request.getRequestDispatcher("/RequestDispatcherServlet3");
		response.setContentType("text/plain");
		PrintWriter out=response.getWriter();
		out.println("productId: "+productId);
		out.println("productName: "+productName);
		out.println("quality: "+quality);
		rd.include(request, response);
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
