<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Profile</title>
</head>
<body>
<%@ include file="uNavbar.html" %>
<h2>Edit Details</h2>
<div>
    <form action="editProfileDto" method="post" style="margin:25px;">
        Name<br>
        <input type="text" name="name"><br><br>
        Mobile<br>
        <input type="text" name="mobile"><br><br>
        DOB<br>
        <input type="text" name="dob" style="width: 100px;"><br><br>
        Email<br>
        <input type="text" name="email"><br><br>
        <hr style="width: 200px; display: inline-block;text-align: left">
        <br><br>
        House No.<br>
        <input type="text" name="h_no" style="width: 60px;"><br><br>
        Street<br>
        <input type="text" name="street"><br><br>
        City<br>
        <input type="text" name="city"><br><br>
        State<br>
        <input type="text" name="state"><br><br>
        Pincode<br>
        <input type="text" name="pincode" style="width: 100px;"><br><br>
        <input type="submit" value="Update Profile">
    </form>
</div>
</body>
</html>
