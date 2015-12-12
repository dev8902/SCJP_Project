<%-- TestAppllet.jsp --%>
<jsp:plugin code="com.naresh.jsp.TestApplet.class" type="applet" width="300" height="300" codebase="">
<jsp:params>
<jsp:param value="Welcome" name="s1"/>
</jsp:params>
<jsp:fallback>Sorry, Unable to find resource...!</jsp:fallback>

</jsp:plugin>