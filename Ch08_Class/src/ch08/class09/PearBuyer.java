package ch08.class09;

public class PearBuyer {
	private int money;
	
	public PearBuyer(int money) {
		this.money = money;
	}
	
	public void buyPear(Mart mart, int productPrice) {
		System.out.println("나는 마트에 가서 " + money + "를 주고 배 가격 " + mart.sellPear(productPrice) + "를 샀다");
	}
}
