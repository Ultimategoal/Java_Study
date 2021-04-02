package e_oop;

import java.util.Arrays;
import java.util.Scanner;

public class SetComma {

	public static void main(String[] args) {
		//숫자를 입력받아 입력받은 숫자에 3자리 마다 콤마(,)를 붙여 출력해주세요.

		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요>");
		String num = sc.nextLine();
		
		//1234567
		//1,234,567
		
		String num2 = "";
		
		int count = 0;
		for(int i = num.length() - 1; i >=0; i--){
			num2 = num.charAt(i) + num2;
			count++;
			if(count % 3 == 0 && count != num.length()){
				num2 = "," + num2;
			}
		}
		System.out.println(num2);
		
//		int input = Integer.parseInt(sc.nextLine());
//		String str = String.format("%,d", input);
//		System.out.println(str);		
		
		/*
		 * - equals() : 문자열의 내용이 같은지 반환한다.
		 * - length() : 문자열의 길이를반환한다.
		 * - charAt() : 특정 인덱스에 위치한 문자를 반환한다.
		 * - substring() : 문자열의 특정 부분을 잘라서 반환한다.
		 * - indexOf() : 문자열 내의 특정 문자의 인덱스를 반환한다.
		 * - contains() : 문자열이 특정 문자열을 포함하고 있는지 여부를 반환한다.
		 * - split() : 문자열을 특정 문자를 기준으로 나누어 배열형태로 반환한다.
		 * - trim() : 문자열 앞뒤의 공백을 제거해 반환한다.
		 * - valueOf() : 다른 타입의 데이터를 문자열로 반환해 반환한다.
		 */
		
	}

}
