<%-- <% String result="";
String username=request.getParameter("username");
String password=request.getParameter("password");
int k=check(username,password);
if(k==1){
result="Success";
}else{
result="Failure";
}
%>
<h2><%=result %></h2>
<%! int check(String username, String password){
if(username.equalsIgnoreCase("naresh")&&password.equalsIgnoreCase("naresh")){
	return 1;
}else{
	return 0;
}

}%> --%>
<jsp:useBean id="loginBean" class="com.naresh.jsp.LoginBean">
<jsp:setProperty name="username" param="username"/>
<jsp:setProperty name="password" param="password"/>
</jsp:useBean>
Username:<jsp:getProperty property="username" name="username"/><br>
Password:<jsp:getProperty property="" name=""/>