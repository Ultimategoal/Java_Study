package g_oop2;

public class AccessModifier {

	public String publicVar = "public : 접근제한이 없음"; //아무 클래스에서나 어디에서든 접근이 가능
	protected String protectedVar = "protected : 같은 패키지 + 상속받은 클래스에서 접근 가능"; //같은 패키지에서는 접근 가능, 다른 패키지로 가게 되면 이 클래스에 접속이 안됨 하지만 다른 패키지라고 하더라도 상속을 받으면 사용 가능
	String defaultVar = "default : 같은 패키지에서만 접근 가능"; // 아무것도 붙이지 않으면 default를 의미, 같은 패키지내에서만 접근이 가능, 다른 패키지에서는 접근을 반대함
	private String privateVar = "private : 클래스 내에서만 접근 가능"; // 같은 클래스내에서만 접근이 가능, 다른 클래스에서는 접근이 불가능
	
	public void publicMethod(){
		System.out.println(publicVar);
	}
	
	protected void protectedMethod(){
		System.out.println(protectedVar);
	}
	
	void defaultMethod(){ //default는 생략, 아무것도 붙이지 않아야 default임
		System.out.println(defaultVar);
	}
	
	private void privateMethod(){
		System.out.println(privateVar);
	}
	
	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
		System.out.println(am.protectedVar);
		am.protectedMethod();
		
		System.out.println(am.defaultVar);
		am.defaultMethod();
		
		System.out.println(am.privateVar);
		am.privateMethod(); //클래스 내에 있기 때문에 현재 접근이 가능한 것을 볼 수 있다.
		
		
		Time t = new Time();
		
//		t.hour = 9;
//		t.minute = 330;
//		t.second = -20; //Time 클래스의 변수명들을 모두 private 처리를 하여 접근이 불가능해져서 컴파일 에러 발생
		
//		System.out.println(t.getTime()); // 여기서 보면 시간 출력 결과가 9:330:-20이라고 나오는데 여기서 설명하고자 하는 것은
		//접근제어자를 통해서 아무나 변수에 직접적으로 접근해서 값을 바꾸지 못하게 하기 위함임
		//아무나 값을 바꿔버리면 문제가 생길 수 있고 제대로 된 프로그램 작동이 어려워 질 수 있기 때문
		t.setHour(23);
		t.setMinute(59);
		t.setSecond(55);
		System.out.println(t.getTime());
		
		t.clock();
		
		//데이터를 보호하기 위해 접근제어자를 사용
		//무분별하게 외부에 노출되는 메서드를 많이 만들 필요가 없음
		//오히려 사용자 입장에서도 혼란만 가중되기 때문
	}
}
