import java.sql.*;

public class test {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/java-project";
		try (Connection con = DriverManager.getConnection(url, "root", "")) {
			try (Statement stmt = con.createStatement()) {
				try (ResultSet rs = stmt.executeQuery("SELECT * FROM product")) {
					while (rs.next()) {
						System.out.println("id: " + rs.getString(1) + " Name: " + rs.getString(2));
					}
				}
			}
		}
	}

}
