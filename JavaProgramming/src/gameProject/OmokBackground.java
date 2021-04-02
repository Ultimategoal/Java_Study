package gameProject;

import e_oop.ScanUtil;

public class OmokBackground {
	
	public static void main(String[] args) {
		
		String[][] omok = new String[10][10];
		
		int px1 = 0;
		int py1 = 0;
		int px2 = 0;
		int py2 = 0;
		
		int win = 0;
		int turn = 0;
		
//		System.out.print("  ");
//		for(int i = 0; i < omok.length; i++){
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		
//		for(int i = 0; i < omok.length; i++){
//			System.out.print(i);
//			for(int j = 0; j < omok.length; j++){
//				omok[i][j] = " ㆍ";
//				System.out.print(omok[i][j]);
//			}
//			
//			System.out.println();
//			
//		}
		System.out.println("****************오목*************** ");
		for(int i = 0; i < omok.length; i++){
			for(int j = 0; j < omok.length; j++){
				omok[i][j] = " ㆍ";
				omok[0][0] = " ";
				omok[1][0] = "1";
				omok[2][0] = "2";
				omok[3][0] = "3";
				omok[4][0] = "4";
				omok[5][0] = "5";
				omok[6][0] = "6";
				omok[7][0] = "7";
				omok[8][0] = "8";
				omok[9][0] = "9";
				
				omok[0][1] = " 1";
				omok[0][2] = " 2";
				omok[0][3] = " 3";
				omok[0][4] = " 4";
				omok[0][5] = " 5";
				omok[0][6] = " 6";
				omok[0][7] = " 7";
				omok[0][8] = " 8";
				omok[0][9] = " 9 <<(x좌표)";
			}
		}
			
			
		while(true){
			for(int k = 0; k < omok.length; k++){
				for(int j= 0; j < omok.length; j++){
					System.out.print(omok[k][j]);
				}
				System.out.println();
			}
				
		
		
			if(win == 1){
				System.out.println("흑돌 승리!!");
				break;
			}
			else if(win == 2){
				System.out.println("백돌 승리!!");
				break;
			}
			
			if(turn % 2 == 0){
				System.out.println("흑돌 차례입니다.");
				System.out.println("y좌표 입력 : ");
				py1 = ScanUtil.nextInt();
				System.out.println("x좌표 입력 : ");
				px1 = ScanUtil.nextInt();
			
				if(omok[py1][px1] == " ㆍ"){
					omok[py1][px1] = " ●";
				}
				turn += 1;
				
				
			}
			else if(turn % 2 != 0){
				System.out.println("백돌 차례입니다.");
				System.out.println("y좌표 입력 : ");
				py2 = ScanUtil.nextInt();
				System.out.println("x좌표 입력 : ");
				px2 = ScanUtil.nextInt();
				
				if(omok[py2][px2] == " ㆍ"){
					omok[py2][px2] = " ○";
				}
				turn += 1;
			}
			
			for(int i = 0; i < omok.length; i++){
				for(int j = 0; j < omok.length; j++){
					if(omok[i][j] == " ●" && omok[i][j+1] == " ●" && omok[i][j+2] == " ●" && omok[i][j+3] == " ●" && omok[i][j+4] == " ●"){
						win = 1;
					}
					else if(omok[i][j] == " ○" && omok[i][j+1] == " ○" && omok[i][j+2] == " ○" && omok[i][j+3] == " ○" && omok[i][j+4] == " ○"){
						win = 2;
					}
				}
			}
			
			for(int i = 0; i < omok.length; i++){
				for(int j = 0; j < omok.length; j++){
					if(omok[i][j] == " ●" && omok[i+1][j] == " ●" && omok[i+2][j] == " ●" && omok[i+3][j] == " ●" && omok[i+4][j] == " ●"){
						win = 1;
					}
					else if(omok[i][j] == " ○" && omok[i+1][j] == " ○" && omok[i+2][j] == " ○" && omok[i+3][j] == " ○" && omok[i+4][j] == " ○"){
						win = 2;
					}
				}
			}
			
			for(int i = 0; i < omok.length; i++){
				for(int j = 0; j < omok.length; j++){
					if((omok[i][j] == " ●" && omok[i+1][j+1] == " ●" && omok[i+2][j+2] == " ●" && omok[i+3][j+3] == " ●" && omok[i+4][j+4] == " ●") ||
							(omok[i][j] == " ●" && omok[i-1][j+1] == " ●" && omok[i-2][j+2] == " ●" && omok[i-3][j+3] == " ●" && omok[i-4][j+4] == " ●")){
						win = 1;
					}
					else if((omok[i][j] == " ○" && omok[i+1][j+1] == " ○" && omok[i+2][j+2] == " ○" && omok[i+3][j+3] == " ○" && omok[i+4][j+4] == " ○") ||
							(omok[i][j] == " ○" && omok[i-1][j+1] == " ○" && omok[i-2][j+2] == " ○" && omok[i-3][j+3] == " ○" && omok[i-4][j+4] == " ○")){
						win = 2;
					}
					
				}
				
				
				
			}
			
			for(int i = 0; i < omok.length; i++){
				for(int j = 0; j < omok.length; j++){
					if((omok[i][j] == " ●" && omok[i-1][j-1] == " ●" && omok[i-2][j-2] == " ●" && omok[i-3][j-3] == " ●" && omok[i-4][j-4] == " ●") ||
							(omok[i][j] == " ●" && omok[i+1][j-1] == " ●" && omok[i+2][j-2] == " ●" && omok[i+3][j-3] == " ●" && omok[i+4][j-4] == " ●")){
						win = 1;
					}
					else if((omok[i][j] == " ○" && omok[i-1][j-1] == " ○" && omok[i-2][j-2] == " ○" && omok[i-3][j-3] == " ○" && omok[i-4][j-4] == " ○") ||
							(omok[i][j] == " ○" && omok[i+1][j-1] == " ○" && omok[i+2][j-2] == " ○" && omok[i+3][j-3] == " ○" && omok[i+4][j-4] == " ○")){
						win = 2;
					}
					
				}
				
				
				
			}
			
		}

			
			
			
	}
	
	

	

}


