package g_oop2;

public class Starcraft {

	public static void main(String[] args) {
		Marine marine = new Marine();
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		SCV scv = new SCV();
		
		scv.repair(tank);
		scv.repair(dropship);
		
		Dog dog = new Dog(); //아까 인터페이스 그냥 확인용
		dog.sound();
		Cat cat = new Cat();
		cat.sound();
		
//		scv.repair(marine); //컴파일 에러 뜸
	}
}
//관계가 없는 것들끼리 인터페이스는 관계를 만들어 줄 수 있다.


class Unit{
	int hp;
	final int MAX_HP;
	
	Unit(int hp){
		MAX_HP = hp;
		this.hp = MAX_HP;
	}
}

class Marine extends Unit{
	//컴파일 에러 이유는 부모 클래스 생성자에 파라미터가 있기 때문
	Marine(){
		super(40); //마린의 체력은 40으로 초기화
	}
}

class Tank extends Unit implements Repairable{ //마린이 포함되지 않은 탱크와 드랍쉽만 가지는 관계로 만들 수 있음
	Tank(){
		super(150);
	}
}

class Dropship extends Unit implements Repairable{
	Dropship(){
		super(125);
	}
}

class SCV extends Unit{
	SCV(){
		super(60);
	}
	
	void repair(Repairable r){//탱크랑 드랍쉽만 수리 해야함, 인터페이스를 이용해서 두 개의 수리가 가능한 관계를 만들어서 그 인터페이스를 타입으로 사용할 예정
		//위에 파라미터 인터페이스 타입으로 넣음으로 인해 마린에 영향을 안주고 탱크와 드랍쉽만 수리가 가능
		if(r instanceof Unit){ //Unit으로 형변환이 가능한지 확인, instanceof의 기능 : 왼쪽에 있는 r이 오른쪽에 있는 Unit으로 형변환 가능한지 확인해줌
			Unit u = (Unit)r;
			
			while(u.hp < u.MAX_HP){
				u.hp++;
				
			}
			System.out.println("회복중");
		}
	}
}

interface Repairable{
	
}