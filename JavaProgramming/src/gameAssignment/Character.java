package gameAssignment;

public class Character {

	String name;
	int hp;
	int mp;
	int maxHp;
	int maxMp;
	int att;
	int def;
	int exp;
	int level;
	Item[] items;
	
	Character(String name, int hp, int mp, int att, int def){
		this.name = name;
		this.maxHp = hp;
		this.maxMp = mp;
		this.hp = this.maxHp;
		this.mp = this.maxMp;
		this.att = att;
		this.def = def;
		this.exp = 0;
		this.level = 1;
		this.items = new Item[10];
	}
		
	void showInfo(){
		System.out.println("------------유저 정보-----------");
		System.out.println("이름  : " + name);
		System.out.println("경험치 : " + exp + "/" + 100);
		System.out.println("체력 : " + hp + "/" + maxHp);
		System.out.println("마나 : " + mp + "/" + maxMp);
		System.out.println("공격력 : " + att);
		System.out.println("방어력 : " + def);
		System.out.println("-----------------------------");
	}
	
	void attack(Monster m){
		int damage = att - m.def;
		damage = damage <= 0 ? 1 : damage;
		m.hp = m.hp < damage ? 0 : m.hp - damage;
		System.out.println(name + "가 공격 " + m.name + "에게 " + damage + "만큼 주었습니다.");
		System.out.println(m.name + "의 남은 Hp : " + m.hp);
	}
	
	void getExp(int exp){
		System.out.println(exp + "경험치만큼을 획득하였습니다.");
		this.exp += exp;
		while(100 <= this.exp){
			levelUp();
			this.exp -= 100;
		}
	}
	
	void levelUp(){
		level++;
		maxHp += 10;
		maxMp += 10;
		att += 10;
		def += 10;
		hp = maxHp;
		mp = maxMp;
		System.out.println("level up 하였습니다!!");
	}
	
	
	void getItem(Item item){
		System.out.println(item.name + "을 획득하였습니다.");
		for(int i = 0; i < items.length; i++){
			if(items == null){
				items[i] = item;
				break;
			}
		}
		maxHp += item.hp;
		maxMp += item.mp;
		hp += item.hp;
		mp += item.mp;
		att += item.att;
		def += item.def;
	}
	
	
	
	
}
