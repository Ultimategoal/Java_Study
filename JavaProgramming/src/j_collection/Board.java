package j_collection;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import e_oop.ScanUtil;

public class Board {/*
	
	HashMap<String, Object> board = new HashMap();
	HashMap<String, Object> board1 = new HashMap();
	HashMap<String, Object> board2 = new HashMap();
	ArrayList<HashMap<String, Object>> table = new ArrayList<>();
	
	
	Board(){
		board.put("Number(PK)", "1");
		board.put("Subject", "다큐");
		board.put("Content", "아무내용");
		board.put("Writer", "최진우");
		board.put("WrittenDate", "2021-03-18");
		
		board1.put("Number(PK)", "2");
		board1.put("Subject", "음악");
		board1.put("Content", "음악에 대하여");
		board1.put("Writer", "전음악");
		board1.put("WrittenDate", "2020-03-18");
		
		board2.put("Number(PK)", "3");
		board2.put("Subject", "운동");
		board2.put("Content", "운동에 대하여");
		board2.put("Writer", "나운동");
		board2.put("WrittenDate", "2021-03-15");
		
		table.add(board);
		table.add(board1);
		table.add(board2);
	}*/
	
	public static void main(String[] args) {
		/*
		 * ArrayList와 HashMap을 사용해 게시판 테이블을 만들고,
		 * 조회, 등록, 수정, 삭제가 가능한 게시판을 만들어주세요.
		 * 
		 * 번호(PK), 제목, 내용, 작성자, 작성일
		 * 
		 * 
		 */
		
		new Board().start();
		
		
	}

	private void start() {
		ArrayList<HashMap<String, Object>> boardList = new ArrayList<>(); //전역변수로 만들어도 되고 지역변수로 만들어도 됨
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); //날짜가 보기 안좋아서 이렇게 생성자의 파라미터yyyy-MM--dd 넘겨주면 저 형식대로 날짜를 출력할 수 있음
		
		while(true){
			System.out.println("-------------------------------");
			System.out.println("번호\t제목\t작성자\t작성일");
			System.out.println("-------------------------------");
			for(int i = boardList.size() - 1; i >= 0; i--){
				HashMap<String, Object> board = boardList.get(i);
				System.out.println(board.get("board_no")
						+ "\t" + board.get("title")
						+ "\t" + board.get("user")
						+ "\t" + format.format(board.get("reg_date")));
			}
			System.out.println("-------------------------------");
			System.out.print("1.조회\t2.등록\t0.종료>");
			int input = ScanUtil.nextInt();
			
			
			switch(input){
			case 1: //조회
				read(boardList); //boardList를 지역변수로 만들어서 이렇게 파라미터로 넘겨줘야함
				break;
			case 2: //등록
				insert(boardList);
				break;
			case 3: //종료
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
				break;
			}
		}
		
	}
	
	
	private void read(ArrayList<HashMap<String, Object>> boardList) {
		System.out.print("조회할 게시글 번호>");
		String bn = ScanUtil.nextLine();
		
		HashMap<String, Object> board = null;
		for(int i = 0; i < boardList.size(); i++){
			board = boardList.get(i);
			if(board.get("board_no").equals(bn)){
				break;
			}
		}
		
		
		
		System.out.println("-----------------------------------");
		System.out.println("번호\t: " + board.get("board_no"));
		System.out.println("작성자\t: " + board.get("user"));
		System.out.println("작성일\t: " + board.get("reg_date"));
		System.out.println("제목\t: " + board.get("title"));
		System.out.println("내용\t: " + board.get("content"));
		System.out.println("-----------------------------------");
		System.out.print("1.수정\t2.삭제\t0.목록>");
		int input = ScanUtil.nextInt();
		
		switch(input){
		case 1: //수정
			update(board);
			break;
		case 2: //삭제
			delete(boardList, board);
			break;
		case 0: //목록
			
			break;
		}
	}

	
	private void delete(ArrayList<HashMap<String, Object>> boardList,
			HashMap<String, Object> board){
		System.out.println(boardList.get(0).get(1));
		for(int i = 0; i < boardList.size(); i++){
			if(boardList.get(i).get("board_no").equals(board.get("board_no"))){
				boardList.remove(i);
				System.out.println("삭제가 완료되었습니다.");
				break;
			}
		}
	}
	
	private void update(HashMap<String, Object> board){
		System.out.print("제목>");
		String title = ScanUtil.nextLine();
		System.out.print("내용>");
		String content = ScanUtil.nextLine();
		
		board.put("title", title);
		board.put("content", content);
		
		System.out.println("수정이 완료되었습니다.");
	}

	private void insert(ArrayList<HashMap<String, Object>> boardList) {
		String boardNo = createBoardNo(boardList);
		System.out.print("제목>");
		String title = ScanUtil.nextLine();
		System.out.print("내용>");
		String content = ScanUtil.nextLine();
		System.out.print("이름>");
		String user = ScanUtil.nextLine();
		
		HashMap<String, Object> board = new HashMap<>();
		board.put("board_no", boardNo);
		board.put("title", title);
		board.put("content", content);
		board.put("user", user);
		board.put("reg_date", new Date());
		
		boardList.add(board);
		System.out.println("게시물 등록이 완료되었습니다.");
		
		
	}

	private String createBoardNo(ArrayList<HashMap<String, Object>> boardList) {
		int max = 0;
		for(int i = 0; i < boardList.size(); i++){
			int boardNo = Integer.parseInt((String)boardList.get(i).get("board_no"));
			if(max < boardNo){
				max = boardNo;
			}
		}
		return String.valueOf(max + 1);
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	Board b = new Board();
		Select s = new Select();
		Register r = new Register();
		Modify m = new Modify();
		Remove rm = new Remove();

		
		while(true){
			System.out.println("1.조회\t2.등록\t3.수정\t4.삭제\t5.게시판 나가기");
			int input = ScanUtil.nextInt();
			
			switch(input){
	
			case 1: s.select();
					break;
			case 2: r.register();
					break;
	
			case 3: m.modify();
					break;
			
			case 4: rm.remove();
					break;
					
			case 5: System.out.println("다음에 또 찾아주세요");
					System.exit(5);
					
			default : System.out.println("다시 입력해주세요");
			}
		}*/
		
