package ch09.interface12;

public class StartMain {
	public static void walk (StarUnit[] units) {
		for (StarUnit unit : units) {
			unit.walk();
		}
	}
	public static void attack (StarUnit[] units) {
		for (StarUnit unit : units) {
			unit.attack();
		}
	}
	public static void die (StarUnit[] units) {
		for (StarUnit unit : units) {
			unit.die();
		}
	}
	
	public static void main(String[] args) {
		StarUnit[] units = new StarUnit[] {
				new Marine(),
				new Scv(),
				new Hydra(),
				new Zealot()
				// 자식들의 클래스를 배열로 객체를 받을 수 있다
		};
		
		walk(units);
		attack(units);
		die(units);
	}
}
