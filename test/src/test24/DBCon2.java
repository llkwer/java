package test24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBCon2 {
	public static void main(String[] args) {
		Connection con;
		String url = "jdbc:mariadb://127.0.01:3306/oreo";
		String id = "root";
		String pwd = "12345678";
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection(url, id, pwd);
			Statement stmt = con.createStatement();
			String sql = "delete from user_info where uNum=1";
			int cnt = stmt.executeUpdate(sql);
			if(cnt==1) {
				System.out.println("1번이 삭제가 잘 됐내요~~");
			}else {
				System.out.println("삭제가 안 됐다~~1번이라는거 없는것 같다~");
			}
			sql = "insert into user_info(uName, uAge, uAddress, uEtc)";
			sql +="values('애니','20','미국','겜캐릭')";
			
			sql = "update user_info set uEtc='테스트'where uNum=3";
			
			cnt = stmt.executeUpdate(sql);
			if(cnt==1) {
				System.out.println("등록이 잘 됐내요");
			}else {
				System.out.println("등록 안 된듯~");
			}
			
			sql = "select*from user_info";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int uNum = rs.getInt("uNum");
				String uName = rs.getString("uName");
				int uAge = rs.getInt("uAge");
				String uAddress = rs.getString("uAddress");
				String uEtc = rs.getString("uEtc");
				System.out.println(uNum+","+uName+","+uAge+","+uAddress+","+uEtc);
			}
			System.out.println("연결 성공!!");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
		
	}

}
