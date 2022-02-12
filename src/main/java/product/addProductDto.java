package product;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

//import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connect_db.connect;

@SuppressWarnings("serial")
@WebServlet("/addProductDto")
public class addProductDto extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

        double p_price = Double.valueOf(request.getParameter("p_price"));
        String p_type = request.getParameter("p_type");
        String p_validity = request.getParameter("p_validity");
        String p_creator = request.getParameter("p_creator");

        Random rand = new Random();
        int p_id = rand.nextInt(100000);

        Product product1 = new Product(p_id, request.getParameter("p_name"), request.getParameter("p_des"), p_price);

        String sql = "INSERT INTO product(name, description, price, type, validity, creator) VALUES(?,?,?,?,?,?)";

        try {
            Connection con = new connect().getConnect();
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, product1.getName());
            st.setString(2, product1.getDesc());
            st.setDouble(3, product1.getPrice());
            st.setString(4, p_type);
            st.setString(5, p_validity);
            st.setString(6, p_creator);

            int res = st.executeUpdate();
            System.out.println("Result-> " + res);
            if (res != 0) {
                response.sendRedirect("addProduct.jsp");
            }

        } catch (SQLException | IOException e) {
            e.printStackTrace();
//			e.getMessage();
        }

    }
}
