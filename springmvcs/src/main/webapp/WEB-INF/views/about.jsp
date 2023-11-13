<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<%@ page import ="java.util.List"%>
<%@ page isELIgnored="false"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
      <% String name=(String)request.getAttribute("name"); 
         Integer id=(Integer)request.getAttribute("id");
         List<String> friend=(List<String>)request.getAttribute("frie");
       %>
      <h1>My name is <%=name %></h1>
      <h1>My id is <%=id %></h1>
      
      <%for(String x:friend){%>
      <h1><%=x%></h1>
      <%}%>
      
      
      <%for(String x:friend){out.println(x);}%>
      
      
      
      <h1>${age }</h1>
      <h1>${type }</h1>
      <c:forEach var="item" items="${probs }">
      	<h1>${item }</h1>                          <!--1st way  -->
      	<h1><c:out value="${item} "></c:out></h1> <!--2nd way  -->
      </c:forEach>
            
      
</body>
</html>