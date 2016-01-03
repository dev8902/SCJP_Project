<%@taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h2>
<c:import url="books.xml" var="doc"/>
<x:parse var="n" xml="${doc}"/>
<x:forEach var="k" select="$n/books/book">
	<x:if select="$k/title">
		<x:out select="$k/title"/><br>
		<x:out select="$k/author"/><br>
		<c:out value="--------"></c:out><br>
	</x:if>
</x:forEach>
</h2>