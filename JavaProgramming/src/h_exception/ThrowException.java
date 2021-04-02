package h_exception;

import java.io.IOException;

public class ThrowException {

	public static void main(String[] args) {
		/*
		 * 예외 발생시키기
		 * - throw new Exception();
		 * - throw 예약어로 예외 클래스의 객체로 예외를 발생시킬 수 있다.
		 */
		
		try {
			throw new IOException(); //이 위치에서 반드시 에러가 발생하게 되어있음, try/catch 감싸줘야 하는 이유는 Exception 클래스의 자식이기 때문에 해줘야함
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		throw new NullPointerException(); // 위와 같이 컴파일 에러가 발생하지 않음 runtime exception 클래스의 자식이기 때문, 얘네들은 예외처리가 강제되지 않기 때문
		
		//앞으로 자주 보게 될 예외 몇가지
		//nullPointerException : null을 참조했다는 것
//		String str = null;
		
//		System.out.println(str.equals("abc")); // nullPointerException, 생각보다 자주 발생함, 이 라인안에 있는 어떤 변수가 null이라고 생각하고 찾으면됨
		
//		new IndexOutOfBoundsException(); 인덱스가 범위를 벗어났다는 것을 의미
		
		int[] a = new int[10];
		
		for(int i = 0; i <= a.length; i++){//이렇게 범위가 다르면 인덱스 범위를 벗어나서 IndexOutOfBoundsException이 발생함
			System.out.println(a[i]);//또는 위에 범위 i < a.length;로 했다고 해도 밑에서 a[i+1] 이런식으로 가도 범위가 달라지므로 똑같이 발생
		}
	}

}
