package ch08.class08;

/*
 * <class와 class간의 상호작용>
 * 클래스: 설계도
 * 객체: 설계도로 만들어진 실체(object, instance)
 * */

public class FruitMain {
	public static void main(String[] args) {
		FruitSeller seller = new FruitSeller(20);
		FruitBuyer buyer = new FruitBuyer(10000);
		
		seller.showSaleResult();
		buyer.showBuyResult();
		
		buyer.buyApple(seller, 2000);
		
		seller.showSaleResult();
		buyer.showBuyResult();
		
		buyer.buyApple(seller, 7000);
		
		seller.showSaleResult();
		buyer.showBuyResult();
	}
}
