package ch08.class11;

public class WatchTime {
	private int hour, min, sec;
	
	public WatchTime(int hour, int min, int sec) {
		System.out.println("this:" + this);
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	
	public void viewTime() {
		System.out.printf("[%02d:%02d:%02d]\n", hour, min, sec);
	}
	
	public static void main(String[] args) {
		WatchTime wtNum = new WatchTime(12, 13, 33);
		System.out.println("wtNum: " + wtNum);
		System.out.println("wtNum: " + wtNum.hashCode());
		wtNum.viewTime();
		
		WatchTime wtNum1 = new WatchTime(12, 13, 33);
		System.out.println("wtNum1: " + wtNum1);
		System.out.println("wtNum1: " + wtNum1.hashCode());
		wtNum.viewTime();
	}
}
