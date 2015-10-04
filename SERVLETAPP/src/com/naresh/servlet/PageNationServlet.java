package com.naresh.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.naresh.bean.EmployeeBean;

/**
 * Servlet implementation class PageNationServlet
 */
@WebServlet("/PageNationServlet")
public class PageNationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	int pageNumber;
	int totalNumberofRecords;
	int recordsPerPage=3;
	int startIndex;
	int noOfPages;
    public PageNationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String spageNo=request.getParameter("pageNo");
		if(spageNo==null){
			pageNumber=1;
		}else{
			pageNumber=Integer.parseInt(spageNo);
			
		}
		startIndex=pageNumber*recordsPerPage-recordsPerPage+1;
		
		try{
			
			Connection con=ConnectionBean.getConnection1();
			Statement st=con.createStatement(1005,1007);
			ResultSet rs=st.executeQuery("Select * from emp");
			out.println("<table border='2'><tr><th>Employee Id</th><th>Employee Name</th><th>Job</th><th>MGR</th><th>HireDate</th><th>Salary</th><th>Comm</th><th>Dept No</th></tr>");
			rs.absolute(startIndex);
			int i=0;
			do{
				i++;
				out.println("<tr><td>"+rs.getInt(1)+"</td>");
				out.println("<td>"+rs.getString(2)+"</td>");
				out.println("<td>"+rs.getString(3)+"</td>");
				out.println("<td>"+rs.getString(4)+"</td>");
				out.println("<td>"+rs.getString(5)+"</td>");
				out.println("<td>"+rs.getString(6)+"</td>");
				out.println("<td>"+rs.getString(7)+"</td>");
				out.println("<td>"+rs.getString(8)+"</td></tr>");
			}
			while(rs.next()&& i!=recordsPerPage);
			out.println("</table>");
			rs.close();
			rs=st.executeQuery("select count(*) from emp");
			if(rs.next()){
			
			totalNumberofRecords=rs.getInt(1);
			}
			int noOfPages=totalNumberofRecords/recordsPerPage;
			if(totalNumberofRecords>(noOfPages*recordsPerPage)){
				noOfPages++;
			}
			for(i=1;i<noOfPages;i++){
				out.println("<a href=PageNationServlet?pageNo="+i+">"+i+"</a>");
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
