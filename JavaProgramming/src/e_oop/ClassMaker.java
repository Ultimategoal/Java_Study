package e_oop;

public class ClassMaker {
	
	//전역변수 하나를 선언 및 초기화 해주세요.
	
	int a = 0;
	
	//리턴타입과 파라미터가 없는 메서드 하나를 만들어주세요.
	//메서드 안에서 전역변수를 출력해주세요.
	
	void method(){
		System.out.println(a);
	}
	
	//전역변수와 동일한 타입의 리턴타입이 있고 파라미터는 없는 메서드 하나를 만들어주세요.
	//메서드 안에서 전역변수를 리턴해주세요.
	
	int method1(){
		return a;
	}
	
	//리턴타입은 없고 파라미터가 있는 메서드 하나를 만들어주세요.
	//메서드 안에서 파라미터를 출력해주세요.
	
	void method2(String parameter){
		System.out.println(parameter);
		if(parameter.equals("종료")){
			return; //종료시키고 싶다면 이런식으로도 사용 가능
		} //void에서도 마찬가지로 return을 쓸 수는 있고 여기서는 메서드를 종료시키는 역할만 함
	}
	
	//int타입의 리턴타입과 int타입의 파라미터 두개가 있는 메서드 하나를 만들어주세요.
	//메서드 안에서 두 파라미터를 곱한 결과를 리턴해주세요.
	//파라미터가 두 개 일 때는 콤마로 구분해서 넣어주면 됨
	
	int method3(int par1 , int par2){
		return par1 * par2;
	}
	
	//리턴의 역할 2가지 : 메서드를 종료시키는 역할, 값을 리턴시키는 역할

}
