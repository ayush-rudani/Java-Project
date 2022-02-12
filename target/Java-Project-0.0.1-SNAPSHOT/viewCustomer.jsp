<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> --%>
<html>
<head>
    <style type="text/css">
        th, td {
            padding: 12px 10px;
        }
    </style>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>View Customer</title>
</head>
<body>
<%@page
        import="java.io.IOException,java.sql.*,javax.servlet.*,connect_db.connect" %>
<%
    response.setHeader("Cache-Control", "no-cache, no-store,must-revalidate");
    if (session.getAttribute("username") == null) {
        response.sendRedirect("login.jsp");
    }
%>
<%@ include file="Navbar.html" %>

<%
    Connection con = new connect().getConnect();
    ResultSet rs = null;
    try {
        String sql = "SELECT * FROM user";
        Statement st = con.createStatement();
        rs = st.executeQuery(sql);
    } catch (SQLException e) {
        e.printStackTrace();
    }
%>

<table border="1" style="margin:50px;">
    <tr>
        <th>Id</th>
        <th>Customer Name</th>
        <th>Contact</th>
    </tr>
    <% try {
        while (rs.next()) { %>
    <tr>
        <td><%=rs.getString(1)%>
        </td>
        <td><%=rs.getString(2)%>
        </td>
        <td><%=rs.getString(3)%>
        </td>
    </tr>
    <% }
    } catch (SQLException | IOException e) {
        e.printStackTrace();
    }%>

</table>

</body>
</html>