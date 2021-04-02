package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DELETE {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String user = "PC25";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "DELETE FROM CART WHERE CART_NO = ?";
			ps = con.prepareStatement(sql);
			
			ps.setObject(1, "2006040100001");
			
			int result = ps.executeUpdate();
			System.out.println("삭제된 행 : " + result);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(ps != null) try{ps.close();} catch(Exception e){}
			if(con != null) try{con.close();} catch(Exception e){}
		}
	}

}
