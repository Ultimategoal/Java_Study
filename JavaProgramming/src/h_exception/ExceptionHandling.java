package h_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

	public static void main(String[] args) {
		/*
		 * 에러
		 * - 컴파일 에러 : 컴파일 시에 발생되는 에러(빨간줄)
		 * - 논리적 에러 : 실행은 되지만, 의도와 다르게 동작하는 것(버그)
		 * - 런타임 에러 : 실행 시에 발생되는 에러 (프로그램 실행 도중 발생하는 에러)
		 * 
		 * 런타임 에러
		 * - 런타임 에러 발생시 발생한 위치에서 프로그램이 비정상적으로 종료된다.
		 * - 에러 : 프로그램 코드에 의해 수습될 수 없는 심각한 오류(처리 불가)
		 * - 예외 : 프로그램 모드에 의해서 수습될 수 있는 다소 미약한 오류(처리 가능)
		 * 
		 * 예외
		 * - 모든 예외는 Exception 클래스의 자식 클래스이다.
		 * - RuntimeException 클래스와 그 자식들은 예외처리가 강제되지 않는다.
		 * - [RuntimeException 클래스와 그 자식들을 제외한] Exception 클래스의 자식들은 예외처리가 강제된다. , 예외처리 안하면 컴파일 에러 발생함
		 * 
		 * 예외처리(try-catch)
		 * - 예외처리를 통해 프로그램이 비정상적으로 종료되는 것을 방지할 수 있다.
		 * - try {} catch(Exception e) {}
		 * - try 블럭 안의 내용을 실행 중 예외가 발생하면 catch로 넘어간다.
		 * - catch ()안에는 처리할 예외를 지정해줄 수 있다.
		 * - 여러 종류의 예외를 처리할 수 있도록 catch는 하나 이상 올 수 있다.
		 * - 발생한 예외와 일치하는 catch 블럭안의 내용이 수행된 후 try-catch를 빠져나간다.
		 * - 발생한 예외와 일치하는 catch가 없을 경우 예외는 처리되지 않는다. , 그냥 프로그램 종료
		 */
		
		try{
			int result = 10 / 0; //컴파일 에러 안 발생했으므로 런타임에러의 자식
			System.out.println(result); //이렇게 실행하면 에러뜸 이제 이걸 예외처리해서 쓸꺼
		}
		catch(ArithmeticException | IndexOutOfBoundsException e){//실행시켜서 콘솔창에 첫 줄에 떠있는 에러가 있는데 그걸 복붙해서 붙여줘야함 그게 예외이고 예외 처리 해주기 위함임, 얘 옆에 by zero 있는데 그게 예외가 생긴 이유임
			e.printStackTrace();
		}catch(NullPointerException e){ //이렇게 catch 하나 더 써도 됨
			e.printStackTrace();
		}catch(Exception e){ // 예외를 하나씩 처리하기 귀찮으면 모든 예외를 한 번에 처리할 수 있는 방법이 옆에와 같이 Exception e 써주면 Exception 클래스의 모든 예외를 처리하겠다는걸 의미함
			e.printStackTrace();
		}
		
		//catch(ArithmeticException | IndexOutOfBoundsException e)라고 둘 중에 하나에 예외 처리 하겠다 의미
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		//ctrl + 1 눌렀을 때 surrounded try/catch 뜨면 예외처리가 강제되기 때문에 이런 경우 try/catch감싸주면 됨	
		//예외처리를 하는건 어려운게 아님 하지만 에러났을 때 메시지 읽을 줄 알아야함
		//어떤 예외처리가 필요한지에 대해서도 알 수 있음
		//첫줄에 어떤 예외가 왜 발생했는지 알려줌 그 다음에 at 이후로 그 에러가 어디서 발생했는지 알려줌
		
		test1(); //메서드 호출, 컴파일 에러 발생 증
		
		/*
		 * callStack
		 * LIFO구조임, 그래서 실행했을 때 에러가 main이 제일 밑, 그 다음 test1, 그 다음 test2 이런 순임
		 * 현재 실행중인 메서드들이 콜스택에 저장
		 * 가장 최근에 저장된게 가장 위에 있기 때문에 에러 발생시 가장 윗줄이 에러가 발생한 위치일 가능성이 가장 높음
		 * |		   |
		 * |__test2()__|
		 * |__test1()__|
		 * |__main()___|
		 */
		
	}

	private static void test1() {
		test2();
	}

	private static void test2() {
//		System.out.println(10 / 0);
		try {
			new FileInputStream(""); //실행해보면 첫줄이 내가 만든게 아닌경우는 에러가 맨 윗줄말고 다른데 있을 가능성이 있음, 결론적으로는 본인이 만든것중 가장 윗줄에 있는것을 찾는게 중요
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
