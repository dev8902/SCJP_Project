package com.naresh.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class PoolServlet
 */
@WebServlet("/PoolServlet")
public class PoolServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DataSource dataSource;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PoolServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	public void init() throws ServletException{
		try{
			Properties p=new Properties();
			p.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
			p.put(Context.PROVIDER_URL, "http://localhost:8282");
			InitialContext ctx=new InitialContext(p);
			dataSource=(DataSource)ctx.lookup("MyJDBC Connection Pool");
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			Connection con=dataSource.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("Select * from emp");
			PrintWriter out=response.getWriter();
			out.println("<table border='2'><tr><th>Employee Id</th><th>Employee Name</th><th>Job</th><th>MGR</th><th>HireDate</th><th>Salary</th><th>Comm</th><th>Dept No</th></tr>");
			while(rs.next()){
				out.println("<tr><td>"+rs.getInt(1)+"</td>");
				out.println("<td>"+rs.getString(2)+"</td>");
				out.println("<td>"+rs.getString(3)+"</td>");
				out.println("<td>"+rs.getString(4)+"</td>");
				out.println("<td>"+rs.getString(5)+"</td>");
				out.println("<td>"+rs.getString(6)+"</td>");
				out.println("<td>"+rs.getString(7)+"</td>");
				out.println("<td>"+rs.getString(8)+"</td></tr>");			
			}
			out.println("</table>");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
