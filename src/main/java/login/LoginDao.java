package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.SQLException;
import connect_db.connect;

public class LoginDao {
//	String url = "jdbc:mysql://localhost:3306/java-project";
	String sql = "SELECT * FROM admin WHERE username=? AND password=?";

	public boolean check(String uname, String pass) {
		// public static void main(String[] args) throws Exception {

		try {

			Class.forName("com.mysql.jdbc.Driver");
//			Connection con = DriverManager.getConnection(url, "root", "");
			Connection con = new connect().getConnect();

			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, uname);
			st.setString(2, pass);
//			System.out.println("uname: " + uname);
//			System.out.println("pass: " + pass);
//			st.setString(1, "ayush");
//			st.setString(2, "ar");

			ResultSet rs = st.executeQuery();
			if (rs.next()) {
				return true;
				// System.out.println("True");
			}
			// else {
			// System.out.println("False");
			// }
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
		}
		return false;
	}
}
