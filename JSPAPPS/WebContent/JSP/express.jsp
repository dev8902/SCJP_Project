<%@page isELIgnored="false"%>
<%
pageContext.setAttribute("k1","java");
pageContext.setAttribute("k2","jsp",2);
pageContext.setAttribute("k3","ejb",3);
pageContext.setAttribute("k2","servlet",4);
pageContext.setAttribute("k1","JSTL",pageContext.PAGE_SCOPE);
 %>
 ${k1}<br>
 ${requestScope.k2}<br>
 ${sessionScope.k3}<br>
 ${applicationScope.k2}<br>
 ${pageScope.k5}<br>
 ${k2}