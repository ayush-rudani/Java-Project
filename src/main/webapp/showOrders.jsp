<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style type="text/css">
        th, td {
            padding: 12px 10px;
        }
    </style>
    <title>My Orders</title>
</head>
<body>
<%@page
        import="java.io.IOException,java.sql.*,javax.servlet.*,connect_db.connect" %>
<%
    Connection con = new connect().getConnect();
    ResultSet rs = null;
    String sql = "SELECT p.name,p.price FROM user u, orders o, product p order_details od WHERE "
    try {

    } catch (SQLException e) {
        e.printStackTrace();
    }
%>
<%@ include file="uNavbar.html" %>

</body>
</html>
