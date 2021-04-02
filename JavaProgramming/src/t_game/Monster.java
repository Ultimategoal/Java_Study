package t_game;

public class Monster {
	
	String name; 	//이름
	int maxHp;		//최대 체력
	int maxMp;		//최대 마나
	int hp; 		//체력
	int mp;			//마나
	int att;		//공격력
	int def;		//방어력
	Item[] items; 	//보유 아이템
	
	Monster(String name, int hp, int mp, int att, int def, Item[] items){
		this.name = name;
		this.maxHp = hp;
		this.maxMp = mp;
		this.hp = this.maxHp;
		this.mp = this.maxMp;
		this.att = att;
		this.def = def;
//		this.Items = new Item[10];
		this.items = items;
	}
	
	void attack(Character c){
		int damage = att - c.def;
		damage = damage <= 0 ? 1 : damage;
		c.hp = c.hp < damage ? c.hp - c.hp : c.hp - damage; // 그냥 0으로 넣어도 상관없음
		System.out.println(name + "가 공격" + c.name + "에게" + damage + "만큼 데미지를 주었습니다.");
		System.out.println(c.name + "의 남은 HP : " + c.hp);
	}
	
	//밑에 메소드는 리턴 타입이 필요함 왜냐하면 아이템을 누군가에게 주는것이기 때문
	Item itemDrop(){
		return items[(int)(Math.random() * items.length)];
	}
	
	

}
