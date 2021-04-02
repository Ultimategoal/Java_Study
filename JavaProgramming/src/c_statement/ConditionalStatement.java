package c_statement;

import java.util.Arrays;
import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {	
		/*
		 * 조건문
		 * - if문
		 * - switch문
		 * 
		 * if문
		 * 	if(조건식){} : 조건식의 결과가 true이면 블럭안의 문장을 수행한다.
		 * 	else if(조건식){} : 다수의 조건이 필요할 때 if위에 추가한다.
		 * 	else{} : 결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다.
		 * 	조건식은 주로 boolean 타입, 조건식이 true이면 블럭안의 문장 수행 false이면 넘어감
		 */
		
		int a = 1;
		
		if(a == 1){
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
		}
		
		if(a == 0){
			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");
		}
		
		if(a == 1) {
			System.out.println("a가 1인 경우에 하고싶은 것");
		}else if(a == 2) {
			System.out.println("a가 2인 경우에 하고싶은 것");
		}else if(a == 3) {
			System.out.println("a가 3인 경우에 하고싶은 것");
		}else{
			System.out.println("이외의 경우에 하고싶은 것");
		}
		
		//조건을 한묶음으로 사용하기 위해서는 반드시 else if를 사용해야 한다.
		if(a < 10){
			System.out.println("a가 10보다 작다.");
		}else if(a < 20){
			System.out.println("a가 20보다 작다.");
		}
		
		//식별함수가 60점 이상이면 합격 그렇지 않으면 불합격
		int score = 60;
		if(score >= 60){
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		//성적에 등급을 부여하는 프로그램
		score = 80;
		String grade = null;
		
		if(score >= 90){
			grade = "A";
		}else if(score >= 80 && score <= 89){ //&& 옆에 문장은 굳이 없어도 됨
			grade = "B";
		}else if(score >=70 && score < 80){
			grade = "C";
		}else if(score >=60 && score < 70){
			grade = "D";
		}else {
			grade = "F";
		}
		System.out.println(score + "점에 해당하는 등급은" + grade + " 입니다.");
		
		score = 80;
		grade = null;
		
		if(90 <= score){
			grade = "A";
			if(97 <= score){
				grade = "A+";
			}else if(94 > score){
				grade = "A-";
			}
		}else if(80 <= score){
			grade = "B";
			if(87 <= score){
				grade += "+";   //요렇게 써도 상관은 없음
			}else if(84 > score){
				grade += "-";  
			}
		}else if(70 <= score){
			grade = "C";
			if(77 <= score){
				grade = "C+";
			}else if(74 > score){
				grade = "C-";
			}
		}else if(60 <= score){
			grade = "D";
			if(67 <= score){
				grade = "D+";
			}else if(64 > score){
				grade = "D-";
			}
		}else {
			grade = "F";
		}
		System.out.println(score + "점에 해당하는 등급은" + grade + "입니다.");
		
		/*
		 * switch문
		 * - switch(Int/String){ case 1: break; )
		 * - 조건식의 결과는 정수와 문자열만(JDK1.7부터 문자열 허용) 허용한다.
		 * - 조건식과 일치하는 case문 이후의 문장을 수행한다.
		 */
		
		a = 1;
		switch(a){
		case 1:
			System.out.println("a가 1인 경우에 하고싶은 것");
			break;
		case 2:
			System.out.println("a가 2인 경우에 하고싶은 것");
		default:
			System.out.println("이외의 경우에 하고싶은 것");
		}
		
		//else if와 달리 break를 따로 안걸어주면 밑에 statement까지 모두 실행하게 됨
		//따라서 break가 필요함
		
		String b = "a";
		switch(b){
		case "a":
			System.out.println("b가 \"a\"인 경우에 하고싶은 것"); //여기서 역슬러쉬는 문자열 안에 쌍따음표 표현해주기 위한 역할
			break;
		case "b":
			System.out.println("b가 \"b\"인 경우에 하고싶은 것");
			break;
		default:
			System.out.println("이외의 경우에 하고싶은 것");
		}
		
		// \\역슬러쉬는 탈출하게 해줌 위에서는 문자열 탈출이 아닌 표현을 하게 해줌
		//switch문은 정확히 일치하는 값에만 쓰기 때문에 사용용도가 if같이 범위를 나타내는 조건문에 비해 제한적이라
		//자주 사용하지는 않음
		//같은 표현일 때 연산속도는 if문보다는 swich문이 조금 더 빠름
		
		//주어진 월에 해당하는 계절을 출력해봅시다.
		int month = 1;
		String season = null;
		
		switch(month){
		case 3: case 4: case 5:
			season = "봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
			break;
		case 12: case 1: case 2:
			season = "겨울";
			break;
		}
		System.out.println(month + "월은 " + season + "입니다.");
		
		score = 90;
		grade = null;
		
		switch(score / 10){
		case 5:
			grade = "F";
			break;
		case 6:
			grade = "D";
			break;
		case 7:
			grade = "C";
			break;
		case 8:
			grade = "B";
			break;
		case 9: case 10:
			grade = "A";
			break;
		default: grade = "F";
		}
		System.out.println(score + "점에 해당하는 등급은 " + grade + "입니다.");
		//이렇게 10으로 나눠주면 case문을 많이 쓸 필요가 없음
		
		//숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요.
		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력해주세요>");
//		
//		int num = Integer.parseInt(sc.nextLine());
//		if (num == 0){
//			System.out.println("출력된 숫자는 0입니다.");
//		}else if(num != 0){
//			System.out.println("출력된 숫자는 0이 아닙니다.");
//		}
//		
//		switch(num){
//		case 0:
//			System.out.println("0 입니다.");
//			break;
//		default:
//			System.out.println("0이 아닙니다.");
//			break;
//		}
		
		//숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
		
//		System.out.println("숫자를 입력받아주세요>");
//		int number = Integer.parseInt(sc.nextLine());
//		
//		if(number % 2 == 0){
//			System.out.println("짝수입니다.");
//		}else{
//			System.out.println("홀수입니다.");
//		}
//		
		//정수 3개를 입력받아 총점, 평균, 등급을 출력해주세요.
//		System.out.print("첫 번째 점수를 입력해주세요>");
//		int kor, eng, math;
//		String grade1, grade2, grade3;
//		kor = Integer.parseInt(sc.nextLine());
//		System.out.print("두 번째 점수를 입력해주세요>");
//		eng = Integer.parseInt(sc.nextLine());
//		System.out.print("세 번째 점수를 입력해주세요>");
//		math = Integer.parseInt(sc.nextLine());
//		int sum = kor + eng + math;
//		double avg = sum/3.0;
//		
//		if(kor >= 90){
//			grade1 = "A";
//		}else if(kor >=80){
//			grade1 = "B";
//		}else if(kor >=70){
//			grade1 = "C";
//		}else if(kor >=60){
//			grade1 = "D";
//		}else {
//			grade1 = "F";
//		}
//		
//		if(eng >= 90){
//			grade2 = "A";
//		}else if(eng >=80){
//			grade2 = "B";
//		}else if(eng >=70){
//			grade2 = "C";
//		}else if(eng >=60){
//			grade2 = "D";
//		}else {
//			grade2 = "F";
//		}
//		
//		if(math >= 90){
//			grade3 = "A";
//		}else if(math >=80){
//			grade3 = "B";
//		}else if(math >=70){
//			grade3 = "C";
//		}else if(math >=60){
//			grade3 = "D";
//		}else {
//			grade3 = "F";
//		}
//		System.out.println("총점: " + sum + "평균: " + avg + "첫 번째 등급: " + grade1 + "두 번째 등급: " + grade2 + "세 번째 등급: " + grade3  );
	
		//수업시간에는 하나씩 등급 안매기고 그냥 평균으로 했음
		
		//1 - 100 사이의 랜덤한 수를 3개 발생시키고 오름차순으로 출력해주세요.
		
		int num1, num2, num3;
		num1 = (int) (Math.random()*100) + 1;
		num2 = (int) (Math.random()*100) + 1;
		num3 = (int) (Math.random()*100) + 1;
		if(num1 > num2){
			int temp = num1;
			num1 = num2;
			num2 = temp; // 이렇게 해주면 num1과 num2의 값을 바꿔준것임 num1이 더크면 안되니까 클 경우에만 해당
		}
		if(num1 > num3){
			int temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if(num2 > num3){
			int temp = num2;
			num2 = num3;
			num3 = temp;
		}
		System.out.println(num1 + " < " + num2 + " < " + num3);
	}

}
