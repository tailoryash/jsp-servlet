<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
         <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:out value = "Hello world"></c:out>
<%-- <c:import url="https://www.google.com"></c:import> --%>
${sDetails} <br/>
<c:forEach items="${sDetails}" var = "student">
	${student.name} <br/>
</c:forEach>
<sql:setDataSource var="db" 
				driver="com.mysql.jdbc.Driver" 
				url="jdbc:mysql://localhost:3306/promount-yash" 
				user="root" 
				password="root"/>
				
				<sql:query var="rs" dataSource="${db}">
					select * from customers
				</sql:query>
				
				
				<c:forEach items="${rs.rows}" var="row">
					<c:out value="Name is : ${row.customer_name}"></c:out>	:
					<c:out value="Email is : ${row.email}"></c:out> </br>
				</c:forEach>
				
	<c:set var="str" value = "yash tailor here" />
	
	Length is :  ${fn:length(str)}
	
	<c:forEach items="${fn:split(str, ' ')}" var="s">
	<br>
		${s}
	</c:forEach>		
	
	index is : ${fn:indexOf(str, "ta")}
	<br>
	<c:if test = "${fn:contains(str, 'yash')}">
		yash is there
	</c:if>
	
</body>
</html>