package g_oop2;

public class AccessTest {

	public static void main(String[] args) {
		//AccessModifier랑 같은 패키지에 있는 클래스
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
		System.out.println(am.protectedVar);
		am.protectedMethod();
		
		System.out.println(am.defaultVar);
		am.defaultMethod();
		
//		System.out.println(am.privateVar);
//		am.privateMethod(); //같은 클래스내에서만 접근이 가능하기 때문에 현재 다른 클래스(AccessModifier)로 부터 왔기 때문에 private 접근자로는 사용이 불가능
	}
}
