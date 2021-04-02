package k_jdbc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import e_oop.ScanUtil;

public class JDBCUtillBoard {

	public static void main(String[] args) {
		JDBCUtil jdbc = JDBCUtil.getInstance();
		int input = 0;
		int input1 = 0; int inpu2 = 0; int input3 = 0;
		Object inputParam1  = null; Object inputParam2 = null; Object inputParam3 = null;
		Object inputDelete = null;
		Object inputSelect = null;
		String inputCheck = null;
		Object inputInsert1 = null; Object inputInsert2 = null; Object inputInsert3 = null;
		
		Map<String, Object> map = new HashMap<>();
		List<Map<String, Object>> list = jdbc.selectList("SELECT * FROM TB_JDBC_BOARD ORDER BY REG_DATE DESC");
		
		List<Object> param = new ArrayList<>();
		
		
		
		
		
		while(true){
			System.out.println("1게시판 목록\t2.게시판 등록");
			input = ScanUtil.nextInt();
			System.out.println("번호\t제목\t내용\t작성자\t작성일");
			System.out.println("----------------------------------------------------------------------");
			switch(input){
			case 1: for(int i = 0; i < list.size(); i++){
						map = list.get(i);
							System.out.print(map.get("BOARD_NO") + "\t");
							System.out.print(map.get("TITLE") + "\t");
							System.out.print(map.get("CONTENT") + "\t");
							System.out.print(map.get("USER_ID") + "\t");
							System.out.print(map.get("REG_DATE") + "\t");
							System.out.println();
					}
					System.out.println("--------------------------------------------------------------------------");
					System.out.println("1.수정\t2.삭제\t3.작성자 이름으로 찾기\t0.종료");
					input = ScanUtil.nextInt();
					switch(input){
					case 1 : System.out.println("제목 수정 : ");
							 inputParam1 = ScanUtil.nextLine();
							 param.add(inputParam1);
							 System.out.println("내용 수정 : ");
							 inputParam2 = ScanUtil.nextLine();
							 param.add(inputParam2);
							 System.out.println("작성자 아이디를 적어주세요 : ");
							 inputParam3 = ScanUtil.nextLine();
							 param.add(inputParam3);
							 int result = jdbc.update("UPDATE TB_JDBC_BOARD SET TITLE = ?, CONTENT = ? WHERE USER_ID = ?", param);
							 System.out.println("수정이 완료되었습니다.");
							 break;
							 
					case 2 : System.out.println("작성자 이름을 입력해주세요");
							 param = new ArrayList<>();
							 inputDelete = ScanUtil.nextLine();
							 param.add(inputDelete);
							 result = 0;
							 result = jdbc.update("DELETE FROM TB_JDBC_BOARD WHERE USER_ID = ?", param);
							 System.out.println("삭제가 완료되었습니다.");
							 break;
							 
					case 3 : System.out.println("작성자명 : ");
							 param = new ArrayList<>();
							 inputSelect = ScanUtil.nextLine();
							 param.add(inputSelect);
							 
							 map = jdbc.selectOne("SELECT * FROM TB_JDBC_BOARD WHERE USER_ID = ?", param);
							 System.out.println("--------------------------------------------------------------------------------------------------------");
							 System.out.println("작성번호 : " + map.get("BOARD_NO"));
							 System.out.println("제목 : " + map.get("TITLE"));
							 System.out.println("내용 : " + map.get("CONTENT"));
							 System.out.println("작성자 : " + map.get("USER_ID"));
							 System.out.println("작성일 : " + map.get("REG_DATE"));
							 System.out.println("--------------------------------------------------------------------------------------------------------");
							 break;
							 
							 
					case 0 : System.out.println("시스템 종료되었습니다.");
							 System.exit(0);
							 
					default : System.out.println("다시 입력해주세요");
					}
					
					System.out.println("1수정하기\t2.삭제하기");
					input = ScanUtil.nextInt();
					switch(input){
					case 1: param = new ArrayList<>();
							System.out.println("제목 수정 : ");
							inputParam1 = ScanUtil.nextLine();
							param.add(inputParam1);
							System.out.println("내용 수정 : ");
							inputParam2 = ScanUtil.nextLine();
							param.add(inputParam2);
							param.add(inputSelect);
							int result = jdbc.update("UPDATE TB_JDBC_BOARD SET TITLE = ?, CONTENT = ? WHERE USER_ID = ?", param);
							if(result > 0){
								System.out.println("수정이 완료되었습니다.");
							}
							break;
							
					case 2: System.out.println("정말로 삭제하시겠습니까?(y/n)");
							inputCheck = ScanUtil.nextLine();
							param = new ArrayList<>();
							param.add(inputSelect);
							if(inputCheck.equals("y") || inputCheck.equals("Y")){
								result = jdbc.update("DELETE FROM TB_JDBC_BOARD WHERE USER_ID = ?", param);
								System.out.println("삭제되었습니다.");
								break;
							}
							else if(inputCheck.equals("n") || inputCheck.equals("N")){
								System.out.println("취소되었습니다.");
								break;
							}
							else{
								System.out.println("다시 입력받아주세요");
							}				 
					}
		case 2: System.out.println("게시글을 작성해주세요");
				param = new ArrayList<>();
				System.out.println("제목 : ");
				inputInsert1 = ScanUtil.nextLine();
				param.add(inputInsert1);
				System.out.println("내용 : ");
				inputInsert2 = ScanUtil.nextLine();
				param.add(inputInsert2);
				System.out.println("작성자 : ");
				inputInsert3 = ScanUtil.nextLine();
				param.add(inputInsert3);
				
				int result = jdbc.update("INSERT INTO TB_JDBC_BOARD VALUES((SELECT NVL(MAX(BOARD_NO),0) + 1 FROM TB_JDBC_BOARD), ?, ?, ?, SYSDATE)",param);
				
				if(result > 0){
					System.out.println("성공적으로 등록되었습니다.");
					break;
				}
				else{
					System.out.println("다시 등록해주시기 바랍니다.");
				}
				
			}
			
		}
	}
}
