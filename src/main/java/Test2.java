import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Test2")
public class Test2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		String url = "jdbc:mysql://localhost:3306/java-project";
		try (Connection con = DriverManager.getConnection(url, "root", "")) {
			try (Statement stmt = con.createStatement()) {
				try (ResultSet rs = stmt.executeQuery("SELECT * FROM product")) {
					while (rs.next()) {
						System.out.println("id: " + rs.getString(1) + " Name: " + rs.getString(2));
					}
				}
			}
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
		}
	}

}
