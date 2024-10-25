package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class signinDao {

//下準備＜DM＞
		private static final String URL ="jdbc:mysql://localhost/shoestock";
		private static final String USER ="root";
		private static final String PASSWORD ="";
//		DRIVERの新しいバージョンにすべき？（"com.mysql.cj.jdbc.Driver")
		private static final String DRIVER = "com.mysql.jdbc.Driver";
		
//例外処理
		private Connection getConnection()throws
			ClassNotFoundException,SQLException{
//	forNameはメソッド。接続
			Class.forName(DRIVER);
			Connection con =DriverManager.getConnection(URL,PASSWORD,USER);
			return con;
		}
//	
		public boolean registerUser(String name,String role) {
			boolean isRegistered = false;
			String sql ="INSERT INTO user"
					 + " (name,role) VALUES (?,?)";
			
//	新規登録までの再現
		try(Connection con =getConnection();
				PreparedStatement pp = con.prepareStatement(sql);){
				pp.setString(1, name);
				pp.setString(2, role);
				
				int result= pp.executeUpdate();
				if(result > 0) {
					isRegistered = true;
				}
				}catch(ClassNotFoundException e) {
				 System.err.println(e.getMessage());
				}catch(SQLException e) {
					System.err.println(e.getMessage());
				}
				return isRegistered;
		}
}
		
				
				
			


