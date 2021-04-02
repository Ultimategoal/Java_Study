package t_game;

public class Character {

	String name; 	//이름
	int maxHp;		//최대 체력
	int maxMp;		//최대 마나
	int hp; 		//체력
	int mp;			//마나
	int att;		//공격력
	int def;		//방어력
	int level;		//레벨
	int exp;		//경험치
	Item[] Items; 	//보유 아이템
	
	//변수들 초기화 하기 위해 생성자를 이용할것임
	
	Character(String name, int hp, int mp, int att, int def){
		this.name = name;
		this.maxHp = hp;
		this.maxMp = mp;
		this.hp = this.maxHp;
		this.mp = this.maxMp;
		this.att = att;
		this.def = def;
		this.level = 1;
		this.exp = 0;
		this.Items = new Item[10];
	}
	
	//상태창
	
	void showInfo(){
		System.out.println("======================================");
		System.out.println("------------------상태-----------------");
		System.out.println("이름 : " + name);
		System.out.println("레벨 : " + level + "(" + exp + "/100)");
		System.out.println("체력 : " + hp + "/" + maxHp);
		System.out.println("마나 : " + mp + "/" + maxMp);
		System.out.println("공격 : " + att);
		System.out.println("방어 : " + def);
		System.out.println("------------------아이템---------------");
		for(int i = 0; i < Items.length; i++){
			if(Items[i] != null){
				System.out.println(Items[i].itemInfo());
			}
		}
		System.out.println("======================================");
	}
	
	void attack(Monster m){
		int damage = att - m.def;
		damage = damage <= 0 ? 1 : damage;
		m.hp = m.hp < damage ? m.hp - m.hp : m.hp - damage; // 그냥 0으로 넣어도 상관없음
		System.out.println(name + "가 공격" + m.name + "에게" + damage + "만큼 데미지를 주었습니다.");
		System.out.println(m.name + "의 남은 HP : " + m.hp);
	}
	
	void getExp(int exp){
		System.out.println(exp + "의 경험치를 획득하였습니다.");
		this.exp += exp;
		while(100 <= this.exp){
			levelUp();
			this.exp -= 100;
		}
	}
	
	void levelUp(){
		level++;
		maxHp += 10;
		maxMp += 5;
		att += 2;
		def += 2;
		hp = maxHp;
		mp = maxMp;
		System.out.println("LEVEL UP!!");
	}
	
	void getItem(Item item){
		System.out.println(item.name + "을 획득하셨습니다.");
		for(int i = 0; i < Items.length; i++){
			if(Items[i] == null){	//배열의 빈공간에 넣어줬음
				Items[i] = item;
				break;
			}
		}
		maxHp += item.hp; // 아이템을 가지고만 있어도 아이템의 능력만큼 능력치를 더해준 것
		maxMp += item.mp;
		att += item.att;
		def += item.def;
	}
	
}
