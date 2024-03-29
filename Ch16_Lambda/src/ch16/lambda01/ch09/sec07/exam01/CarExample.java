package ch16.lambda01.ch09.sec07.exam01;

public class CarExample {
	public static void main(String[] args) {
		// Car 객체 생성
		Car car = new Car();
		
		// 익명 자식 객체가 대입된 필드 사용
		car.run1();
		
		// 익명자식 객체가 대입된 로컬변수 사용
		car.run2();
		
		// 익명자식 객체가 대입된 매개변수 사용
		car.run3(new Tire() { // Tire클래스를 상속받은 자식 객체가 온 것
			@Override
			public void roll() {
				System.out.println("익명자식 Tire 객체3이굴러갑니다");
			}
		});
		
		car.tireInfo();
	}
}
