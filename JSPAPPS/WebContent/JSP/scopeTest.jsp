<%
pageContext.setAttribute("k1","JavaSE",1);
pageContext.setAttribute("k2","Java",2);
request.setAttribute("k2","servlet");
pageContext.setAttribute("k3","Jsp",4);
Object o1=pageContext.getAttribute("k1");
out.println(o1);
out.println("<br>");
Object o2=pageContext.getAttribute("k2");
out.println(o2);
out.println("<br>");
Object o3=pageContext.getAttribute("k2",2);
out.println(o3);
out.println("<br>");
Object o4=pageContext.findAttribute("k3");
out.println(o4);
out.println("<br>");
%>

