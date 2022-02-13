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

    String sql = "SELECT p.name,order_details.price, order_details.date FROM product p, ((orders INNER JOIN  user ON orders.uid = user.id) INNER JOIN order_details ON orders.id = order_details.oid) WHERE p.id = order_details.pid AND user.id=?";

    int id = 1;

    try {
        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1, id);
        rs = st.executeQuery();
//        Class.forName("com.mysql.jdbc.Driver");
//        Statement st = con.createStatement();
//        rs = st.executeQuery(sql);
    } catch (SQLException e) {
        e.printStackTrace();
    }
%>
<%@ include file="uNavbar.html" %>

<table border="1" style="margin:50px;">
    <tr>
        <th>No.</th>
        <th>Name</th>
        <th>Price</th>
        <th>Date</th>
    </tr>
    <% try {
        int i = 1;
        while (true) {
            assert rs != null;
            if (!rs.next()) break; %>
    <tr>
        <td><%=i%>
        </td>
        <td><%=rs.getString(1)%>
        </td>
        <td><%=rs.getString(2)%>
        </td>
        <td><%=rs.getString(3)%>
        </td>
    </tr>
    <% i++;
    }
    } catch (SQLException | IOException e) {
        e.printStackTrace();
    }%>

</table>

</body>
</html>
