package ch05.array04;

public class Resolve04 {
	public static void main(String[] args) {
		int[] num = new int[10];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = (i + 1) * 3;
		}
		
		for (int i = num.length - 1; i >= 0; i--) {
			System.out.println(num[i] + "");
		}
	}
}
