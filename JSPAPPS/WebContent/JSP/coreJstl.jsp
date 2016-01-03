<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="k1" value="java"/>
<c:out value="${k1}"/><br>
<c:if test="${k1 eq 'java'}">
<c:out value="Your input is correct!"></c:out>
</c:if><br>
<c:forEach var="n" begin="1" end="5">
<c:out value="${n}"/>&nbsp;&nbsp;
</c:forEach><br>
<c:set var="str" value="java,naresh,spring,hibernate,struts"/>
<c:forTokens var="k" items="${str}" delims=",">
<c:out value="${k}"/><br>
</c:forTokens>