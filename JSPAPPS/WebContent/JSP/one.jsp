<!-- one.jsp -->

<% String str=request.getParameter("t1");
int s=Integer.parseInt(str);
double da=s*0.20;
%>
<jsp:forward page="../SalaryServelt">
<jsp:param value="<%= da%>" name="p1"/>
</jsp:forward>