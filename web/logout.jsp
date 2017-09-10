<%-- 
    Document   : logout
    Created on : Apr 3, 2017, 12:41:17 AM
    Author     : Vicky
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout Page</title>
    </head>
    <body>
        <%
        session.setAttribute("username", null);
        session.setAttribute("op", null);
        session.invalidate();
        
        response.sendRedirect("Homepage.jsp");
        
        
        
        %>
    </body>
</html>
