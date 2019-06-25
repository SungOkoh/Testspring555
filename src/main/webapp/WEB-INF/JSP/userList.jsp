<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here이다</title>
</head>
<body>
<div>
<c:forEach var="users" items="${list}">
${users.userNum}
${users.userName}<br>
</c:forEach>
	</div>		
</body>
</html>