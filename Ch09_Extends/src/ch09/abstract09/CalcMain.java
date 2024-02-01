package ch09.abstract09;

import java.util.Scanner;

public class CalcMain {
	public static void main(String[] args) {
		Add add = new Add();
		add.setValue(20, 10);
		System.out.println(add.calculate());
		
		Sub sub = new Sub();
		sub.setValue(20, 10);
		System.out.println(sub.calculate());
		
		Mul mul = new Mul();
		mul.setValue(20, 10);
		System.out.println(mul.calculate());
		
		Div div = new Div();
		div.setValue(20, 10);
		System.out.println(div.calculate());
		
		Scanner sc = new Scanner(System.in);
		boolean isRun = true;
		
		while(isRun) {
			Calc[] calcs = new Calc[] {add, sub, mul, div};
			System.out.println("2개의 수 입력");
			System.out.print("1번: ");
			int num = sc.nextInt();
			System.out.print("2번: ");
			int num1 = sc.nextInt();
			
			System.out.print("연산 선택(0.add, 1.sub, 2.mul, 3.div, 4.exit): ");
			int sel = sc.nextInt();
			if(sel == 4) {
				System.out.println("프로그램 종료합니다.");
				isRun = false;
			} else {
				calcs[sel].setValue(num, num1);
				System.out.println("결과는: " + calcs[sel].calculate());
			}
		}
		
		sc.close();
		
	}
}
