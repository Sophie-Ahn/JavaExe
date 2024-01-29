package ch05.array08;

public class SwapEx {
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		a = b;
		b = a;
		System.out.println(a);
		System.out.println(b);
		
		int num0 = 10;
		int num1 = 20;
		int num2 = 0;
		num2 = num0;
		num0 = num1;
		num1 = num2;
		System.out.println(num0);
		System.out.println(num1);
	}
}
