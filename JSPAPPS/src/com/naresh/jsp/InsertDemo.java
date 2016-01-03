package com.naresh.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertDemo
 */
@WebServlet("/MiniJsp/insert")
public class InsertDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertDemo() {
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
		PreparedStatement ps=connection.prepareStatement("insert into student_info values(?,?,?)");
		ps.setInt(1, sid);
		ps.setString(2, name);
		ps.setString(3, sadd);
		int i=ps.executeUpdate();
		if(i!=1)
			out.println("<h2>Record is problem</h2>");
		else
			out.println("<h2 style='position:absolute;left:50;top:50'>One Record Inserted Sucessfully</h2>");	
		 
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}
