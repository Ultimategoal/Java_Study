package gameProject;

import java.util.Arrays;

import e_oop.ScanUtil;

public class GoBackground{
	
	String[][] omok = new String[15][15];
	
	public static void main(String[] args) {
		
		System.out.println("1.게임시작\t0.게임종료");
		
		String[][] omok = new String[15][15];
		
	
			
		for(int i = 0; i < omok.length; i++){
			for(int j = 0; j < omok.length; j++){
				omok[i][j] =  "   ㆍ";
				omok[0][0] = " A";
				omok[1][0] = " B";
				omok[2][0] = " C";
				omok[3][0] = " D";
				omok[4][0] = " E";
				omok[5][0] = " F";
				omok[6][0] = " G";
				omok[7][0] = " H";
				omok[8][0] = " I";
				omok[9][0] = " J";
				omok[10][0] = " K";
				omok[11][0] = " L";
				omok[12][0] = " M";
				omok[13][0] = " N";
				omok[14][0] = " O";
				omok[14][0] = "  ";
				omok[14][1] = "   1";
				omok[14][2] = "  2";
				omok[14][3] = "  3";
				omok[14][4] = "  4";
				omok[14][5] = "  5";
				omok[14][6] = "  6";
				omok[14][7] = "  7";
				omok[14][8] = "  8";
				omok[14][9] = "  9";
				omok[14][10] = "  10";
				omok[14][11] = " 11";
				omok[14][12] = " 12";
				omok[14][13] = " 13";
				omok[14][14] = " 14";
				System.out.print(omok[i][j]);
			}
			System.out.println();
					}
		for(int i = 0; i < omok.length; i++){
			for(int j = 0; j < omok.length; j++){
				System.out.println("숫자를 입력해주세요");
				int input = ScanUtil.nextInt();
				System.out.println("문자를 입력해주세요");
				String input1 = ScanUtil.nextLine();
				if(input == 1 && input1 == " A"){
					System.out.println(omok[0][1] == " ●");
		}
	
		
		
//				if(input.equals(omok[i]) && input1.equals(omok[j])){
//					System.out.println(omok[i][j] == " ●");
//				}
				
			
//				if(input == "2"){
//					System.out.println(omok[0][1] == " ○");
//				}
			}
		}
		
//		void start(){
//			int input = 0;
//			while(true){
//				System.out.println("1.게임시작\t0.게임종료");
//			}
//	
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	int[][] omok = new int[10][10];
//	// 오목판 크기 x, y 전체 좌표
//	
//	
//	// 오목판 출력 함수 
//	public void viewOmok() {		
//		int numY = 0;				
//		// 오목 좌측 좌표값 초기화
//		
//		int numX = 64;				
//		// 오목 하단 좌표값 초기화
//		
//		for(int i = 0; i < omok.length; i++ ) {
//			int[] k = omok[i];
//			numY++;
//			
//			System.out.print(numY < 10 ? numY + " " : numY);
//			// 좌측에 Y 좌표 표시
//			// 조건문을 넣어 10 이하일 경우 공백을 넣은 이유는 
//			// 오목판을 보기 좋게 꾸며주기 위해서 입니다. 
//			
//			for(int j = 0; j < omok.length; j++) {
//				if(j == 1) {
//					System.out.print(" ●");	
//					// 흑돌 표시
//				} else if(j == 2) {
//					System.out.print(" ○"); 
//					// 백돌 표시
//				} else {
//					System.out.print(" ㆍ"); 
//					// 공백 표시
//				}
//			}
//			System.out.print("\n");
//		}
//		
//		System.out.print("  ");
//		
//		for(int i = 0; i < omok.length; i++) {
//			numX++;
//			System.out.print(" " + (char)numX);
//			// 하단에 X축 좌표 표시
//			// X축 또한 오목판을 보기 좋게 꾸미기 위해서 공백을 추가했습니다.
//		}
//		
//		System.out.print("\n");
//	}
//	
//	
//	
//	// 오목 
//	public int OmokAction(char x, int y, int turn) {
//		int chX = ((int) x) - 97;
//		// x축으로 입받은 아스키코드 숫자로 변경
//		
//		int chY = --y;
//		// 배열에 넣는 값 -1
//		
//		// 오목돌 체크
//		int count = 0;
//		
//		int _x,_y = 0;
//		
//		String name = new String();
//		name = (turn == 1) ? "흑돌" : "백돌"; 
//		
//		if( omok[chY][chX] != 0 ) {
//			System.out.println("이미 오목돌이 설치되어 있습니다.");
//			return 0;
//		} else {
//			omok[chY][chX] = turn;
//		}
//		
//		// 가로 체크 코드
//		_x = chX;
//		_y = chY;
//		count = 1;
//		while(omok[_y][_x] == turn && _x > 0) {
//			_x--;
//		}
//		while(omok[_y][++_x] == turn && _x <= 10) {
//			count++;
//			// System.out.println(count+"오목체크");
//		}
//		if(count == 5) {
//			System.out.println(name + "승리");
//			return 1;
//		}
//		
//		// 세로 체크 코드
//		_x = chX;
//		_y = chY;
//		count = 1;
//		while(omok[_y][_x] == turn && _y > 0) {
//			_y--;
//		}
//		while(omok[++_y][_x] == turn && _y <= 10) {
//			count++;
//			// System.out.println(count+"오목체크");
//		}
//		if(count == 5) {
//			System.out.println(name + "승리");
//			return 1;
//		}
//		
//		// 대각선 ↘
//		_x = chX;
//		_y = chY;
//		count = 1;
//		while(omok[_y][_x] == turn && _y > 0 && _x > 0) {
//			_y--;
//			_x--;
//		}
//		while(omok[++_y][++_x] == turn && _y <= 10 && _x <= 10) {
//			count++;
//			// System.out.println(count+"오목체크");
//		}
//		if(count == 5) {
//			System.out.println(name + "승리");
//			return 1;
//		}
//		
//		// 대각선 ↗
//		_x = chX;
//		_y = chY;
//		count = 1;
//		while(omok[_y][_x] == turn && _y > 0 && _x > 0) {
//			_y++;
//			_x--;
//		}
//		while(omok[--_y < 0 ? 0 : _y][++_x] == turn && _y <= 10 && _x <= 10) {
//			// omok[][] 에서 y 값에 조건문을 넣은 이유는 a, 1 을 입력시 
//			// y 값이 -1 로 음수값으로 넘어가면 오류를 출력해서 조정해 주었습니다. 
//			count++;
//		}
//		if(count == 5) {
//			System.out.println(name + "승리");
//			return 1;
//		}
//		
//		return 0;
//	}
	
	
	
