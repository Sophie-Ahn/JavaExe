package ch09.resolve14.resolve1;

import java.util.Scanner;

public class PrintMange {
	private Scanner sc = new Scanner(System.in);
	
	private int choosePrint() {
		while(true) {
			System.out.println("프린터를 선택하시오");
			System.out.println("1. 잉크타입프린트 | 2. 레이저타입프린트");
			int num = sc.nextInt();
			PrintInfo printInfo = null;
			
			switch(num) {
			case 1:
//				printInfo = PrintInfo.print();
				break;
			case 2:
				break;
			default:
				
			}
		}
	}
	
}
