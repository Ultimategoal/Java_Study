package a_variable;

import java.util.Scanner; // 다른 패키지에 있는 클래스의 위치를 알려주는 것
//ctrl + shift + o
public class Variable {

	public static void main(String[] args) {

		//main메서드 : 프로그램의 시작과 끝
		//주석 : 프로그램코드로 인식되지 않는 문장 지금 같은건 ctr + shift + c 하면 됨
		/*여러 줄 주석 처리하고 싶다면 ctrl + shift + / 하면 됨 대신 블록지정을 해줘야 함
		이런식으로 대신 없앨 때는 역 슬러쉬 써야함 범위 주석이라고도 함*/
		
		
		/*
		 * 기본형 타입
		 * 정수 : byte(1), short(2), int(4), long(8)
		 * 실수 : float(4), double(8)
		 * 문자 : char(2)
		 * 논리 : boolean(1)
		 * 옆에 있는 숫자는 byte 크기
		 * float 하고 double은 아주 큰 숫자까지 나타낼 수 있음 하지만 정확도 때문에 나뉨
		 * float 대략 7번째자리까진  정확 double은 대략 15번째 자리 까진 정확히 표현 가능
		 */
		
		int x; // 변수를 저장할 수 있는 x라는 이름을 가진 그릇을 만들어라.
		// 변수는 데이터가 아니고 데이터를 담는 그릇이라고 봐야함
		// 변수를 만드는 것은 변수를 선언한다고 표현한다.
		
//		double x; //블럭{}안에서 이름이 중복일 수 없다.
		double y;
		
		//*(대입연산자) : 오른쪽의 값을 왼쪽의 변수에 저장
		x = 10; // 초기화 : 변수에 처음으로 값을 저장하는 것
		y = 3.14; //변수의 대입에 맞는 값을 지정해야한다.
		
		int abc = 30; //일반적으로 선언과 초기화를 한번에 한다.
		long l = 40L; // 접미사 L를 붙여야 long타입이 된다.
		float f = 5.5f; // 접미사 F를 붙여야 float타입이 된다. 접미사는 대소문자 구분 안둠
		char c = '한'; // 따음표안에 반드시 한글자를 넣어야 한다.
		boolean b = true; //true, false
		
		//8가지 기본형 타입을 사용해서 8개의 변수를 선언 및 초기화 해주세요.
		
		int a = 5;
		long g = 30l;
		char ji = '가';
		float ab = 2.718f;
		double cd = 3.5;
		boolean dd = true;
		byte abcd = 127;
		short udf = 650;
		
	
		
		x = 20; // 기존에 저장되어 있는 10이라는 값은 사라지고 20이라는 값이 저장된다. 타입은 따로 안적어도 됨 선언할 때 처음에만 적음
		
		y = 5.5;
		
		//위에서 만든 8개의 변수에 새로운 값을 저장해주세요.
		
		a = 3;
		g = 55;
		ji = '나';
		ab = 2.5f;
		cd = 3.8;
		dd = false;
		abcd = 120;
		udf = 150;
		
		//콘솔창에 출력
		
		System.out.println(100);
		System.out.println(x);
		
		//실행 단축키 : ctrl + f11
		
		//위에서 만든 8개의 변수의 값을 출력해주세요.
		System.out.println(a);
		System.out.println(g);
		System.out.println(ji);
		System.out.println(ab);
		System.out.println(cd);
		System.out.println(dd);
		System.out.println(abcd);
		System.out.println(udf);
		
		//문자열
		String str = "문자 여러개.."; //클래스는 참조형타입 데이터이다.
		// 앞 글자가 대문자라는 것은 클래스라는 것을 의미한다. 클래스 만들 때 앞에 대문자는 약속한 것
		// 위에는 그래서 String 이라는 클래스이다. 참조형 타입이다.
		// 문자열은 문자가 하나도 없어도 상관 없다.
		
		System.out.println(str);
		//문자열과 다른 타입의 데이터가 결합되면 문자열의 결과를 얻는다.
		System.out.println(str + 50);
		System.out.println(10 + 20 + str);
		System.out.println(str + 10 + 20);
		
		//형변환
		//다른 타입의 값을 저장하기 위해서는 값의 타입을 변경해 주어야 하는데 이를 형변환 (type casting)이라 한다.
		int small = 10;
		long big = 10L;
		
		small = (int)big;
		// 형 변환 끝
		big = small; //표현범위가 작은쪽에서 큰쪽으로 형변환은 생략이 가능하다.
		
		
		
		x = 10;
		y = 3.14;
		
		int z = x + (int)y;
		
		
		
		/*
		 * 명명규칙
		 * 영문자 대소문자, 한글, 숫자, 특수문자('_', '$')를 사용할 수 있다.
		 * 숫자로 시작할 수 없다.
		 * 예약어는 사용할 수 없다. (적어서 찐하게 나오면 전부다 예약어임)
		 * [낙타식 표기법을 사용한다. (mySampleVeriable)]
		 * [클래스명의 첫글자는 대문자로 한다. (MySampleClass)]
		 */
		
		/*
		 * 상수
		 * - 값을 변경 할 수 없는 그릇
		 * - 리터럴에 의미를 부여하기 위해 사용한다.
		 */
		final int MAX_NUMBER = 10;
		// 변수 앞에 final이 붙으면 값을 변경할 수 없음
		// 상수는 변수와 다르다는 것을 나타내기 위해 대문자만 사용해서 나타냄
		// 자주 사용하지는 않음

		//MAX_NUMBER = 5; // 상수 값 변경 시도하면 컴파일 에러 발생
		
		System.out.print("println과의 차이는 줄바꿈을 하지 않는다.");
		System.out.print("println과의 차이는 줄바꿈을 하지 않는다.\n"); // \n을 마지막에 써주면 다음 줄 부터 줄바꿈 해줌
		System.out.println("줄바꿈을\t한다.");
		System.out.printf("문자열: %s, 숫자: %d\n", str, x); // 출력 포맷을 지정한다. 
		//출력 이후 줄바꿈 안해줌 그래서 %d 옆에 \n을 써줌
		// \(역슬러쉬)는 여러 기능이 있다.\n은 탈출해서 줄바꿈 \t는 칸을 띄어준다.
		
		//입력
		Scanner sc = new Scanner(System.in); //입력받기 위한 클래스
		
//		System.out.print("아무거나 입력해주세요>");
//		String str2 = sc.nextLine(); // 프로그램이 멈추고 사용자가 입력할 때 까지 멈춤, 입력 받는 값이 됨, 입력 받는 값은 String 타입
//		System.out.println(str2);
//		
//		int nextInt = sc.nextInt(); //int형 타입
//		double nextDouble = sc.nextDouble(); // double형 타입
		//이런것들은 있지만 버그로 인해 사용하지 않는것이 좋다.
		// 실행하면 콘솔창에서 빨간버튼이 나와있는데 이게 프로그램이 실행중이라는 것을 의미
		
//		System.out.print("int 입력>");
//		int nextInt = sc.nextInt();
//		System.out.println(nextInt);
//		System.out.print("문자열 입력>");
//		String nextLine = sc.nextLine();
//		System.out.println(nextLine);
//		System.out.println("입력 끝!");
		
		// 위에 돌리게 되면 버그가 발생하므로 숫자를 써야할 경우 그냥 문자열로 간 다음에 int나 다른걸로 형 변환 해주는 것이 좋음
		
//		System.out.print("int 입력>");
//		int number = Integer.parseInt(sc.nextLine());
//		//double number = Double.parseDouble(sc.nextLine()); // double로 형 변환하고 싶으면 이렇게 하면 됨
//		System.out.println(number);
//		System.out.print("문자열 입력>");
//		String nextLine = sc.nextLine();
//		System.out.println(nextLine);
//		System.out.println("입력 끝!");
		
		//이렇게 해주면 문제 없이 위에 주석 처럼 문자열 입력 없이 끝나는게 아니라
		//하나씩 입력 다하고 버그없이 순서대로 작동
		
		
		//자신의 이름을 저장할 변수를 선언해주세요.
		//변수 이름 시작은 반드시 소문자로
		String myName;
		
		//위에서 선언한 변수를 초기화 하기 위해 이름을 입력받아주세요.
//		System.out.print("이름을 입력해주세요>");
//		myName = sc.nextLine();
//		
//		//자신의 나이를 저장할 변수를 선언해주세요.
//		int myAge;
//		
//		//위에서 선언한 변수를 초기화 하기 위해 나이를 입력받아주세요.
//		System.out.print("나이를 입력해주세요>");
//		myAge = Integer.parseInt(sc.nextLine());
//		
//		System.out.println("이름: " + myName + " / 나이 : " + myAge);
		
		/*
		 * 다음과 같은 프로그램을 작성해주세요.
		 *  ******************* 회원가입 *****************
		 *  아이디>admin
		 *  비밀번호(4자리숫자)>1234
		 *  이름>홍길동
		 *  나이>30
		 *  키>185.5
		 *  *******************************************
		 *  회원가입 완료!!
		 *  ****************** 내 정보 *******************
		 *  아이디 : admin
		 *  비밀번호 : 1234
		 *  이름 : 홍길동
		 *  나이 30세
		 *  키 : 185.5cm
		 *  ********************************************
		 */
		
		System.out.println("*************회원가입************");
		System.out.println("아이디>");
		System.out.println("비밀번호>");
		System.out.println("이름>");
		System.out.println("나이>");
		System.out.println("키>");
		
		String id, name;
		int password, age;
		double height;
		
		id = sc.nextLine();
		password = Integer.parseInt(sc.nextLine());
		name = sc.nextLine();
		age = Integer.parseInt(sc.nextLine());
		height = Double.parseDouble(sc.nextLine());
		System.out.println("**********************************");
		System.out.println("회원가입 완료!!");
		
		System.out.println("***************내 정보*************");
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + password);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
		System.out.println("키 : " + height + "cm");
		System.out.println("**********************************");
		
	}

}
