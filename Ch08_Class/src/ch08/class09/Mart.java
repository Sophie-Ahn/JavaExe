package ch08.class09;

public class Mart {
	public int productPrice;
	public int buyerMoney;
	
	public void buy(int money, int price) {
		System.out.println("나는 마트에 가서 " + buyerMoney + "원을 주고 배 가격 " + productPrice + "를 샀다.");
	}
}
