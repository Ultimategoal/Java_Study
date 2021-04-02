package lastOmok;

import e_oop.ScanUtil;

public class OmakMain {

	public static void main(String[] args) {
		OmokFile of = new OmokFile();
		OmokMenu om = new OmokMenu();
		int input = 0;
		om.menu();
//		do{
//			try {input = ScanUtil.nextInt();
//			}
//			catch (Exception e){
//			 System.out.println("다시 입력해주세요");
//			}
//		}while(input == 0);
		
		while(true){input = ScanUtil.nextInt();
			
			switch(input){
			
			case 1: of.information();
			break;
			
			case 0: System.out.println("시스템을 종료합니다");
			System.exit(0);
			break;
			
			default : System.out.println("다시 입력해주세요");
			break;
			}
		}
		
		
	}		
	
}
	


