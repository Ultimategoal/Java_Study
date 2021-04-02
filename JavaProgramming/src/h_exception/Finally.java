package h_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Finally {

	public static void main(String[] args) {
		/*
		 * finally --반드시 실행되게 만들어줌
		 * - 필요에 따라 try,catch 뒤에 finally를 추가할 수 있다.
		 * - finally는 예외의 발생여부와 상관없이 가장 마지막에 수행된다.
		 * 
		 * 자동 자원 반환
		 * - try(변수 선언; 변수 선언) {} catch(Exception e) {}
		 * - 사용 후 반환이 필요한 객체를 try의 ()안에서 선언하면 try 블럭 종료시 자동으로 변환된다.
		 */
		
		FileInputStream fls = null; //파일 읽기
		try {
			fls = new FileInputStream("d:/file.txt");
//			fls.close(); //반드시 close라는 메서드를 이용해서 닫아줘야함 안그러면 자원이 계속 사용됨, 이거때문에 finally를 사용해줌, 여기서 쓰는게 아니고 뒤에 finally 쓰고 써주면 됨
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally{
			try {
				fls.close();
			} catch (Exception e) {// 처음 만들면 IOEXCEPTION e라고 뜨는데 그냥 IO지워주면됨, 보통 close와 같은 메서드 호출할 때 finally가 많이 사용
				e.printStackTrace();
			}
		}
		
		//근데 이렇게 쓰면 너무 불필요하게 써야할 코드들이 많으므로 이걸 보안하기 위해 나온게 자동 자원 반환임
		
		//자동 자원 반환(JDK1.7)
		try(FileOutputStream fos = new FileOutputStream("d:/file.txt")){//자동으로 close수행 해줘서 finally를 따로 쓸 필요가 없음
			String str = "파일에 쓰고 싶은 내용 아무거나 막 쓰시면 됩니다...";
			
			byte[] bytes = str.getBytes();
			
			for(int i = 0; i < bytes.length; i++){
				fos.write(bytes[i]);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
