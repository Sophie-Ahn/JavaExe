package ch08.class07;

import java.util.Scanner;

public class RestaurantMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Restaurant rest = new Restaurant(sc, "새마을 식당", new String[]{"삼겹살", "소금구이", "차돌박이"});
		rest.viewMenu();
		rest.selectFood();
		rest.deliveryFood();
		
		Restaurant rest1 = new Restaurant(sc, "낙원타코", new String[]{"새우타코", "돼지타코", "소고기타코"});
		rest1.viewMenu();
		rest1.selectFood();
		rest1.deliveryFood();
		
		Restaurant rest2 = new Restaurant(sc, "참새집", new String[]{"닭발", "소주", "맥주"});
		rest2.viewMenu();
		rest2.selectFood();
		rest2.deliveryFood();
	}
}
