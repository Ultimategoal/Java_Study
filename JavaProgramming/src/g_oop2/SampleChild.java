package g_oop2;

public class SampleChild extends SampleParent{

	void chileMethod(){
		System.out.println(var); //상속받은 변수
		System.out.println(method(7, 13)); //상속받은 메서드
		//일반적으로는 객체 생성해서 써야하지만
		//상속받을 경우에는 그냥 본인 것처럼 사용이 가능
	}
	
	//오버라이딩 : 상속 받은 메서드의 내용을 바꾸고 싶을 때 사용
	
	//super, super() : this랑 비슷한 애, 상속과 관련된 애,
	//부모 클래스의 변수와 자식 클래스의 변수의 이름이 똑같을 때 그 둘을 구분하기 위해 사용,
	//메서드 이름이 똑같을 때도 구분하기 위해 사용
	//자식클래스의 생성자에서 부모클래스의 생성자를 호출할 때 super사용
	
	//다형성 : 다양한 형태를 가진다는 의미
	
	//오버라이딩 : 상속받은 메서드의 내용을 재정의 하는 것.
	//오버라이딩 할 때에는 상속받는 메서드 내용을 똑같이 입력
	@Override //어노테이션 : 클래스, 변수, 메서드 등에 표시해 놓는 것.
	//혹시라도 메서드나 변수나 잘못 적을 수가 있기 때문에 그걸 방지하기 위해서
	//틀렸다는걸 표시해주는 기능
	int method(int a, int b){ //리턴타입 메서드명 파라미터 모두 같아야 한다.
		return a * b;
	} //내가 원하는 내용으로 변경만 해주면 됨
	
	//super, super()
	int var; //인스턴스 변수
	
	void test(double var){
		System.out.println(var); //그냥 var변수 쓰면 지역변수가 우선함, 파라미터가 먼저 작용
		System.out.println(this.var); //인스턴스 변수
		System.out.println(super.var); //부모 클래스로부터 상속받은 변수
		//super : 부모 클래스의 멤버와 자식 클래스의 멤버가 이름이 중복될 때 둘을 구분하기 위해 사용한다.
		System.out.println(this.method(10, 20)); //오버라이딩한 메서드
		System.out.println(super.method(10, 20)); //부모 클래스의 메서드
	}
	
	SampleChild(){
		super(); //부모클래스의 생성자 호출, 반드시 이런 방법으로 부모클래스를 호출해야한다.
		//자식클래스에서 생성자 호출해봤자 부모클래스의 생성자는 호출이 되지 않아서
		//부모클래스의 값 초기화가 되지 않아서 super()를 사용하여서 호출해야 한다.
		//이렇게만 적어도 컴파일러가 자동으로 호출해줌
		//하지만 부모클래스의 생성자에 파라미터가 있는 경우에는 따로 파라미터를 다 적어줘야지만 호출이 가능
	}
	
	//다형성
	public static void main(String[] args) {
		SampleChild sc = new SampleChild(); //일반적인 객체 생성 방법
		SampleParent sp = new SampleChild(); //다형성 : 자식 객체를 사용하는데 부모 변수에 넣어서 사용하는 것을 다형성이라고 함
		//sp = new SampleChild2();
		//sp = new SampleChild3(); 이처럼 다양하게 될 수가 있기 때문에 다형성이라고 부름
		
		sc = (SampleChild)sp;
		sp = (SampleParent)sc; //이런식으로 형변환 가능
		//자식타입 -> 부모타입 형변환은 생략 할 수 있다. 왜냐하면 크기가 더 크기 때문에
		
//		SampleChild sc2 = (SampleChild) new SampleParent(); //무조건 따로 형변환 해줘야함
		//SampleChild는 5개의 사용할 수 있는 변수나 메서드가 있지만
		//SampleParent는 2개 뿐
		//그래서 형변환을 했기 때문에 5개 모두 sc2 변수에서 사용할 수 있어야하지만
		//실제로는 2개 밖에 사용 못함 그래서 형변환 생략이 불가능
		
		SampleParent sp2 = new SampleChild(); //위에랑 반대의 상황
		//Child안에 5개가 있으므로 Parent의 2개를 충분히 사용 가능하므로
		//형변환 생략 가능
		System.out.println(sp2.var);
		System.out.println(sp2.method(10, 20));
	}
	
}



