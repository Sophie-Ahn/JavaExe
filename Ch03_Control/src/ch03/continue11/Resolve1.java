package ch03.continue11;

public class Resolve1 {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i * 3 > 100) {
				continue;
			}
			sum += i * 3;
		}
		System.out.println(sum);
	}
}
