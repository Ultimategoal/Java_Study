package k_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Member {
	
	Connection  con ;
	PreparedStatement stmt;
	Scanner sc = new Scanner(System.in);
	
	//생성자 
	public Member(){
		DBConnection  db = new DBConnection();
		con = db.getCont();
		System.out.println("con=" + con);
	}
	
	
	//메소드 정의 - 입력 
	public void inputMember(){
		System.out.println("입력하기");
		
		
		
		System.out.println("id를 입력 하세요");
		String id = sc.nextLine();
		
		System.out.println("pass를 입력 하세요");
		String pass = sc.nextLine();
		
		System.out.println("name를 입력 하세요");
		String name = sc.nextLine();
		
		System.out.println("hp를 입력 하세요");
		String hp = sc.nextLine();
		
		System.out.println("mail를 입력 하세요");
 		String mail = sc.nextLine();
 		
		String sql = "insert into member("
				     + " mem_id,mem_pass, mem_name, mem_hp, mem_mail) "
				     + "values (?,?,?,?,?)";
		
		try {
			//실행객체 생성 
			stmt = con.prepareStatement(sql);
			//sql의 ?에 값 대입하기 
			stmt.setString(1, id);
			stmt.setString(2, pass);
			stmt.setString(3, name);
			stmt.setString(4, hp);
			stmt.setString(5, mail);
			//실행 
			int a = stmt.executeUpdate();
			
			if(a > 0)
			     System.out.println(a + "저장 성공 ");
			else 
				 System.out.println(a + "저장 실패 ");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//리스트 
	public void listMember(){
		System.out.println("출력하기 ");
		String sql = "select mem_id, mem_name, mem_hp from member";
		
		try {
			
			stmt = con.prepareStatement(sql);
			ResultSet  rs = stmt.executeQuery();
			
			while(rs.next()){
				String id = rs.getString(1);
				String name = rs.getString(2);
				String hp = rs.getString(3);
				
				System.out.println(id + "  " + name + " " + hp);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	//삭제
	public void deleteMember(){
		System.out.println("삭제하기 ");
		
		System.out.println("수정할 id를 입력하세요");
		String id = sc.nextLine();
		
	
		String sql = "delete from member where mem_id=?";
		
		
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			
			int a= stmt.executeUpdate();
			if(a > 0)
				System.out.println(a +  "삭제 성공 ");
			else 
				System.out.println("없는 id이거나 삭제시 오류 발생");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	//수정 
	public void updateMember(){
		System.out.println("수정하기 ");
		
		System.out.println("수정할 id를 입력하세요");
		String id = sc.nextLine();
		
		System.out.println("수정할 name를 입력하세요");
		String name= sc.nextLine();
		
		System.out.println("수정할 pass를 입력하세요");
		String pass = sc.nextLine();
		
		System.out.println("수정할 hp를 입력하세요");
		String hp = sc.nextLine();
		
		System.out.println("수정할 mail를 입력하세요");
		String mail = sc.nextLine();
		
		
		String sql = "update   member  set mem_name = ? ,"
				+ "mem_pass= ? , mem_hp=?, mem_mail=? where mem_id=?";
		
		
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, name);
			stmt.setString(2, pass);
			stmt.setString(3, hp);
			stmt.setString(4, mail);
			stmt.setString(5, id);
			
			int a = stmt.executeUpdate();
			if(a > 0)
			     System.out.println(a + "개 수정 했습니다");
			else 
				System.out.println("없는 아이디 이거나 삭제 실행시 오류가 발생 ...");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
	}
	
	
	public static void main(String[] args){
		Member  member = new Member();
		
		Scanner  scan = new Scanner(System.in);
		while(true){
		
			System.out.println("1. 입력");
			System.out.println("2. 리스트");
			System.out.println("3. 수정");
			System.out.println("4. 삭제");
			System.out.println("5. 종료");
			System.out.println("선택 ===>");
				
			
			String input  =  scan.nextLine();
			
			if(input.equals("1")){
				member.inputMember(); //메소드 호출 
			}else if(input.equals("2")){
				member.listMember();
			}else if(input.equals("3")){
				member.updateMember();
			}else if(input.equals("4")){
				member.deleteMember();
			}else if(input.equals("5")){
				break;
			}
			
		}//while
		
		System.out.println("종료합니다");
		System.exit(0);
		
		
	}//main

}//class





