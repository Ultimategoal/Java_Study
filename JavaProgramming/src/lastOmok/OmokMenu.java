package lastOmok;

import e_oop.ScanUtil;

public class OmokMenu {

	public void menu(){
		System.out.println("1.오목두기\t0.종료하기");
	}
	
	int input(){
		int in = ScanUtil.nextInt();
		return in;
	}
}
