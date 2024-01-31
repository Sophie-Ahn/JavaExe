package ch09.iskindof06;

public class Gun {
	private int bullet;
	
	public Gun(int bullet) {
		this.bullet = bullet;
	}
	
	public void shot() { // 총을 쏠 수 있는 메소
		if(bullet > 0) {
			System.out.println("BBANG!");
			bullet--;
		} else {
			System.out.println("Chulkung Chulkung");
		}
	}
}
