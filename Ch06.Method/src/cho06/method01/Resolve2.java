package cho06.method01;

import java.util.Scanner;

public class Resolve2 {
	public static int calc(int num0, int num1) {
		int result = num0 - num1;
		if (result > 0) {
			return result;
		} else {
			return -result;
		}
		
	}
	
	public static void result(int result) {
		System.out.println("결과값은 " + result);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수: ");
		int num0 = sc.nextInt();
		
		System.out.print("두 번째 정수: ");
		int num1 = sc.nextInt();
		
		int result = calc(num0, num1);
		result(result);
	}
}
