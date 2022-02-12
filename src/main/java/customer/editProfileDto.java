package customer;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connect_db.connect;
import order.Address;

@WebServlet("/editProfileDto")
public class editProfileDto {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        String sql = "SELECT * FROM user WHERE id=?";
        int id = 1;
        try {
            Connection con = new connect().getConnect();
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();

            String sql2 = "UPDATE user SET name = ?, mobile = ?, dob = ?, email = ?, h_no = ?, street = ?, city = ?, state = ?, pincode = ? WHERE user.id = ?";

            if (rs.next()) {
//                id = rs.getInt(1);
                Address add = new Address(request.getParameter("h_no"), request.getParameter("street"), request.getParameter("city"), request.getParameter("state"), request.getParameter("pincode"));

                Customer c1 = new Customer(request.getParameter("name"), request.getParameter("mobile"), request.getParameter("dob"), request.getParameter("email"), add);

                st = con.prepareStatement(sql2);

                st.setString(1, c1.getName());
                st.setString(2, c1.getPhone_no());
                st.setString(3, c1.getDOB());
                st.setString(4, c1.getEmail());
                st.setString(5, add.getHome_no());
                st.setString(6, add.getStreet_name());
                st.setString(7, add.getCity());
                st.setString(8, add.getState());
                st.setString(9, add.getPincode());
                st.setInt(10, id);

                int res = st.executeUpdate();
                if (res != 0) {
                    response.sendRedirect("editProfile.jsp");
                }
            }

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }

    }
}
