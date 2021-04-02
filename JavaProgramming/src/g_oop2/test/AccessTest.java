package g_oop2.test;

import g_oop2.AccessModifier;

public class AccessTest extends AccessModifier {

	public static void main(String[] args) {
		//AccessModifier랑 같은 패키지에 있는 클래스
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
//		System.out.println(am.protectedVar);
//		am.protectedMethod(); //같은 패키지가 아니라서 현재 컴파일에러 뜸, 하지만 상속을 받으면 패키지가 달라도 protected는 사용이 가능
		
//		System.out.println(am.defaultVar);
//		am.defaultMethod(); //같은 패키지가 아니라서 현재 컴파일에러 뜸
		
//		System.out.println(am.privateVar);
//		am.privateMethod(); //같은 클래스내에서만 접근이 가능하기 때문에 현재 다른 클래스(AccessModifier)로 부터 왔기 때문에 private 접근자로는 사용이 불가능
		
		AccessTest ac = new AccessTest(); //이렇게 하면 protected 접근 제어자 접근 가능
		System.out.println(ac.protectedVar);
		ac.protectedMethod();
	}
}
