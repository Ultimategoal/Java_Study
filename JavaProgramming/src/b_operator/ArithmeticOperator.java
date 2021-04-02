package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 * 산술 연산자
		 * - 사칙연산 : +, -, *, /, %(나머지)
		 * - 복합연산자 : +=, -=, *=, /=, %=
		 * - 증감연산자 : ++, --
		 */
		
		int result = 10 + 20 - 30 * 40 / 50 % 60;
		
		//연산 순서는 일반 수학과 동일
		//나머지 연산
		result = 10 / 3;
		System.out.println(result);
		result = 10 % 3;
		System.out.println(result);
		
		//5개의 산술연산자를 사용해 5개의 연산을 수행 후 결과를 출력해주세요.
		
		int number;
		
		number = 5 + 3;
		System.out.println(number);
		number = 5 - 3;
		System.out.println(number);
		number = 5 * 3;
		System.out.println(number);
		number = 5 / 3;
		System.out.println(number);
		number = 5 % 3;
		System.out.println(number);
		
		//복합연산자
		//변수에 저장되어 있는 값에 연산을 수행할 때 수행할 연산자와 대입연산자를 결합해 사용할 수 있다.
		result = result + 3;
		result += 3;
		
		result = result - 5;
		result -= 5;
		
		result = result * 2;
		result *= 2;
		
		//아래의 문장을 복합연산자를 사용한 문장으로 만들어주세요.
		//result - result + 10;
		result += 10;
		//result = result - 2 * 3;
		result -= 2 * 3;
		//result = result % 5;
		result %= 5;
		
		//증감연산자
		//증감연산자(++) : 변수의 값을 1 증가시킨다.
		//감소연산자(--) : 변수의 값을 1 감소시킨다.
		int i = 0;
		
		++i; //전위형 : 변수의 값을 읽어오기 전에 1 증가된다.
		i++; //후위형 : 변수의 값을 읽어온 후에 1 증가한다.
		--i;
		i--;
		
		i = 0;
		System.out.println("++i = " + ++i);
		i = 0;
		System.out.println("i++ =" + i++);
		System.out.println(i);
		
		//피연산자의 타입이 서로 같아야만 연산이 가능하다.
		int _int = 10;
		double _double = 3.14;
		double result2 = _int + _double; //표현범위가 더 큰 타입으로 형변환된다.
		System.out.println(result2);
		//표현범위가 더 큰 타입으로 자동 형변환이 됨
		
		long _long = 100L;
		_long = _int + _long;
		_int = _int + (int)_long;
		//더 작은 타입으로 저장 할려하니 _int에서 컴파일 에러가 나므로 _long을 int로 형 변환 해줘야한다.
		//이 경우 데이터 손실 발생할 수도 있음
		
		byte _byte = 5;
		short _short = 10;
		_int = _byte + _short; //int보다 작은 타입은 int로 형변환된다.
		System.out.println(_int);
		
		//컴퓨터는 최소 4바이트 이상인 경우 연산을 함
		//그래서 byte, short쓰는 것보다 int 쓰는게 효율적
		//왜냐하면 형 변환을 따로 해줘야하기 때문임
		
		char _char = 'a';
		char _char2 = 'b';
		_int = _char + _char2;
		System.out.println(_int);
		//유니코드 십진수 소문자a는 97 소문자 b는 98이다.
		
		//오버플로우, 언더플로우
		//표현범위를 벗어나는 값을 표현할 때 발생하는 현상
		byte b = 127;
		b++;
		System.out.println(b);
		//오버플로우 127이 최대라 더하면 가장 낮은 값이 -128이 나옴
		b--;
		System.out.println(b);
		//언더플로우 -128이 가장 작기 때문에 더 빼봤자 127로 가장 큰 값이 나옴
		
		
		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//1. 123456 + 654321
		//2. 1번의 결과값 * 123456
		//3. 2번의 결과값 / 123456
		//4. 3번의 결과값 - 654321
		//5. 4번의 결과값 % 123456
		
		long num = 123456 + 654321;
		System.out.println(num);
		num *= 123456;
		System.out.println(num);
		num /= 123456;
		System.out.println(num);
		num -= 654321;
		System.out.println(num);
		num %= 123456;
		System.out.println(num);
		
		//3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구해주세요.
		
		int c,d,e;
		c = 5;
		d = 8;
		e = 15;
		double sum = c + d + e;
		double average = sum / 3.0;
		System.out.println("sum : " + sum + "average : " + average);
		//double average에 3.0으로 쓰면 double 타입으로 바뀜
		
		//반올림
//		average = Math.round(average);
//		System.out.println(average);
		average = Math.round(average * 100) / 100.0;
		System.out.println(average);
		
		
		//10곱해주면 소수점 첫째자리 까지 보여줌
		//Math 메서드 쓰면 그냥 싹다 반올림한 결과 값을 보여줌
		
		//랜덤
		Math.random(); //0.0 ~ 1.0미만(0.9999999......)의 수를 발생시켜줌
		int random = (int)(Math.random() * 100) + 1;
		System.out.println(random);
		
		// int이기 때문에 100.99999에서 짤려서 최대 100까지 출력
		// 1부터 100까지 이기 때문에 1을 더해준다.
		
	}

}
