package e_oop;

public class UserDefinedDataType {

	public static void main(String[] args) {
		/*
		 * 사용자 정의 데이터 타입 -> 클래스라고도 함, 이렇게 불리는 이유는 그냥 사용자가 만들면 되기 때문임
		 * - 데이터의 최종 진화 형태이다.(기본형 -> 배열 -> 클래스)
		 * - 서로 다른 타입의 데이터를 묶어서 사용하는 것이다.
		 * - 변수와 메서드로 구성할 수 있다.
		 */
		
		int kor;
		int eng;
		int math;
		int sum;
		double avg;
		String name;
		
		
		//배열
		int[] scores;
		int sum2;
		double avg2;
		String name2;
		
		//클래스를 사용하면 변수 하나만으로 위의 데이터들을 모두 표현할 수 있다.
		
		//클래스
		Student student = new Student(); //객체 생성(인스턴스화)
		
		student.kor = 80;
		student.eng = 90;
		student.math = 60;
		student.sum = student.kor + student.eng + student.math;
		student.avg = student.sum/ 3.0;
		student.name = "홍길동";
		
		System.out.println(student.sum);
		System.out.println(student.avg);
	}

}

class Student{
	int kor;
	int eng;
	int math;
//	int[] scores;
	int sum;
	double avg;
	String name;
}
