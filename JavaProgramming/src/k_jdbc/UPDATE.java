package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UPDATE {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String user = "PC25";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
//			String sql = "UPDATE MEMBER SET MEM_HP = ?"
//					+ ", MEM_MAIL = ?"
//					+ " WHERE MEM_ID = ?";
//	
//			ps = con.prepareStatement(sql);
//			ps.setObject(1, "010-0101-0202");
//			ps.setObject(2, "somethin@naver.com");
//			ps.setObject(3, "a001"); //?갯수만큼 호출해야됨 ?순서대로 1,2,3 이런식으로 순서를 넣으면 됨
			
//			String sql = "INSERT INTO TB_JDBC_BOARD (BOARD_NO, TITLE, CONTENT, USER_ID, REG_DATE)"
//					+ " VALUES (("
//					+ "SELECT NVL(MAX(BOARD_NO), 0) + 1 FROM TB_JDBC_BOARD" //번호 자동생성해줌, 테이블에 데이터값이 하나도 없으면 맥스값이 없을 수 있음 이런경우를 위해서 NVL을 넣어서 널인 경우에는 0을 넣어줄 수 있음
//					+ "), ?, ?, ?, SYSDATE)"; //SYSDATE 현재날짜를 표시해줌
//			ps = con.prepareStatement(sql);
//			ps.setObject(1, "제목입니다.");
//			ps.setObject(2, "내용입니다.");
//			ps.setObject(3, "a001");
			
			String sql = "DELETE FROM TB_JDBC_BOARD WHERE BOARD_NO = ?";
			ps = con.prepareStatement(sql);
			ps.setObject(1, 1);
			
			int result = ps.executeUpdate();
			System.out.println("영향받은 행의 수: " + result);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(ps != null) try{ps.close();} catch(Exception e){}
			if(con != null) try{con.close();} catch(Exception e){}
		}
	}

}
