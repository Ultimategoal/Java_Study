package t_game;

import e_oop.ScanUtil;

public class MyGame {
	
	Character c;
	Item[] items;
	
	MyGame(){ //생성자 생성
		c = new Character("가렌", 100, 50, 20, 10);
		
		items = new Item[10];
		items[0] = new Item("무한의대결", 0, 0, 10, 0);
		items[1] = new Item("가시갑옷", 0, 0, 0, 10);
	}

	public static void main(String[] args) {
		new MyGame().start(); //객체 생성을 하고 스타트 메소드 호출 //스타트라는 메소드를 따로 만들어서 게임을 진행시키려고함
		//메인 메소드에서 실행하지 않는 이유는 static이 붙어 있어서 불편함 그래서 객체 생성을 계속 해야하는 번거로움 때문에 스타트라는 메소드를 따로 만들어서 호출하려고 함
	}
	
	void start(){
		int input = 0;
		while(true){
			System.out.println("1.내정보\t2.사냥\t0.종료");
			input = ScanUtil.nextInt();
			
			switch (input) {
			case 1:
				c.showInfo();
				break;
			case 2:
				hunt();
				break;
			case 0:
				System.out.println("종료되었습니다.");
				System.exit(0);
			}
		}
	}
	
	void hunt(){
		Monster m = new Monster("고블린", 50, 10, 15, 10, new Item[]{items[0], items[1]});
		System.out.println(m.name + "를 만났습니다. 전투를 시작합니다.");
		
		int input = 0;
		battle : while(true){
			System.out.println("1.공격\t2.도망");
			input = ScanUtil.nextInt();
			switch(input){
			case 1:
				c.attack(m);
				if(m.hp <= 0){
					System.out.println(m.name + "를 처치하였습니다.");
					c.getExp(150);
					Item item = m.itemDrop();
					c.getItem(item);
					break battle;
				}
				m.attack(c);
				break;
			case 2:
				System.out.println("도망쳤습니다.");
				break battle;
			}
			
		}
	}

}

//과제 : 게임 만들기 고퀄로 만들기 다음 주 화요일까지 발표 예정
