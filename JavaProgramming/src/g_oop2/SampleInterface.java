package g_oop2;

public interface SampleInterface {

	//상수와 추상메서드만을 가질 수 있는게 interface이다.
	//추상클래스와 마찬가지로 인터페이스 또한 객체 생성을 해서 사용 하지 못함
	//인터페이스의 모든 멤버변수는 public static final 제어자를 사용해야한다.
	public static final int NUM1 = 1; //final이 붙어있기 때문에 무조건 상수가 된다.
	
	//모든 멤버변수의 제어자가 같기 때문에 생략이 가능하다. 밑에 public static final 붙어 있다고 보면 됨
	int NUM2 = 2;
	
	//인터페이스의 모든 메서드는 pulbic abstract 제어자를 사용해야한다.
	public abstract void method1();
	
	//모든 메서드의 제어자가 같기 때문에 생략이 가능하다.
	void method2();
	
	//인터페이스는 부모의 역할을 한다고 보면 된다.
	
	
}
//인터페이스 상속 받을 클래스 생성
//extends는 클래스 상속 받을 때만 사용
//인터페이스는 implements라는 예약어를 사용해서 상속 받음
//인터페이스 아주 큰 특징으로는 다중상속이 가능하다.
//클래스는 하나의 클래스로부터만 상속이 가능한데
//인터페이스는 여러개를 상속 받을 수 있다.
//인터페이스 여러개 상속받고 싶으면 ,로 구분해서 하나 더 넣어주면 됨
//메서드 내용이 없으므로 무엇을 상속받든 상관이 없다.
class SampleImplement implements SampleInterface, SampleInterface2{

	@Override
	public void method1() {
		
	}

	@Override
	public void method2() {
		
	}

	@Override
	public void method3() {
		
	}
	
}

interface SampleInterface2{
	void method1(); //이미 1번 인터페이스에서 똑같은 이름으로 상속 받았기 때문에 추가적으로 오버라이딩 되지 않음
	void method3(); //Override하지 않은 3번 메서드가 위에 들어감
}