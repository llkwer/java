package test24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	
	public static void main(String[] args) {
		Connection con = null;
		String url = "jdbc:mariadb://127.0.0.1:3306/oreo";
		String id = "root";
		String pwd = "12345678";
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection(url, id, pwd);
			String sql = "select * from user_info where uNum=2";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String str = rs.getString("uNum")+",";
				str +=rs.getString("uName")+",";
				str +=rs.getString("uAge")+",";
				str +=rs.getString("uAddress")+",";
				System.out.println(str);
			}
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			if(con!=null) {
				try {
					con.close();
				}catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
