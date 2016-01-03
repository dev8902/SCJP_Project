package com.naresh.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateDemo
 */
@WebServlet("/MiniJsp/update")
public class UpdateDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<html><form target='display'>");
		int sid=Integer.parseInt(request.getParameter("stu_id"));
		String name=request.getParameter("stu_name");
		String sadd=request.getParameter("stu_add");
		try{
			
		Connection connection=ConnectionBean.getConnection();
		PreparedStatement ps=connection.prepareStatement("update student_info set stu_name=?,stu_add=? where stu_id=?");
		ps.setInt(3, sid);
		ps.setString(1, name);
		ps.setString(2, sadd);
		int i=ps.executeUpdate();
		if(i!=1)
			out.println("<h2>Student ID  problem</h2>");
		else
			out.println("<h2 style='position:absolute;left:50;top:50'>One Record Updated Sucessfully</h2>");	
		 
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}