package k_jdbc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import e_oop.ScanUtil;

public class JDBCTest1 {

	public static void main(String[] args) {
		JDBCUtil jdbc = JDBCUtil.getInstance(); //객체 생성을 하지 않고 싱글톤 패턴으로 만들었으면 getInstacne라는 메서드를 이용해서 객체를 빌려와야함
		
		String sql = "SELECT * FROM MEMBER WHERE MEM_ID = 'a001'";
		
		Map<String, Object> map = jdbc.selectOne(sql);
		
		if(map == null){//밑에 처럼 비교하는것보단 이렇게 비교하는게 의미가 더 명확해 보임
			//조회 결과가 있는지 확인
		}
		
		if(0 < map.size()){//HashMap에 데이터가 하나라도 들어있는지 확인
			
		}
		
		for(String key : map.keySet()){
			System.out.println(map.get(key) + "\t");
		}
		//객체를 하나 빌려왔음 또는 객체를 생성했음
		
//		String sql = "SELECT * FROM CART WHERE CART_MEMBER = ?";
//		List<Object> param = new ArrayList<>();
//		param.add("a001");
//		
//		List<Map<String, Object>> list = jdbc.selectList(sql, param);
//		//이렇게 쓰면 훨씬 더 간결하게 JDBC를 사용할 수 있음
		
//		if(0 < list.size()){ selectList의 경우에는 null로 확인 못하고 이렇게 확인 해야함
//			
//		}
//		
//		for(int i = 0; i < list.size(); i++){
//			Map<String, Object> map = list.get(i);
//			for(String key : map.keySet()){
//				System.out.println(map.get(key) + "\t");
//			}
//			System.out.println();
//		}
//		
//		String sqlSelect = "SELECT * FROM TB_JDBC_BOARD";
//		list = jdbc.selectList(sqlSelect);
//		
//		for(int i = 0; i < list.size(); i++){
//			Map<String, Object> map1 = list.get(i);
//			for(String key : map1.keySet()){
//				System.out.println(map1.get(key) + "\t");
//			}
//			System.out.println();
//		}
		
//		String sqlSelectOne = "SELECT * FROM TB_JDBC_BOARD WHERE USER_ID = 'r001'";
//		Map<String, Object> map1 = new HashMap<String, Object>();
//		map1 = jdbc.selectOne(sqlSelectOne);
//		for(String key : map1.keySet()){
//			System.out.println(map1.get(key) + "\t");
//		}
//		System.out.println();
//		
//		String sqlSelectOneParam = "SELECT * FROM TB_JDBC_BOARD WHERE USER_ID = ?";
//		map1 = new HashMap<String, Object>();
//		List<Object> param = new ArrayList<>();
//		param.add("r001");
//		map1 = jdbc.selectOne(sqlSelectOneParam, param);
		
		
		
//		
//		String sqlUpdate = "UPDATE TB_JDBC_BOARD SET TITLE = ?, CONTENT = ? WHERE USER_ID = ?";
//		param = new ArrayList<>();
//		Object input1 = null; Object input2 = null; Object input3 = null;
//		System.out.println("제목 수정 : ");
//		input1 = ScanUtil.nextLine();
//		param.add(input1);
//		System.out.println("내용 수정 : ");
//		input2 = ScanUtil.nextLine();
//		param.add(input2);
//		System.out.println("작성자 이름 : ");
//		input3 = ScanUtil.nextLine();
//		param.add(input3);
//		
//		int update = jdbc.update(sqlUpdate, param);
		
//		String sqlInsert = "INSERT INTO TB_JDBC_BOARD (BOARD_NO, TITLE, CONTENT, USER_ID, REG_DATE) VALUES((SELECT NVL(MAX(BOARD_NO),0) + 1 FROM TB_JDBC_BOARD), ?, ?, ?, SYSDATE)";
//		List<Object> param1 = new ArrayList<>();
//		Object input11 = null; Object input22 = null; Object input33 = null;
//		System.out.println("제목 수정 : ");
//		input11 = ScanUtil.nextLine();
//		param.add(input11);
//		System.out.println("내용 수정 : ");
//		input22 = ScanUtil.nextLine();
//		param.add(input22);
//		System.out.println("작성자 이름 : ");
//		input33 = ScanUtil.nextLine();
//		param.add(input33);
//		
//		int insert = jdbc.insert(sqlInsert, param1);
//		System.out.println(insert);
	}

}
