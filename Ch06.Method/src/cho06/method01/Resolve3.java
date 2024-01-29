package cho06.method01;

public class Resolve3 {
	public static int total(int a, int b) {
		int sum = 0;
		for (int i = 10; i <= b; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void result (int result) {
		System.out.println("결과값은 " + result);
	}
	public static void main(String[] args) {
		int result = total(10, 100);
		result(result);
	}
}
