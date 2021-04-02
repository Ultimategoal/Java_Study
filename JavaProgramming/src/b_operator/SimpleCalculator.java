package b_operator;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		//두개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어주세요.
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자 입력");
		int num1, num2;
		String operator;
		char ch;
		num1 = Integer.parseInt(sc.nextLine());
		System.out.println("연산자를 넣어주세요.");
		operator = sc.nextLine();
		ch = operator.charAt(0);
		System.out.println("두 번쨰 숫자 입력");
		num2 = Integer.parseInt(sc.nextLine());
		if(ch == '+'){
			System.out.println(num1 + num2);
		}else if(ch == '-'){
			System.out.println(num1 - num2);
		}else if(ch == '*'){
			System.out.println(num1 * num2);
		}else if(ch == '/'){
			System.out.println(num1 / num2);
		}else if(ch == '%'){
			System.out.println(num1 % num2);
		}else{
			System.out.println("오류");  내가 한거 */
		
		//수업 정답
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자");
		int x = Integer.parseInt(sc.nextLine());
		System.out.print("연산자>");
		String op = sc.nextLine();
		System.out.print("두 번째 숫자>");
		int y = Integer.parseInt(sc.nextLine());
		
		int result = op.equals("+") ? x + y
				: op.equals("-") ? x - y
				: op.equals("*") ? x * y
				: op.equals("/") ? x / y 
				: x % y;
		System.out.println(x + " " + op + " " + y + " = " + result);
		
	}

}
