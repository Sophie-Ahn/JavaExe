package ch13.Generic01.ch13.sec01;

public class GenericExample {
	public static void main(String[] args) {
		// Box<String> box1 = new Box<String>();
		Box<String> box1 = new Box<>();
		box1.content = "안녕";
		String str = box1.content;
		System.out.println(str);
		
		// Box<Integer> box2 = new Box<Integer>();
		Box<Integer> box2 = new Box<>();
		box2.content = 100; // Boxing: Heep -> Stack
		int value = box2.content; // UnBoxing: Stack -> Heep
		System.out.println(value);
	}
}
