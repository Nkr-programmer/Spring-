<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${student }</h1>
<h1> ${student.name } </h1>
<h2> ${student.id }</h2>
<h1> ${student.date } </h1>
<h2> ${student.subjects }</h2>
<h1> ${student.gender } </h1>
<h2> ${student.type }</h2>
<h1> ${student.address.city } </h1>
<h2> ${student.address.state }</h2>


</body>
</html>