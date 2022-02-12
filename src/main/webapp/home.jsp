<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>

<%@ page
        import="customer.*, order.*,product.*,java.sql.*,java.io.*,java.util.*" %>
<%@ page import="javax.servlet.RequestDispatcher" %>
<%@page import="java.text.SimpleDateFormat" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Home</title>
</head>
<body>
<%
    response.setHeader("Cache-Control", "no-cache, no-store,must-revalidate");
    if (session.getAttribute("username") == null) {
        response.sendRedirect("login.jsp");
    }
%>
<%@ include file="Navbar.html" %>

<div style="text-align: center;font-size: x-large;">Welcome ${username}</div>

</body>
</html>



