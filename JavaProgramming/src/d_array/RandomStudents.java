package d_array;

import java.util.Scanner;

public class RandomStudents {

	public static void main(String[] args) {
		//입력한 숫자만큼 학생의 이름을 랜덤으로 출력하는 프로그램을 만들어주세요.
		
		String [] name = {"김병수", "곽명훈", "김나위", "김성현", "김영광", "김정명", "김찬미", 
				"김현민", "김현성", "류창현", "맹세희", "배병주", "설동비", "양규진", 
				"여지연", "오태훈", "이기정", "이상훈", "이재헌", "이치우", "전민주", 
				"조기범", "조영현", "조항민", "최진우"};

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요>");
		int input = Integer.parseInt(sc.nextLine());
		
		String[] ran = new String [input];
		int pickCount = 0;
		do{
			int random = (int)(Math.random() * name.length);
			
			boolean flag = true;
			for(int j = 0; j < ran.length; j++){
				if(name[random].equals(ran[j]));{
					flag = false;
				}
			}
			
			if(flag){
				ran[pickCount] = name[random];
				pickCount++;
			}
		}while(pickCount < input);
		
		
		
		
		
		
		for(int i = 0; i < input; i++){
			String temp3 = ran[i];
			ran[0] = ran[i];
			ran[i] = temp3;
			for(int j = 0; j < (int)(Math.random()*name.length)+1; j++){
				String temp = name[j];
				name[0] = name[j];
				name[j] = temp;
				ran[i] = name[j];
			
			}
			System.out.println(ran[i]);
		}
//		System.out.println(Arrays.toString(ran));
	
		
//		for(int i = 0; i < (int)(Math.random()*name.length)+1; i++){
//			String temp = name[i];
//			name[0] = name[i];
//			name[i] = temp;
//		}




	}

}
