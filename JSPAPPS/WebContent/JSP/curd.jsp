<%@page import="java.util.*"%>
<jsp:useBean id="curdBean" class="com.naresh.jsp.CurdBean">
<jsp:setProperty name="curdBean" property="*"/>
</jsp:useBean>
<h2>This command is:<jsp:getProperty property="command" name="curdBean"/></h2>
<hr>
<h3>The out put is:</h3><br>
<% String str=request.getParameter("command");

if(!str.toUpperCase().startsWith("SELECT")){
int k=curdBean.m1();
out.println("<h2>Non Select operation done</h2>");
}else{
ArrayList al=curdBean.m2();
out.println("<center><table border=3>");
Iterator it=al.iterator();
while(it.hasNext()){
String s=(String)it.next();
StringTokenizer st=new StringTokenizer(s);
out.println("<tr>");
while(st.hasMoreTokens()){
out.println("<td>"+st.nextToken()+"</td>");
}
out.println("</tr>");
}
out.println("</table></center>");
}
	curdBean.closeConnection();
%>
