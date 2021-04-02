package gameAssignment;

import e_oop.ScanUtil;

public class GameStart {
	Character c;
	Item[] items;
	
	GameStart(){
		c = new Character("유저", 100, 30, 10, 5);
		
		items = new Item[10];
		items[0] = new Item("가시갑옷",5,0,0,0);
		items[1] = new Item("소드",0,0,5,0);
		}

	public static void main(String[] args) {
		new GameStart().start();
		
	}
	
	void start(){
		int input = 0;
		
		while(true){
			System.out.println("1.내정보\t2.사냥\t0.종료");
			input = ScanUtil.nextInt();
			
			switch(input){
				case 1: c.showInfo(); break;
				case 2: hunt(); 	break;
				case 0: System.out.println("프로그램이 종료되었습니다."); System.exit(0);	break;
			}
		}
	}
	
	void hunt(){
		Monster m = new Monster("고블린", 30, 20, 5, 5, new Item[] {items[0],items[1]});
		System.out.println(m.name + "을 만났습니다. 전투를 시작합니다");
		
		int input = 0;
		battle : while(true){
			System.out.println("1.공격\t2.도망");
			input = ScanUtil.nextInt();
			
			switch(input){
			
				case 1: c.attack(m);
						if(m.hp <= 0){
							System.out.println(m.name + "를 처치하였습니다.");
							c.getExp(30);
							Item item = m.itemDrop();
							c.getItem(item);
							break battle;
						}
						m.attack(c);
						break;
						
				case 2: System.out.println("도망쳤습니다.");
						break battle;
			}
		}
	}

}
