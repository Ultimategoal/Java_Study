package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class INSERT {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String user = "PC25";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "INSERT INTO CART(CART_MEMBER, CART_NO, CART_PROD, CART_QTY) VALUES (?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setObject(1, "a001");
			ps.setObject(2, "2006040100001");
			ps.setObject(3, "P101000001");
			ps.setObject(4, "10");
			
			int result = ps.executeUpdate();
			System.out.println(result);
			
			System.out.println("변경된 행: " + result);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(ps != null) try{ps.close();} catch(Exception e){}
			if(con != null) try{con.close();} catch(Exception e){}
		}
				
	}

}
