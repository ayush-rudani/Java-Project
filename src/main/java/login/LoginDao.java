package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.SQLException;
import connect_db.connect;

public class LoginDao {
    //	String url = "jdbc:mysql://localhost:3306/java-project";
    String sql1 = "SELECT * FROM admin WHERE username=? AND password=?";
    String sql2 = "SELECT * FROM user WHERE email=? AND password=?";


    public int check(String uname, String pass) {
        // public static void main(String[] args) throws Exception {
        try {

            Class.forName("com.mysql.jdbc.Driver");
//			Connection con = DriverManager.getConnection(url, "root", "");
            Connection con = new connect().getConnect();

            PreparedStatement st1 = con.prepareStatement(sql1);
            st1.setString(1, uname);
            st1.setString(2, pass);
            PreparedStatement st2 = con.prepareStatement(sql2);
            st2.setString(1, uname);
            st2.setString(2, pass);
//			System.out.println("uname: " + uname);
//			System.out.println("pass: " + pass);
//			st.setString(1, "ayush");
//			st.setString(2, "ar");
            ResultSet rs1 = st1.executeQuery();
            ResultSet rs2 = st2.executeQuery();
            if (rs1.next()) {
                return 1;
                // System.out.println("True");
            } else if (rs2.next()) {
                return 2;
            }
            // else {
            // System.out.println("False");
            // }
        } catch (Exception e) {
            e.printStackTrace();
//            e.getMessage();
        }
//        return false;
        return 0;
    }
}
