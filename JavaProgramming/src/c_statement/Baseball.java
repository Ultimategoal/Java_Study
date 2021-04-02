package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		
		
		
		//수업 시간
		
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		
		do{
			a1 = (int)(Math.random() * 9) + 1;
			a2 = (int)(Math.random() * 9) + 1;
			a3 = (int)(Math.random() * 9) + 1;
		}while(a1 == a2 || a1 == a3 || a2 ==a3);
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(true){
			System.out.println("3자리 숫자>");
			int input = Integer.parseInt(sc.nextLine());
			int i3 = input % 10; //첫 째 자리
			input /= 10;
			int i2 = input % 10; //둘 째 자리
			input /= 10;
			int i1 = input % 10; //셋 째 자리
			
			int strike = 0;
			int ball = 0;
			int out = 0;
			
			if(a1 == i1) strike++;
			if(a2 == i2) strike++;
			if(a3 == i3) strike++;
			
			if(a1 == i2 || a1 == i3) ball++;
			if(a2 == i1 || a2 == i3) ball++;
			if(a3 == i1 || a3 == i2) ball++;
			
			out = 3 - strike - ball;
			
			System.out.println(++count + "차 시도(" + i1 + i2 + i3 + ") : " 
			+ strike + "S" + ball + "B" + out + "O");
			System.out.println("----------------------");
			if(strike == 3){
				System.out.println("정답입니다!");
				break;
			}
		}
		
		/*
		int answer1 = (int)(Math.random() *9) + 1;
		int answer2 = (int)(Math.random() *9) + 1;
		int answer3 = (int)(Math.random() *9) + 1;
		if(answer1 == answer2){
			int temp = (int)(Math.random() *9) + 1;
			answer2 = temp;
		}
		if(answer2 == answer3){
			int temp = (int)(Math.random() *9) + 1;
			answer3 = temp;
		}
		if(answer1 == answer3){
			int temp = (int)(Math.random() *9) + 1;
			answer1 = temp;
		}
		
		int input1, input2, input3 = 0;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.print("1숫자 세개를 입력해주세요>");
			input1 = Integer.parseInt(sc.nextLine());
			System.out.print("2숫자 세개를 입력해주세요>");
			input2 = Integer.parseInt(sc.nextLine());
			System.out.print("3숫자 세개를 입력해주세요>");
			input3 = Integer.parseInt(sc.nextLine());
			
		
			if(answer1 == input1 && answer2 == input2 && answer3 == input3){
				System.out.println("3s, 0b, 0o 입니다..");
			}else if(answer1 == input1 && answer2 == input2 && answer3 != input3){
				System.out.println("2s, 0b, 1o 입니다.");
			}else if(answer1 == input1 && answer2 != input2 && answer3 == input3){
				System.out.println("2s, 0b, 1o 입니다.");
			}else if(answer1 != input1 && answer2 == input2 && answer3 == input3){
				System.out.println("2s, 0b, 1o 입니다.");	
			}else if(answer1 == input1 && answer2 != input2 && answer3 != input3 && answer2 == input3 && answer3 == input2){
				System.out.println("1s, 2b, 0o 입니다.");
			}else if(answer1 == input1 && answer2 != input2 && answer3 != input3 && answer2 != input3 && answer3 == input2){
				System.out.println("1s, 1b, 1o 입니다.");
			}else if(answer1 == input1 && answer2 != input2 && answer3 != input3 && answer2 == input3 && answer3 != input2){
				System.out.println("1s, 1b, 1o 입니다.");
			}else if(answer1 == input1 && answer2 != input2 && answer3 != input3 && answer2 != input3 && answer3 != input2){
				System.out.println("1s, 0b, 2o 입니다.");
			}else if(answer1 != input1 && answer2 != input2 && answer3 != input3 && answer1 == input2 && answer2 == input3 && answer3 != input2){
				System.out.println("0s, 2b, 1o 입니다.");
			}else if(answer1 != input1 && answer2 != input2 && answer3 != input3 && answer1 == input3 && answer2 != input1 && answer3 == input1){
				System.out.println("0s, 2b, 1o 입니다.");
			}else if(answer1 != input1 && answer2 != input2 && answer3 != input3 && answer1 != input2 && answer2 == input3 && answer1 == input1){
				System.out.println("0s, 2b, 1o 입니다.");
			}
		
			if(answer1 == input1){
				System.out.println("strike");
			}else if(input1 == answer2){
				System.out.println("ball");
			}else if(input1 == answer3){
				System.out.println("ball");
			}else{
				System.out.println("out");
			}
			if(answer1 == input2){
				System.out.println("ball");
			}else if(input2 == answer2){
				System.out.println("strike");
			}else if(input2 == answer3){
				System.out.println("ball");
			}else{
				System.out.println("out");
			}
			if(answer1 == input3){
				System.out.println("ball");
			}else if(input3 == answer2){
				System.out.println("ball");
			}else if(input3 == answer3){
				System.out.println("strike");
			}else{
				System.out.println("out");
			}
			if(answer1 == input1 && answer2 == input2 && answer3 == input3){
				System.out.println("3 strikes 입니다!!");
			}
		}while(input1 != answer1 || input2 != answer2 || input3 != answer3);
		*/
	}
	
}
