package b_operator;

import java.util.Scanner;

public class Etc {

	public static void main(String[] args) {
		/*
		 * 비트 연산자
		 * - |, &, ^, ~, <<, >>
		 * - 비트 단위로 연산한다.
		 * 
		 * 기타 연산자
		 * - .(참조연산자) : 특정 범위내에 속해 있는 멤버를 지칭할때 사용한다.
		 * - (type) : 형변환
		 * - ?:(삼항연산자) : 조건식 ? 조건식이 참일 경우 수행할 문장 : 조건식이 거짓일 경우 수행할 문장
		 */
		//1byte : 01010101, 비트는 byte의 8개 숫자 하나하나를 비트라고 함
		System.out.println(10 | 15); //| : 둘다 0인 경우 0 그 외 1
		//10 : 00001010
		//15 : 00001111
		//     00001111 비트 단위로 계산하다보니 결과는 똑같이 15가 나옴
		
		int x = 10;
		int y = 20;
		int result = x < y ? x : y; //int result = x;
		// 참이면 result = x가 되고 거짓이면 result = y가 됨
		System.out.println(result);
		
		//주민등록번호 뒷자리의 첫번째 숫자가 1이면 남자 2면 여자
		
		
		int regNo = 1;
		String gender = regNo == 1 ? "남자" : "여자";
		System.out.println("당신의 성별은 " + gender + "입니다. ");
		
		gender = regNo == 1 ? "남자" : (regNo == 2 ? "여자" : "확인불가");
		System.out.println("당신의 성별은 " + gender + " 입니다.");
		
		//2개의 숫자를 입력받고, 둘 중 더 큰 숫자를 출력해주세요.
		Scanner sc = new Scanner(System.in);
//		int a,b;
//		System.out.println("첫 번 째 숫자 입력해주세요.");
//		a = Integer.parseInt(sc.nextLine());
//		System.out.println("두 번 째 숫자 입력해주세요.");
//		b = Integer.parseInt(sc.nextLine());
//		int result1 = a > b ? a : b;
//		System.out.println(result1);
		
		//숫자를 입력받고, 그 숫자가 1이나 3이면 남자를 2나 4면 여자를 출력해주세요.
		//그외의 숫자를 입력하면 확인불가를 출력해주세요.
		
		System.out.println("숫자 입력>");
		int m = Integer.parseInt(sc.nextLine());
		String result2 = m == 1 || m == 3 ? "남자" : ((m == 2 || m == 4) ? "여자" : "확인불가");
		System.out.println(result2);

		
	}

}
