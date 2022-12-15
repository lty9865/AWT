package Awt_login;

import java.sql.*;
import java.util.ArrayList;
import java.sql.Connection;

public class Awt_DAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521/xe";
	String user = "c##green";
	String password = "green1234";

	private Connection con;
	private Statement stmt;
	private ResultSet rs;

	public ArrayList<Awt_Vo> list(String userID, String userPW) {
		ArrayList<Awt_Vo> list = new ArrayList<Awt_Vo>();

		try {
			connDB();
			
			String query = "SELECT * FROM LOGIN";
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				String userID1 = rs.getString("user_ID");
				String userPW1 = rs.getString("user_PW");
				
				Awt_Vo data = new Awt_Vo(userID1,userPW1);
				list.add(data);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public void connDB() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			stmt = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
