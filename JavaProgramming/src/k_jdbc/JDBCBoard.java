package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import e_oop.ScanUtil;

public class JDBCBoard {

	public static void main(String[] args) {
		/*
		 * TB_JDBC_BOARD 테이블을 사용해 게시판 프로그램을 만들어주세요.
		 */
				
		new JDBCBoard().start();
		
	}
	/*
	void start(){
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String user = "PC25";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		int input1 = 0;
		int input2 = 0;
		int input3 = 0;
		
		System.out.println("1.게시판 글 목록\t2.게시판 글 등록\t0.종료하기");
		while(true){
			input1 = ScanUtil.nextInt();
			switch(input1){
			case 1: select();
					break;
			case 2: insert();
					break;
			case 0: System.out.println("종료되었습니다.");
					System.exit(0);
			default : System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}
		
	}
	
	private void select(){
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String user = "PC25";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT * FROM TB_JDBC_BOARD ORDER BY BOARD_NO DESC";
			
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			ResultSetMetaData meta = rs.getMetaData();
			
			int columnCount = meta.getColumnCount();
			
			System.out.println("번호\t\t제목\t\t내용\t\t작성자\t\t작성일");
			while(rs.next()){
				for(int i = 1; i <= 2; i++){
					Object value = rs.getObject(i);
					System.out.print(value + "\t\t");
				}
				for(int i = 3; i <= 4; i++){
					Object value = rs.getObject(i);
					System.out.print(value + "\t\t");
				}
				for(int i = 5; i <= columnCount; i++){
					Object value = rs.getObject(i);
					System.out.print(value + "\t");
				}
				
				
				System.out.println();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try{rs.close();} catch(Exception e){}
			if(ps != null) try{ps.close();} catch(Exception e){}
			if(con != null) try{con.close();} catch(Exception e){}
		}
		
		System.out.println("1.게시글 수정\t2.게시글 삭제\t3.작성자 이름으로 게시글 찾기\t4.뒤로 가기");
		select2 : while(true){
			int input = ScanUtil.nextInt();
			switch(input){
			case 1: update();
					break;
			case 2: delete();
					break;
			case 3: select2();
			case 4: System.out.println("1.게시판 글 목록\t2.게시판 글 등록");
					break select2;
			}
		}
	}
	
	private void select2(){
		
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String user = "PC25";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		Object input1 = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT * FROM TB_JDBC_BOARD WHERE USER_ID = ? ORDER BY BOARD_NO DESC";
			
			ps = con.prepareStatement(sql);
			System.out.println("작성자 이름을 입력해주세요");
			input1 = ScanUtil.nextLine();
			ps.setObject(1, input1);
			
			rs = ps.executeQuery();
			
			ResultSetMetaData meta = rs.getMetaData();
			
			int columnCount = meta.getColumnCount();
			System.out.println("번호\t제목\t내용\t작성자\t작성일");
			while(rs.next()){
				for(int i = 1; i <= columnCount; i++){
					Object value = rs.getObject(i);
					System.out.print(value + "\t");
				}
				System.out.println();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try{rs.close();} catch(Exception e){}
			if(ps != null) try{ps.close();} catch(Exception e){}
			if(con != null) try{con.close();} catch(Exception e){}
		}
	}
	
	
	
				
		
	
	private void insert(){
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String user = "PC25";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			Object inputTable1 = null;
			Object inputTable2 = null;
			Object inputTable3 = null;
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "INSERT INTO TB_JDBC_BOARD (BOARD_NO, TITLE, CONTENT, USER_ID, REG_DATE)"
					+ " VALUES(("
					+ "SELECT NVL(MAX(BOARD_NO),0) + 1 FROM TB_JDBC_BOARD"
					+ "), ?, ?, ?, SYSDATE)";
			
			ps = con.prepareStatement(sql);
			System.out.println("제목을 입력해주세요>");
			inputTable1 = ScanUtil.nextLine();
			ps.setObject(1, inputTable1);
			System.out.println("내용을 입력해주세요>");			
			inputTable2 = ScanUtil.nextLine();
			ps.setObject(2, inputTable2);
			System.out.println("작성자이름을 입력해주세요> 단, 작성자의 이름은 반드시a001 ~ x001이어야합니다.");
			inputTable3 = ScanUtil.nextLine();
			ps.setObject(3, inputTable3);
			
			int result = ps.executeUpdate();
			if(result == 1){
				System.out.println("업로드 완료" + result);
			}
			else if(result != 1){
				System.out.println("업로드 실패" + result);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try{rs.close();} catch(Exception e){}
			if(ps != null) try{ps.close();} catch(Exception e){}
			if(con != null) try{con.close();} catch(Exception e){}
		}
		int inputNumber = 0;
		System.out.println("1.조회\t2.수정\t3.삭제\t4.종료");
		while(true){
			inputNumber = ScanUtil.nextInt();
			switch(inputNumber){
			case 1: select();
					break;
			case 2: update();
					break;
			case 3: delete();
					break;
			case 0: System.out.println("종료되었습니다.");
					System.exit(0);
			default : System.out.println("다시 입력해주세요.");
			}
		}
		
	}
	
	private void update(){
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String user = "PC25";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		Object input1 = null;
		Object input2 = null;
		Object input3 = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "UPDATE TB_JDBC_BOARD SET TITLE = ?"
					+ ", CONTENT = ?"
					+ " WHERE USER_ID =  ?";
			ps = con.prepareStatement(sql);
			
			System.out.println("제목 수정");
			input1 = ScanUtil.nextLine();
			ps.setObject(1, input1);
			
			System.out.println("내용 수정");
			input2 = ScanUtil.nextLine();
			ps.setObject(2, input2);
			
			System.out.println("작성자 아이디를 적어주세요");
			input3 = ScanUtil.nextLine();
			ps.setObject(3, input3);
			
			int result = ps.executeUpdate();
			if(result == 1){
				System.out.println("수정이 완료되었습니다.");
			}else{
				System.out.println("다시 시도해주시기 바랍니다.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(ps != null) try{ps.close();} catch(Exception e){}
			if(con != null) try{con.close();} catch(Exception e){}
		}
	}
	
	private void delete(){
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String user = "PC25";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		delete : while(true){
			try {
				con = DriverManager.getConnection(url, user, password);
				
				String sql = "DELETE FROM TB_JDBC_BOARD WHERE USER_ID = ?";
				
				ps = con.prepareStatement(sql);
				System.out.println("삭제하고 싶은 게시물의 유저아이디를 입력해주세요");
				Object input1 = ScanUtil.nextLine();
				ps.setObject(1, input1);
				
				int result = ps.executeUpdate();
				if(result == 1){
					System.out.println("삭제완료");
					break delete;
				}else{
					System.out.println("다시 시도해주시기 바랍니다.");
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally{
				if(ps != null) try{ps.close();} catch(Exception e){}
				if(con != null) try{con.close();} catch(Exception e){}
			}
			
		}
	}
*/
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "PC25";
	String password = "java";
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");
	
	private void start() {
		while(true){
			try {
				con = DriverManager.getConnection(url, user, password);
				
				String sql = "SELECT BOARD_NO, TITLE, CONTENT, USER_ID, REG_DATE FROM TB_JDBC_BOARD";
				ps = con.prepareStatement(sql);
				
				rs = ps.executeQuery();
				
				System.out.println("-----------------------------------");
				System.out.println("번호\t제목\t작성자\t작성일");
				System.out.println("-----------------------------------");
				while(rs.next()){
					java.util.Date date = rs.getDate("reg_date");
					String regDate = format.format(date);
					
					System.out.println(rs.getInt("board_no") + "\t"
							+ rs.getString("title") + "\t"
							+ rs.getString("user_id") + "\t"
							+ regDate);
				}
				System.out.println("-----------------------------------");
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if(rs != null) try { rs.close(); } catch(Exception e) {}
				if(ps != null) try { ps.close(); } catch(Exception e) {}
				if(con != null) try { con.close(); } catch(Exception e) {}
			}
			
			System.out.println("1.조회\t2.등록\t0.종료");
			System.out.print("입력>");
			int input = ScanUtil.nextInt();
			
			switch (input) {
			case 1://조회
				selectBoard();
				break;
				
			case 2://등록
				insertBoard();
				break;
				
			case 0://종료
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
				break;
			}
		}
	}

	private void selectBoard() {
		System.out.print("조회할 게시물 번호>");
		int input = ScanUtil.nextInt();
		int boardNo = 0;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT BOARD_NO, TITLE, CONTENT, USER_ID, REG_DATE"
					+ " FROM TB_JDBC_BOARD"
					+ " WHERE BOARD_NO = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, input);
			
			rs = ps.executeQuery();
			
			while(rs.next()){
				boardNo = rs.getInt("board_no");
				System.out.println("번호\t: " + rs.getInt("board_no"));
				System.out.println("작성자\t: " + rs.getString("user_id"));
				System.out.println("작성일\t: " + rs.getDate("reg_date"));
				System.out.println("제목\t: " + rs.getString("title"));
				System.out.println("내용\t: " + rs.getString("content"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
		System.out.println("1.수정\t2.삭제\t0.목록");
		System.out.print("입력>");
		input = ScanUtil.nextInt();
		
		switch (input) {
		case 1: //수정
			updateBoard(boardNo);
			break;
		case 2: //삭제
			deleteBoard(boardNo);
			break;
		}
	}

	private void updateBoard(int boardNo) {
		System.out.print("제목>");
		String title = ScanUtil.nextLine();
		System.out.print("내용>");
		String content = ScanUtil.nextLine();
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "UPDATE TB_JDBC_BOARD"
					+ " SET TITLE = ?"
					+ " , CONTENT = ?"
					+ " WHERE BOARD_NO = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setInt(3, boardNo);
			
			int result = ps.executeUpdate();
			if(0 < result){
				System.out.println("수정이 완료되었습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
	}

	private void deleteBoard(int boardNo) {
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "DELETE FROM TB_JDBC_BOARD"
					+ " WHERE BOARD_NO = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, boardNo);
			
			int result = ps.executeUpdate();
			if(0 < result){
				System.out.println("삭제가 완료되었습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
	}

	private void insertBoard() {
		System.out.print("제목>");
		String title = ScanUtil.nextLine();
		System.out.print("내용>");
		String content = ScanUtil.nextLine();
		System.out.print("작성자>");
		String user = ScanUtil.nextLine();
		
		try {
			con = DriverManager.getConnection(url, this.user, password);
			
			String sql = "INSERT INTO TB_JDBC_BOARD VALUES("
					+ "(SELECT NVL(MAX(BOARD_NO), 0) + 1 FROM TB_JDBC_BOARD)"
					+ ",?,?,?,SYSDATE)";
			ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setString(3, user);
			
			int result = ps.executeUpdate();
			if(0 < result){
				System.out.println("등록이 완료되었습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
	}
	
}
