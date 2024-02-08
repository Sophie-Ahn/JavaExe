package ch13.Generic01.ch13.sec02.exam02;

public class CarAgency implements Rentable<Car> {
	// Rentable이라는 인터페이스를 상속받았지만
	// Car라는 Type으로 결정함

	@Override
	public Car rent() {
		return new Car();
	}
	
}
