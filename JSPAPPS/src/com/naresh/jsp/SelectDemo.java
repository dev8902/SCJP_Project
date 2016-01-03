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
 * Servlet implementation class SelectDemo
 */
@WebServlet("/MiniJsp/select")
public class SelectDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectDemo() {
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
		
		try{
			
		Connection connection=ConnectionBean.getConnection();
		PreparedStatement ps=connection.prepareStatement("select * from student_info where stu_id=?");
		ps.setInt(1, sid);
		
		ResultSet rs=ps.executeQuery();
		if(rs!=null)
			out.println("<h2>Student ID  problem</h2>");
		else
			out.println("<h2 style='position:absolute;left:50;top:50'><table><tr>");
		out.println("<th>STUDENT ID</th><th>STUDENT NAME</th><th>STUDENT ADDRESS</th></tr>");
			while(rs.next()){
			out.println("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td></tr>");	
			}
			out.println("</table></h2>");	
		 
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}
