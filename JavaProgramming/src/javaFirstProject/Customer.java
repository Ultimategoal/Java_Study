package javaFirstProject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import e_oop.ScanUtil;

public class Customer {
	void login(HashMap<String, Object> signUpInfor){
		ArrayList<HashMap<String, Object>> signUp = new ArrayList<>();
		ArrayList<HashMap<String, Object>> signUpCheck = new ArrayList<>();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		ArrayList<HashMap<String, Object>> signIn = new ArrayList<>();
		
		while(true){
			System.out.println("Welcome to our Moive Theater!!");
			System.out.println("1.로그인 하기\t2.회원가입 하기\t3.회원정보 확인하기");
			int input = ScanUtil.nextInt();

			for(int i = signUpCheck.size() - 1; i >= 0; i--){
				HashMap<String, Object> signUpInfor1 = signUp.get(i);
				System.out.println(signUpInfor.get("name")
						+ "\t" + signUpInfor.get("number")
						+ "\t" + signUpInfor.get("id")
						+ "\t" + signUpInfor.get("password")
						+ "\t" + signUpInfor.get("reg_date"));
			}
			
			switch(input){
			case 1: signIn(signUpInfor);
					break;
			case 2: signUp();
					break;
			case 3: customerInfo(signUp);
					break;
			}

		}
	}
	
	void signIn(HashMap<String, Object> signUpInfor){
		ArrayList<HashMap<String, Object>> signIn = new ArrayList<>();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		
		System.out.print("ID : ");
		String id = ScanUtil.nextLine();
		
		System.out.print("PASSWORD : ");
		String password = ScanUtil.nextLine();
		
		for(int i = 0; i < signUpInfor.size(); i++){
			if(signUpInfor.get("id").equals(id) && signUpInfor.get("password").equals(password)){
				System.out.println("로그인되었습니다.");
			}
			else{
				System.out.println("오류");
			}
			
		}
		
	}
	
	private void signUp(){
		ArrayList<HashMap<String, Object>> signUp = new ArrayList<>();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		HashMap<String, Object> signUpInfor = new HashMap();
		
		System.out.print("이름 : ");
		String name = ScanUtil.nextLine();
		System.out.print("전화번호 : ");
		String number = ScanUtil.nextLine();
		System.out.print("아이디 : ");
		String id = ScanUtil.nextLine();
		
		System.out.print("비밀번호 : ");
		String password = ScanUtil.nextLine();
		System.out.print("비밀번호 확인 : ");
		String passwordCheck = ScanUtil.nextLine();
		

		if(password == passwordCheck){
			System.out.println("회원가입을 축하드립니다.");
		}
		
		
		
		signUpInfor.put("name", name);
		signUpInfor.put("number", number);
		signUpInfor.put("id", id);
		signUpInfor.put("password", password);
		signUpInfor.put("reg_date", new Date());
		
		signUp.add(signUpInfor);
		System.out.println("회원가입이 완료되었습니다.");
		System.out.println(signUpInfor.get("name"));
		System.out.println(signUpInfor.get("number"));
		System.out.println(signUpInfor.get("id"));
		System.out.println(signUpInfor.get("password"));
		System.out.println(signUpInfor.get("reg_date"));
		
		System.out.println("로그인 화면");
		
		System.out.print("ID : ");
		String id1 = ScanUtil.nextLine();
		
		System.out.print("PASSWORD : ");
		String password1 = ScanUtil.nextLine();
		
		for(int i = 0; i < signUp.size(); i++){
			signUpInfor = signUp.get(i);
			if(signUpInfor.get("id").equals(id1) && signUpInfor.get("password").equals(password1)){
				System.out.println("로그인되었습니다.");
			}
			else{
				System.out.println("오류");
			}
			
		}
		
	}
	
	
	void customerInfo(ArrayList<HashMap<String, Object>> signUp){
		System.out.println("사용자 정보");
		System.out.println("--------------------------");
		for(int i = 0; i < signUp.size(); i++){
			System.out.println(signUp.get(i));
		}
	}
}
