<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>LogIn</title>
</head>
<body>
<h2>LogIn</h2>
<form action="Login" method="post" style="width: 200px; margin:20px; border:solid 2px; padding:20px;">
    Enter Username : <input type="text" name="uname"> <br><br>
    Enter Password : <input type="password" name="pass"> <br>
    <input type="submit" value="login" style="margin: auto">
    <div>Not a member ? <a href="">Sign up</a></div>
</form>
</body>
</html>