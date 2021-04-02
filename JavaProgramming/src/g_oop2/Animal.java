package g_oop2;

public abstract class Animal {
	//동물이 이동하는 메서드와 소리를 내는 메서드를 만들 것임
	//4발 동물들은 똑같이 움직이지만 동물들마다 소리를 다 다른 것처럼
	//추상메서드와 같음 소리(내용)이 다름
	
	void run(){
		System.out.println("달려가자~~");
	}
	
	abstract void sound();
	
}

class Dog extends Animal{

	@Override
	void sound() {
		System.out.println("멍멍!!");
	}
	
}

class Cat extends Animal{

	@Override
	void sound() {
		System.out.println("야옹!!");
	}
	
}

class Horse extends Animal{

	@Override
	void sound() {
		System.out.println("히힝!!");
	}
	
}


