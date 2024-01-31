package ch09.iskindof06;

public class ForcePolice extends Police {
	public ForcePolice (int bullet, int handcuffs) {
		super(bullet, handcuffs);
	}
	public void run() {
		System.out.println("Running!!!");
	}
	public void fight() {
		System.out.println("Fight!");
	}
}
