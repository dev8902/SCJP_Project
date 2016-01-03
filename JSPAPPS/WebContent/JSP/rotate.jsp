<jsp:useBean id="rotate" class="com.naresh.jsp.RotatorBean" scope="session">
</jsp:useBean>
<% response.setHeader("Refresh","4");
rotate.display();
%>
<center>
<img  src='../images/<jsp:getProperty name="rotate" property="image"/>'  width="200" height="400"/>


</center>