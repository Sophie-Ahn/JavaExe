package ch03.control06;

import java.util.Scanner;

public class SwitchEx {
	public static void main(String[] args) {
		System.out.println("1. 봄");
		System.out.println("2. 여름");
		System.out.println("3. 가을");
		System.out.println("4. 겨울");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("계절 선택: ");
		String sel = sc.next();
		switch (sel) {
		case "봄":
			System.out.println("새싹이 자라난다.");
			break;
		case "여름":
			System.out.println("새싹이 자라난다.");
			break;
		case "가을":
			System.out.println("새싹이 자라난다.");
			break;
		case"겨울":
			System.out.println("새싹이 자라난다.");
			break;
		}
		
		sc.close();
	}
}
