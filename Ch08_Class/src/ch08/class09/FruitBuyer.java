package ch08.class09;

public class FruitBuyer {
private int money;
private int numOfApple;
final int APPLE_PRICE = 1000; // 사과가격 (final 상수)

public FruitBuyer(int money) {
	this.money = money;
	this.numOfApple = 0;
}

public int buyApple(int money) {
	int num = money / this.APPLE_PRICE;
	this.numOfApple += num;
	this.money -= money;
	return num;
}

public void showBuyResult() {
	System.out.println("*** 과일 구매자의 현재 상황 ***");
	System.out.println("현재 잔액: " + this.money);
	System.out.println("사과 개수: " + this.numOfApple);
	System.out.println();
}
}
