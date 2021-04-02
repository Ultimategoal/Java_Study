package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args) {
		/*
		 * JDBC(Java Database Connectivity)
		 * -자바의 데이터베이스를 연결해주는 라이브러리
		 * -ojdbc : 오라클 JDBC
		 * 
		 * JDBC 작성 단계
		 * 1. Connection 생성(DB 연결)
		 * 2. Statement 생성(쿼리 작성)
		 * 3. Query 실행
		 * 4. ResultSet 에서 결과 추출(select인 경우)
		 * 5. ResultSet, Statement, Connection닫기
		 */
		
		//데이터베이스 접속 정보
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String user = "PC25";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		//try/catch를 쓰기 위해 3개의 변수를 생성
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT * FROM MEMBER"; //멤버 테이블의 모든 데이터를 조회
			ps = con.prepareStatement(sql); //쿼리까지 준비됐음 실행만 하면됨
			
			//실행 할 수 있는 두 가지 경우
			
			//select
			rs = ps.executeQuery(); //ResultSet 타입으로 리턴
			//select인 경우 위에처럼 하면 됨
			//insert,update,delete
//			int result = ps.executeUpdate(); int타입의 값을 리턴해줌, 리턴 값이 0이 나오면 쿼리가 제대로 실행이 안된경우
			//영향 받은 행의 개수
			
			//select인 경우에만 ResultSet에서 결과 추출
			while(rs.next()){ //다음 행을 바라보면서 다음 행이 존재하는지 여부를 리턴해준다.
				//한줄 한줄 내려가면서 데이터를 추출해주는게 next라는 메서드가 하는 역할임
				String memId = rs.getString(1); //get이 넣을 수 있는 파라미터 종류는 2가지가 있는데 첫 번째는 인덱스를 넣는 방법이 있는데 1를 그냥 넣으면 첫번째 행을 추출함
				String memPass = rs.getString("MEM_PASS"); //두 번째는 컬럼명을 통해서 가져오는 방법이 있음
				System.out.println("MEM_ID :" + memId + "/ MEM_PASS : " + memPass);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
			//닫을 때는 연 것의 역순으로 닫아줘야함
		}
		//컴파일 에러 발생해서 try/catch 써야함, 리턴해주는게 Connection임
		//DriverManager >> 데이터베이스에 접속하기 위한 드라이버
	}

}