package g_oop2;

public class Time {

	private int hour;
	private int minute;
	private int second;
	
	
	//get은 변수값을 읽기 위해 사용하는 메서드
	//set은 변수의 값을 저장하기 위한 메서드
	//도구 창에 source 들어가서 generate getters and setters 들어가면 이렇게 아래와 같이 6개의 메서드가 생성
	//변수를 만들어 이렇게 간접적으로 메서드를 만들게 되면 ??

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
		if(this.hour < 0){
			this.hour = 0;
		}else if(this.hour >= 24){
			this.hour = 0;
		}else{
			this.hour = hour;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
		if(this.minute < 0){
			this.minute = 0;
		}else if(this.minute >= 60){
			this.minute = 0;
			this.hour += 1;
			if(this.hour == 24){
				this.hour = 0;
			}
		}else{
			this.minute = minute;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
		if(this.second < 0){
			this.second = 0;
		}else if(this.second >= 60){
			this.second = 0;
			this.minute += 1;
			if(this.minute == 60){
				this.minute = 0;
				this.hour += 1;
				if(this.hour == 24){
					this.hour = 0;
				}
			}
		}else{
			this.second = second;
		}
	}
	
	/* 이렇게 해도 상관은 없음
	public void setHour(int hour) {
		this.hour = hour;
		if(this.hour < 0){
			this.hour = 0;
		}else if(this.hour > 23){
			this.hour = hour % 24;
		}else{
			this.hour = hour;
		}
	}

	public void setMinute(int minute) {
		this.minute = minute;
		if(this.minute < 0){
			this.minute = 0;
		}else if(this.minute > 59){
			this.minute = minute % 60;
			setHour(this.hour + minute / 60);
		}else{
			this.minute = minute;
		}
	}

	public void setSecond(int second) {
		this.second = second;
		if(this.second < 0){
			this.second = 0;
		}else if(this.second > 59){
			this.second = second % 60;
			setMinute(this.minute + second / 60);
		}else{
			this.second = second;
		}
	}*/
	
	String getTime(){
		return hour + ":" + minute + ":" + second;
	}
	
	void clock(){
		while(true){
			System.out.println(getTime());
			stop(1000);
			setSecond(second + 1);
		}
	}
	
	private void stop(int interval){
		try {
			Thread.sleep(interval);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//try catch라고 예외처리라고 함
		//stop이라는 지금 이 메서드는 외부에 노출 시킬 필요가 없으므로 접근제어자로 private을 작성
	}
}
































