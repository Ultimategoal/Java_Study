package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static Connection con;
	
	//생성자
	public DBConnection(){
		
		//DriverClass로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "PC25", "java");
			
			System.out.println("연결성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static Connection getCont(){ //여러 클래스에서 지금 이 connection을 공유하고 싶을 때 static 사용해주면 됨
		return con; // 리턴해서 클래스에 보내줌
	}

}
