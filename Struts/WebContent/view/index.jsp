<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html:form action="login">
UserName:<html:text property="username"/><br>
Password:<html:password property="password"/><br>
<input type="submit" value="login"/>
</html:form>