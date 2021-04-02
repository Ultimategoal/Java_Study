package b_operator;

public class ComparingOperator {

	public static void main(String[] args) {
		/*
		 * 비교연산자
		 * - <, >, <=, >=, ==, !=
		 * - 문자열 비교 : equals()
		 */
		
		int x = 10;
		int y = 20;
		boolean b = x < y; //비교연산자의 연산결과는 boolean이다.
		System.out.println(b);
		
		b = x <= y - 15; //산술연산이 우선순위임 먼저 계산하고 비교하게 됨
		System.out.println(b);
		
		String str1 = "abc";
		String str2 = "abcd";
		b = str1 == str2; //문자열의 내용이 아닌 주소를 비교한 것이다.
		// 자바는 같은 리터럴이 있을 경우 메모리 절약을 위해 하나만 저장함
		// 위에는 문자열 내용 비교가 아님
		System.out.println(b);
		
		b = str1.equals(str2);
		System.out.println(b);
		b = !str1.equals(str2);
		System.out.println(b);
		//이 메서드가 문자열을 비교해줌
		//!붙이면 다르다는 것을 의미함
		System.out.println("---알아보기 쉽게 나누는 구간임---");		//다음의 문장들을 코드로 작성해주세요.
		//1. x가 y보다 크다.
		boolean c; x = 10; y = 20;
		c = x > y;
		System.out.println(c);
		//2. x는 y보다 작거나 같다.
		c = x <= y;
		System.out.println(c);
		//3. y는 홀수이다.
		c = y % 2 == 1;
		System.out.println(c);
		//4. "기본형"과 "참조형"은 다르다.
		String str3 = "기본형";
		String str4 = "참조형";
		c = !str3.equals(str4);
		System.out.println(c);
		c = !"기본형".equals("참조형");
		// 위에 처럼 써도 상관 없음
	}

}
