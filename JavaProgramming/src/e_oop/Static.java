package e_oop;

public class Static {

	/*
	 * static을 붙이면 프로그램 실행히 메모리에 올라간다.
	 * 객체생성을 하지 않아도 사용할 수 있다.
	 * static을 붙인 변수는 객체간에 변수의 값을 공용한다.
	 * static이 붙은 멤버의 명칭 : 클래스 변수, 크래스 메서드
	 * static이 붙지 않은 멤버의 명칭 : 인스턴스 변수, 인스턴스 메서드
	 */
	
	//static은 변수 앞에 붙일 수 있음
	//값을 공유하기 위해 static을 붙인다.
	static int var;
	
	public static void main(String[] args) {
		Saram s1 = new Saram();
		Saram s2 = new Saram();
		
		s1.name = "철수";
		s2.name = "영희";
		
		s1.saveMoney(100000);
		s2.saveMoney(200000);
		
		s1.saveDateMoney(200000);
		s2.saveDateMoney(200000); //값을 공유하기 때문에 개별적으로 20만원이 아니라 총 40만원 입금 됨
		//static 쓰는 이유는 과도한 객체 생성으로 인한 메모리 낭비를 막기 위해서임
		
		//Math.random()
		//Math.round()
		//얘네들이 자주 사용되다보니까 static이 붙어져 있음
		System.out.println(Math.random());
		
		System.out.println("문자열 입력>");
		String input1 = ScanUtil.nextLine();
		
		System.out.println("숫자 입력>");
		int input2 = ScanUtil.nextInt();
	}

}

class Saram{
	
	String name; //이름
	int account; //통장의 잔고
	
	void saveMoney(int money){
		account += money;
		System.out.println(name + "의 통장 잔고 : " + account + "원");
	}
	
	static int dateAccount; //데이트 통장의 잔고
	
	static void saveDateMoney(int money){
		dateAccount += money;
		System.out.println("데이트 통장 잔고 : " + dateAccount + "원");
	}
}
