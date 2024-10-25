package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;

public class signinDao {

//下準備＜DM＞
		private static final String URL ="jdbc;mysql://localhost/shoestock";
		private static final String USER ="root";
		private static final String PASSWORD ="";
		private static final String DRIVER = "com.mysql.jdbc.Driver";
		
//例外処理
		private Connection getConnection()throws
			ClassNotFoundException,SQLException{
//	forNameはメソッド
			Class.forName(DRIVER);
			Connection con =DriverManager.getConnection(URL,PASSWORD,USER);
			return con;
		}
//	接続
		public User searchById(int id) {
			User uu null;
			String sql ="SELECT id,name,role"
						+" FROM user Where id =?";
			
//	新規登録までの再現
		try(Connection con =getConnection();
				PreparedStatement pp = con.prepareStatement(sql);){
				pp.setInt(1, id);
				ResultSet rs = pp.executeUpdate();
				
				
		}
}
		
				
				
			

}
