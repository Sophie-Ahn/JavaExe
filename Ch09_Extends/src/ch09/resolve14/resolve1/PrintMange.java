package ch09.resolve14.resolve1;

import java.util.Scanner;

public class PrintMange {
	private Scanner sc = new Scanner(System.in);
	
	private void choosePrint() {
		boolean isRun = true;
		while(isRun) {
			System.out.println("프린터를 선택하시오");
			System.out.println("1. 잉크타입프린트 | 2. 레이저타입프린트");
			int num = sc.nextInt();
			
			switch(num) {
				case 1:
					break;
				case 2:
					break;
				default:
					isRun = false;
			}
		}
	}
	
}
