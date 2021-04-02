package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBC2 {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String user = "PC25";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null; //select가 아니면 굳이 없어도 됨
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT * FROM CART WHERE CART_MEMBER = ?"; //?를 대신할 값을 따로 넣어줌
			ps = con.prepareStatement(sql);
			ps.setString(1, "c001"); //파라미터 즉, 첫번째오는 값에 "a001"이라는 값을 넣겠다는 의미, 여기서 String쓰는 이유는 지금 받는 애들이 varchar타입이기 때문
//			ps.setInt(parameterIndex, x);
//			ps.setDate(parameterIndex, x);
//			ps.setObject(parameterIndex, x); 타입에 맞게 쓰면되는데 굳이 고민하고 싶지 않으면 Object 쓰면 됨
			
			rs = ps.executeQuery(); //select가 아니면 executeUpdate임, 역할은 거의 똑같은데 리턴타입이 다름
			
			ResultSetMetaData metaData = rs.getMetaData(); //MetaData는 데이터에 대한 데이터, 넘어온 데이터중 컬럼은 몇 개인지 로우는 몇 로우인지 등등을 말해주는걸 MetaData라고 함
			
			int columnCount = metaData.getColumnCount();
			
			while(rs.next()){
				for(int i = 1; i <= columnCount; i++){ //i가 1부터인 이유는 인덱스가 1부터 시자하기 때문
					Object value = rs.getObject(i);
					System.out.print(value + "\t"); //타입이 여러개일 수 있기 때문에 Object를 썼음
				}
				System.out.println();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			//닫을때는 연것의 역순으로
			if(rs != null) try{ rs.close(); } catch(Exception e){}
			if(ps != null) try{ ps.close(); } catch(Exception e){}
			if(con != null) try{ con.close(); } catch(Exception e){}
		}
	}

}
