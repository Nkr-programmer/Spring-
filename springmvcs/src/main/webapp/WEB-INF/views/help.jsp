<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import ="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>help Page</title>
</head>
<body>
      <% String name=(String)request.getAttribute("namei"); 
         Integer id=(Integer)request.getAttribute("idi");
         List<String> friend=(List<String>)request.getAttribute("frie");
       %>
      <h1>My name is <%=name %></h1>
      <h1>My id is <%=id %></h1>
      
      <%for(String x:friend){%>
      <h1><%=x%></h1>
      <%}%>
            
      <%for(String x:friend){out.println(x);}%>
</body>
</html>