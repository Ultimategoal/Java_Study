package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {
	
	
	public JDBCTest(){
		try {
			//jdbc class 로드 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
				
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

	public static void main(String[] args) {
				
		JDBCTest  jtest = new JDBCTest();
		
		//connection 객체 
		//url, user, pass - db연결 
		String url ="jdbc:oracle:thin:@localhost:1521/xe";
		System.out.println("연결성공");
		
		//connection 객체 
		try {
			Connection  con = DriverManager.getConnection(url, "pc25", "java");
			System.out.println("연결성공");
			
			
			//sql문장 - select  -  executeQuery() - 결과값 :ResultSet , 
			// insert , delete , update    -    executeUpdate() - 결과값 int 
			String sql = "select * from member";
						
			//실행 객체 
			Statement stmt =  con.createStatement();
					
			//실행 select
			ResultSet rs =  stmt.executeQuery(sql);
			
			while(rs.next()){
				
				String id = rs.getString("mem_id");
				String name = rs.getString("mem_name");
				String tel = rs.getString("mem_hp");
				
				System.out.println(id + " " + name + " " + tel);
			}
			
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}

