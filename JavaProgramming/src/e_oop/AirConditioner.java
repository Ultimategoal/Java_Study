package e_oop;

import javax.sound.midi.SysexMessage;

public class AirConditioner {

	boolean power;
	int windPower;
	int temperature;
	
	final int MIN_WINDPOWER = 1;
	final int MAX_WINDPOWER = 5;
	final int MIN_TEMPERATURE = 16;
	final int MAX_TEMPERATURE = 30;
	
	AirConditioner(){
		power = false;
		windPower = 3;
		temperature = 26;
	}
	
	void power(){
		power = !power;
		System.out.println(power ? "켜짐" : "꺼짐");
	}
	
	void changeTemperature(int temperature){
		if(power){
			if(MIN_TEMPERATURE<= temperature && temperature <= MAX_TEMPERATURE){
				this.temperature = temperature;
			}
			System.out.println("온도. " + this.temperature);
		}
	}
	
	void temperatureUp(){
		changeTemperature(temperature + 1);
	}
	
	void temperatureDown(){
		changeTemperature(temperature - 1);
	}
	
	void windPowerUp(){
		if(power){
			if(windPower < MAX_WINDPOWER){
				windPower++;
			}
			showWindPower();
		}
	}
	
	void windPowerDown(){
		if(power){
			if(windPower > MIN_WINDPOWER){
				windPower--;
			}
			showWindPower();
		}
	}
	
	void showWindPower(){
		System.out.println("풍력. ");
		for(int i = MIN_WINDPOWER; i <= MAX_WINDPOWER; i++){
			if(i <= windPower){
				System.out.print("■");
			}else{
				System.out.print("□");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		AirConditioner ac = new AirConditioner();
		
		while(true){
			System.out.println("-------------------------");
			System.out.println("1.전원  2.바람세기↑ 3.바람세기↓");
			System.out.println("4.온도↑ 5.온도↓ 0.종료");
			System.out.println("-------------------------");
			System.out.print("번호를 입력해주세요");
			int input = ScanUtil.nextInt();

			switch(input){
			case 1: ac.power(); break;
			
			case 2: ac.windPowerUp(); break;
			
			case 3: ac.windPowerDown(); break;
			
			case 4: ac.temperatureUp(); break;
			
			case 5: ac.temperatureDown(); break;
			
			default:
				System.out.println("종료되었습니다.");
				System.exit(0);
				break;
			}
		}
		
	}
	
}
