package ch08.class09;

public class Mart {
	// 마트가 판매
	private int productPrice;
	
	public Mart(int productPrice) {
		this.productPrice = productPrice;
	}
	
	public int sellPear(int productPrice) {
		this.productPrice += productPrice;
		
		return productPrice;
	}
}
