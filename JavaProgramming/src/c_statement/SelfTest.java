package c_statement;

import java.util.Scanner;

public class SelfTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String answer = null;
		int sum = 0;
		
		System.out.print("식사 후 얼마되지 않아서 금방 허기가 진다.(Y/N)>");
		answer = sc.nextLine();
		if(answer.equals("Y")) sum++;
		System.out.print("원두커피보다는 설탕을 넣은 커피를 즐긴다.");
		answer = sc.nextLine();
		if(answer.equals("Y")) sum++;
		System.out.print("스트레스를 받으면 식욕이 당긴다.");
		answer = sc.nextLine();
		if(answer.equals("Y")) sum++;
		System.out.print("스트레스를 받았을때에 간식을 먹게 되면 기분이 안정이 된다.");
		answer = sc.nextLine();
		if(answer.equals("Y")) sum++;
		System.out.print("무언가 먹지 않으면 불안한 느낌이 들면서 일이나 공부등에 집중하기가 힘들다.");
		answer = sc.nextLine();
		if(answer.equals("Y")) sum++;
		System.out.print("습관적으로 빵이나 과자를 찾게 된다.");
		answer = sc.nextLine();
		if(answer.equals("Y")) sum++;
		System.out.print("아침을 거른날보다, 아침을 먹은 날이 점심시간이 되기 전에 더욱 배가 고프다.");
		answer = sc.nextLine();
		if(answer.equals("Y")) sum++;
		System.out.print("패스트푸드나 인스턴트 식품을 즐겨먹는다.");
		answer = sc.nextLine();
		if(answer.equals("Y")) sum++;
		System.out.print("식사 후 졸리고 나른한 경우가 종종 있다.");
		answer = sc.nextLine();
		if(answer.equals("Y")) sum++;
		System.out.print("빵이나 과자, 케익을 먹기 시작하면 양을 조절하지 못하고 끊임없이 먹게 된다.");
		answer = sc.nextLine();
		if(answer.equals("Y")) sum++;
		System.out.print("많이 먹어도 배가 부른 느낌이 쉽게 들지 않는다.");
		answer = sc.nextLine();
		if(answer.equals("Y")) sum++;
		System.out.print("배가 불러도 입에서 음식이 당겨 음식을 제한하지 못한다.");
		answer = sc.nextLine();
		if(answer.equals("Y")) sum++;
		System.out.print("부모님 중 혈압, 당뇨, 심장병, 고지혈 증 등의 순환기질환을 가진 분이 계신다.");
		answer = sc.nextLine();
		if(answer.equals("Y")) sum++;
		System.out.print("잡곡밥보다는 흰쌀밥을 선호한다.");
		answer = sc.nextLine();
		if(answer.equals("Y")) sum++;
		System.out.print("밀가루음식(스파게티, 흰식빵, 케익류 등)을 선호하며 일주일에 3회이상 밀가루음식을 먹는다.");
		answer = sc.nextLine();
		if(answer.equals("Y")) sum++;
		System.out.print("맛있는 음식을 먹는 상상을 하거나 음식을 보아도 먹고 싶은 욕구가 강하게 든다.");
		answer = sc.nextLine();
		if(answer.equals("Y")) sum++;
		System.out.print("평소 운동을 규칙적으로 하지 않고 생활 운동량도 많지 않다.");
		answer = sc.nextLine();
		if(answer.equals("Y")) sum++;
		System.out.print("체중을 감량하더라도 다시 쉽게 찐다.");
		answer = sc.nextLine();
		if(answer.equals("Y")) sum++;
		System.out.print("부모형제나 친인척 중에 비만인 사람이 있다.");
		answer = sc.nextLine();
		if(answer.equals("Y")) sum++;

		// 20 번 반복 뒤에 이거 넣으면 됨
		if(sum <= 6){
			System.out.println("정상");
		}else if(7 <= sum && sum <= 13){
			System.out.println("탄수화물 중독의 위험");
		}else{
			System.out.println("탄수화물 중독증");
		}
		
	}

}
