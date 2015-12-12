package com.naresh.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class SalaryServlet
 */
@WebServlet("/SalaryServelt")
public class SalaryServlet extends HttpServlet {
	

    /**
     * Default constructor. 
     */
    public SalaryServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str1=request.getParameter("t1");
		String str2=request.getParameter("p1");
		int s=Integer.parseInt(str1);
		double d=Double.parseDouble(str2);
		double HRA=s*0.32;
		PrintWriter out=response.getWriter();
		out.println("Salary: "+s+"<br>");
		out.println("DA: "+d+"<br>");
		out.println("HRA: "+HRA);
				
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
