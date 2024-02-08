package ch13.Generic01.ch13.sec02.exam02;

public class HomeAgency implements Rentable<Home> {
	// Rentable이라는 인터페이스를 상속받았지만
	// Home이라는 Type을 줌
	
	@Override
	public Home rent() {
		return new Home();
	}
}
