<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<sql:setDataSource var="ds" driver="oracle.jdbc.driver.OracleDriver" url="jdbc:oracle:thin:@localhost:1521:XE" user="system" password="system"/>
<sql:query var="result" dataSource="${ds}" sql="select * from dept"/>
<table>
<tr><th>DEPTNO</th>
<th>DEPT NAME</th>
<th>LOCATION</th>
</tr>

<c:forEach var="q1" items="${result.rows}">
<tr>
<td><c:out value="${q1.deptno}"/></td>
<td><c:out value="${q1.dname}"/></td>
<td><c:out value="${q1.loc}"/></td>
</tr>
</c:forEach>
</table>
<sql:update var="n" dataSource="${ds}" sql="insert into dept values(50,'HR OPERATIONS','BANGALORE')"/>
<sql:query var="result" dataSource="${ds}" sql="select * from dept"/>
<table>
<tr><th>DEPTNO</th>
<th>DEPT NAME</th>
<th>LOCATION</th>
</tr>

<c:forEach var="q1" items="${result.rows}">
<tr>
<td><c:out value="${q1.deptno}"/></td>
<td><c:out value="${q1.dname}"/></td>
<td><c:out value="${q1.loc}"/></td>
</tr>
</c:forEach>
</table>
