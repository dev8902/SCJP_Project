package com.naresh.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PageNationServlet
 */
@WebServlet("/PageNationServlet")
public class PageNationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PageNationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			Connection con=ConnectionBean.getConnection1();
			Statement st=con.createStatement(1005,1007);
			ResultSet rs=st.executeQuery("Select count(*),empno,ename, deptno from emp");
			rs.next();
			int totalNumberofRecords=rs.getInt(1);
			
			PrintWriter out=response.getWriter();
			out.println("<table>");
			out.println("<tr><td>EMP NO</td><td>EMP NAME</td><td>JOB</td><td>MGR</td><td>HIRE DATE</td><td>SALARY</td><td>COMM</td><td>DEPT NO</td></tr>");
			String pageNo=request.getParameter("pageNo");
			int pageNumber;
			int recordsPerPage=3;
			if(pageNo==null){
				pageNumber=1;
			}else{
				pageNumber=Integer.parseInt(pageNo);
			}
			int startIndex=pageNumber*recordsPerPage-recordsPerPage+1;
			rs.absolute(startIndex);
			int i=0;
			do{
				i++;
				out.println("<tr>");
				
				out.println("<td>"+rs.getString(2)+"</td>");
				out.println("<td>"+rs.getString(3)+"</td>");
				out.println("<td>"+rs.getString(4)+"</td>");
				out.println("<td>"+rs.getString(5)+"</td>");
				out.println("<td>"+rs.getString(6)+"</td>");
				out.println("<td>"+rs.getString(7)+"</td>");
				out.println("<td>"+rs.getString(8)+"</td>");
				out.println("</tr>");
			}while(rs.next()&& i!=recordsPerPage);
			
			out.println("</table>");
			int noOfPages=totalNumberofRecords/recordsPerPage;
			if(totalNumberofRecords>(noOfPages*recordsPerPage)){
				noOfPages++;
			}
			for(int j=1;j<noOfPages;j++){
				out.println("<a href=PageNationServlet?pageNo="+j+">"+j+"</a>");
			}
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
