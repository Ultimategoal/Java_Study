package e_oop;

public class OOP {

	public static void main(String[] args) {
		/*
		 * 객체지향 프로그램(Object Oriented Programming)
		 * - 프로그래밍을 단순히 코드의 연속으로 보는것이 아니라 객체간의 상호작용으로 보는것.
		 * - 코드의 재사용성이 높고 유지보수가 용이하다.
		 */
		
//		new SampleClass(); 객체생성, 클래스가 메모리로 올라가고 반환해줌
		
		SampleClass sc = new SampleClass();
		
		System.out.println(sc.field);
		
		String returnValue = sc.method(5);
		System.out.println(returnValue);
		
		sc.method2();
		
		sc.flowTest1();
	}

}
