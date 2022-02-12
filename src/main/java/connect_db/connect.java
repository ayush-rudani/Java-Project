package connect_db;

import java.sql.Connection;
import java.sql.DriverManager;

public class connect {

	public Connection getConnect() {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/java-project";
		try {
			con = DriverManager.getConnection(url, "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
