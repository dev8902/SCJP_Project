<%@ page session="true"%>
<h3>
Current Date is: <%=new java.util.Date() %><br>
Session Id: <%=session.getId() %><br>
Inactive Time: <%=session.getMaxInactiveInterval() %><br>
Session State: <%=session.isNew() %>

</h3>