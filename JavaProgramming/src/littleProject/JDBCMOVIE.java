package littleProject;

import java.util.ArrayList;
import java.util.List;

import e_oop.ScanUtil;

public class JDBCMOVIE {
	int input1 = 0; int input2 = 0; int input3 = 0;
	Object inputId = null; Object inputPassword = null; Object inputName = null; Object inputEmail = null; Object inputNumber = null;
	JDBCMOVIEUtil jdbc = JDBCMOVIEUtil.getInstance();

	public static void main(String[] args) {
		JDBCMOVIE jdbcM = new JDBCMOVIE();
		
		int input = 0;
		
		System.out.println("1.로그인\t2.회원가입");
		while(true){
			input = ScanUtil.nextInt();
			switch(input){
//			case 1: jdbcM.signIn();
			
			case 2: jdbcM.signUp();
			}	
		}
	}
	
//	private Object SignIn(){
//		return 
//	}
	
	
	private int signUp(){
		
		List<Object> param = new ArrayList<>();
		System.out.println("사용하실 아이디 : ");
		inputId = ScanUtil.nextLine();
		param.add(inputId);
		System.out.println("사용하실 비밀번호 : ");
		inputPassword = ScanUtil.nextLine();
		param.add(inputPassword);
		System.out.println("이름 : ");
		inputName = ScanUtil.nextLine();
		param.add(inputName);
		System.out.println("이메일 : ");
		inputEmail = ScanUtil.nextLine();
		param.add(inputEmail);
		System.out.println("전화번호 : ");
		inputNumber = ScanUtil.nextLine();
		param.add(inputNumber);
		
		int result = jdbc.update("INSERT INTO MOVIESIGNUP VALUES((SELECT NVL(MAX(USER_NO),0) + 1 FROM MOVIESIGNUP), ?, ?, ?, ?, ?, SYSDATE)", param);
		
		if(result > 0){
			System.out.println("회원가입이 완료되었습니다.");
		}
		else{
			System.out.println("처음부터 다시 시도해주시기 바랍니다.");
		}
		
		return result;
	}

}
