package littleProject;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import k_jdbc.JDBCUtil;

public class JDBCMOVIEUtil {

	private JDBCMOVIEUtil(){
		
	}
	
	private static JDBCMOVIEUtil instance;
	
	public static JDBCMOVIEUtil getInstance(){
		if(instance == null){
			instance = new JDBCMOVIEUtil();
		}
		return instance;
	}
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "PC25";
	String password = "java";

	
	java.sql.Connection con = null;	//연결된 정보
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	
	public Map<String, Object> selectOne(String sql){
		
		Map<String, Object> row = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();
			
			if(rs.next()){
				row = new HashMap<>();
				for(int i = 1; i <= columnCount; i++){
					row.put(metaData.getColumnName(i), rs.getObject(i));
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(rs != null) try{rs.close();} catch(Exception e){}
			if(ps != null) try{ps.close();} catch(Exception e){}
			if(con != null) try{con.close();} catch(Exception e){}
		}
		
		return row;
	}
	
	public Map<String, Object> selectOne(String sql, List<Object> param){
		Map<String, Object> row = null;
		try {
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(sql);
			
			for(int i = 0; i < param.size(); i++){
				ps.setObject(i + 1, param.get(i));
			}
			
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();
			if(rs.next()){
				row = new HashMap<>();
				for(int i = 1; i <= columnCount; i++){
					row.put(metaData.getColumnName(i), rs.getObject(i));
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(rs != null) try{rs.close();} catch(Exception e){}
			if(ps != null) try{ps.close();} catch(Exception e){}
			if(con != null) try{con.close();} catch(Exception e){}
		}
		
		return row;
	}
	
	public List<Map<String, Object>> selectList(String sql){
		List<Map<String, Object>> list = new ArrayList<>();
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();
			while(rs.next()){
				Map<String, Object> row = new HashMap<String, Object>();
				for(int i = 1; i <= columnCount; i++){
					row.put(metaData.getColumnName(i), rs.getObject(i));
				}
				list.add(row);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(rs != null) try{rs.close();} catch(Exception e){}
			if(ps != null) try{ps.close();} catch(Exception e){}
			if(con != null) try{con.close();} catch(Exception e){}
		}
		
		return list;
	}
	
	public List<Map<String, Object>> selectList(String sql, List<Object> param){
		List<Map<String, Object>> list = new ArrayList<>();
		try {
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
			for(int i = 0; i < param.size(); i++){ //param이 ArrayList이기 때문에 여러 값이 있을 수 있어서 for문을 돌려야함
				ps.setObject(i + 1, param.get(i));
			}
			
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();
			while(rs.next()){
				Map<String, Object> row = new HashMap<String, Object>();
				for(int i = 1; i <= columnCount; i++){
					row.put(metaData.getColumnName(i), rs.getObject(i));
				}
				list.add(row);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(rs != null) try{rs.close();} catch(Exception e){}
			if(ps != null) try{ps.close();} catch(Exception e){}
			if(con != null) try{con.close();} catch(Exception e){}
		}
		
		return list; //여기서 리턴하려면 try/catch 밖에서 변수를 만들어야함
	}
	public int update(String sql){
		
		int result = 0;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(sql);
			
			result = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(ps != null) try{ps.close();} catch(Exception e){}
			if(con != null) try{con.close();} catch(Exception e){}
		}
		
		return result;
	}
	
	public int update(String sql, List<Object> param){
		
		int result = 0;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
			for(int i = 0; i < param.size(); i++){
				ps.setObject(i + 1, param.get(i));
			}
			
			result = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(ps != null) try{ps.close();} catch(Exception e){}
			if(con != null) try{con.close();} catch(Exception e){}
		}
		
		return result;
	}
}
