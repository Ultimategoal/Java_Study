package k_jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JDBCUtilTestBoard {

	public static void main(String[] args) {

		JDBCUtil jdbc = JDBCUtil.getInstance();
		
		String sql = "SELECT * FROM TB_JDBC_BOARD";
		
		Map<String, Object> map = jdbc.selectOne(sql);
		
		for(String key : map.keySet()){
			System.out.println(map.get(key));
		}
		
		System.out.println("---------------------------------------");
		
		sql = "SELECT * FROM TB_JDBC_BOARD WHERE USER_ID = ?";
		List<Object> param = new ArrayList<>();
		param.add("r001");
		map = jdbc.selectOne(sql, param);
		
		for(String key : map.keySet()){
			System.out.println(map.get(key));
		}
		
		System.out.println("--------------------------------------------");
		
		sql = "SELECT * FROM TB_JDBC_BOARD";
		List<Map<String, Object>> list = jdbc.selectList(sql);
		
		for(int i = 0; i < list.size(); i++){
			map = list.get(i);
			for(String key : map.keySet()){
				System.out.print(map.get(key) + "\t");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------------");
		
		sql = "SELECT * FROM TB_JDBC_BOARD WHERE USER_ID = ?";
		param = new ArrayList<>();
		param.add("r001");
		
		list = jdbc.selectList(sql, param);
		
		for(int i = 0; i < list.size(); i++){
			map = list.get(i);
			for(String key : map.keySet()){
				System.out.println(map.get(key) + "\t");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------------------");
		
		sql = "UPDATE TB_JDBC_BOARD SET CONTENT = 'ASDFASDFASDF' WHERE USER_ID = 'r001'";
		int result = 0;
		result = jdbc.update(sql);
		
		System.out.println("수정된 행의 수 : " + result);
		
		System.out.println("------------------------------------------------------");
		
		sql = "UPDATE TB_JDBC_BOARD SET CONTENT = ? WHERE USER_ID = ?";
		result = 0;
		param = new ArrayList<>();
		param.add("qwerqwerqwer");
		param.add("r001");
		
		result = jdbc.update(sql, param);
		
		System.out.println("수정된 행의 수 : " + result);
		
		System.out.println("--------------------------------------------------------");
		
		sql = "INSERT INTO TB_JDBC_BOARD VALUES((SELECT NVL(MAX(BOARD_NO),0) + 1 FROM TB_JDBC_BOARD), ?, ?, ?, SYSDATE)";
		result = 0;
		param = new ArrayList<>();
		param.add("thisistest");
		param.add("thisistest");
		param.add("u001");
		
		result = jdbc.update(sql, param);
		
		System.out.println("수정된 행의 수 : " + result);
		
		System.out.println("------------------------------------------------------------");
		
		sql = "DELETE FROM TB_JDBC_BOARD WHERE USER_ID = ?";
		result = 0;
		param = new ArrayList<>();
		param.add("u001");
		
		result = jdbc.update(sql, param);
		
		System.out.println("수정된 행의 수 : " + result);
		
	}

}
