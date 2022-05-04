package clock;

public class Clock {
	private Display hour = new Display(0,24);
	private Display minute = new Display(0,60);
	public void start() {
		for(;;) {
			minute.increase();
			if(minute.getValue()==0)//最好用getValue而不是minute.value,因为value是private,所以Display类之外不可视
				hour.increase();		
		
		System.out.printf("%02d:%02d\n",hour.getValue(),minute.getValue());
	
		}
	}
	public static void main(String[] args) {
		Clock clock = new Clock();
		clock.start();
	}
}
