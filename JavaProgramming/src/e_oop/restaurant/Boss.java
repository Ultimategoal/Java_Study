package e_oop.restaurant;

import java.util.Arrays;

public class Boss {

	public static void main(String[] args) {
		Alba alba = new Alba();
		
		String[] order = alba.order();
		System.out.println(Arrays.toString(order));
		
		System.out.println("요리 만드는 중.... 완성!!");
		String[] foods = {"완성된 짜장면", "완성된 탕수육"};
		
		alba.serve(foods);
		
		alba.pay(order);
		
		// 클래스 나눌 때 기준을 어떤 대상으로 나눌 때 이것을 객체지향프로그래밍이라고 한다.
		// 여기에서는 알바와 보스로 클래스를 만들었는데 둘 다 어떤 대상이기 때문에 만들었고
		// 두 클래스로 한 프로그램이 작동한다.
	}

}
