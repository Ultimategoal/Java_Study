package b_operator;

public class LogicalOperator {

	public static void main(String[] args) {
		/*
		 * 논리연산자
		 * - &&(AND), ||(OR), !(NOT)
		 * - 피연산자로 boolean만 허용한다.
		 */
		
		int x = 10;
		int y = 20;
		boolean b = 0 < x && x < 10 || x < y;
		//or 보다는 and가 먼저 실행되는 우선 순위임 and가 뒤에 있어도 and부터 실행
		b = !(x < y);
		System.out.println(b);
		// !의 경우 반드시 boolean타입에다 써야함 따라서 괄호가 반드시 수반
		
		//효율적 연산
		b = true && true; //true
		b = true && false; //false
		b = false && true; //false
		b = false && false; //false
		
		b = true || true; //true
		b = true || false; //true
		b = false || true; //true
		b = false || false; //false
		//왼쪽의 피연산자에서 결과가 정해지면 오른쪽은 수행하지 않는다.
		//위에 and의 경우 왼쪽만 보고 하나라도 false면 false이기 때문에 우측에 노란색 생김
		//반대로 or의 경우에도 하나라도 true면 true라서 오른쪽에 연산을 하지 않아서 노란줄 생김
		
		int a = 10;
		b = a < 5 && 0 < a++;
		System.out.println(a);
		//의도를 가지고 작성했지만 이런 경우에는 효율적 연산 때문에 a++이 실행되지 않아서 그대로 10만 출력됨
		//왼쪽의 결과값만 보고 오른쪽을 아예 생략하기 때문에 발생함
		
		//다음의 문장들을 코드로 작성해주세요.
		//1. x가 y보다 크고, x가 10보다 작다.
		b = x > y && x < 10;
		//2. x가 짝수이고, x가 y의 배수이다.
		b = x % 2 == 0 && x % y == 0;
		//3. x가 3의 배수이거나, x가 5의 배수이다.
		b = x % 3 == 0 || x % 5 == 0;
		
		

	}

}
