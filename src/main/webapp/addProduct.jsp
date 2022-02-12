<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>AddProduct</title>
</head>
<body>
<%
    response.setHeader("Cache-Control", "no-cache, no-store,must-revalidate");
    if (session.getAttribute("username") == null) {
        response.sendRedirect("login.jsp");
    }
%>
<%@ include file="Navbar.html" %>
<h2>Add Product to Inventory</h2>
<form action="addProductDto" method="post" style="margin:25px;">
    Product Name<br> <input type="text" name="p_name"><br>
    <br> Product Description<br>
    <textarea name="p_des" rows="5" cols="30"></textarea>
    <br> <br> Price<br> <input type="text" name="p_price"><br>
    <br> Product Type<br> <input type="text" name="p_type"><br>
    <br> Validity<br> <input type="text" name="p_validity"><br>
    <br> Creator Company<br> <input type="text" name="p_creator">
    <br> <br> <input type="submit" value="Add Product">
</form>
</body>
</html>