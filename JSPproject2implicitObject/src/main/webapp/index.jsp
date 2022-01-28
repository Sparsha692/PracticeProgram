<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Object</title>
</head>
<body>
<%
        String responseCheck = request.getParameter("office");
        if (responseCheck != null ) {
                 response.setStatus(response.SC_MOVED_TEMPORARILY);
                 response.setHeader("Location", "response-redirect.jsp?office=" + responseCheck);
        }
        
        String errorCheck = request.getParameter("error");
        if (errorCheck != null ) {
                 int x = 0;
                 if (x == 0)
                         throw new RuntimeException("Exception has been raised");
        }
%>
<%

   int serverPort =  request.getServerPort() ;
   out.println("The Server is running on port " + String.valueOf(serverPort) + "<br>");
   out.println("Servlet Name is " + config.getServletName() + "<br>");
   out.println("Server Info:" + application.getServerInfo() + "<br>");
   
   String pageName = page.toString();
   out.println("The name of the page is " + pageName + "<br>");
   
   pageContext.setAttribute("userid", "vinyas vaishak");
   out.println("userId attribute from pageContext: " + pageContext.getAttribute("userid") + "<br>");    
%>
<a href="index.jsp?office=mangalore">Show usage of response object</a><br>
<a href="index.jsp?error=1">Show usage of error  object</a><br>


<%
   if (response.containsHeader("Office"))
            out.println("Current location is " + response.getHeader("Office"));
 %>
</body>
</html>