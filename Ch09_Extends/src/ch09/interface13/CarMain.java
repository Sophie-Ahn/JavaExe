package ch09.interface13;

import ch09.interface13.factory01.FordCar;
import ch09.interface13.factory01.HyundaiCar;
import ch09.interface13.factory01.ToyotaCar;
import ch09.interface13.order01.CarTester;

// 1. 시나리오
// 비트캠프는 자동차 산업을 진출하기 위해 자동률 OEM 생산주문 하기로 결정했다.
// 자동차의 specification를 각 자동차 제조사에 제공하기 위해
// 인터페이스를 사용해서 구현해야 할 기능을 메서드로 정해서 자동차 제조사에 보냈다.
// -ICar 인터페이스를 정한다.

// 2.1 자동차 제조사
// 현재, 토요타, 포드는 ICar를 상속받아서 구현 클래스를 생성한다.
// 이 구현 클래스의 메서드 기능은 각 회사의 기술력이 담겨질 것이다.
// 구현 클래스가 완성되면 Bitcamp에 보내서 테스트를 진행할 예정이다.

// 2.2 Bitcamp
// 자동자 제조사에서 구현클래스(자동차)를 만드는 동안
// Bitcamp는 이미 정해진 약속인 ICar를 토대로 CarTester클래스를 제작한다.

// 3. 자동차제조사는 모두 자동차(구현클래스)를 완성해서 납품하였다.
// Bitcamp는 Main에서 자동차 객체를 생성하고
// CarTester 객체에 주입하여 각 자동차의 테스를 진행한다.

// 4. 테스 후 최종 점수를 비교하며 제조사를 선택한다.


public class CarMain {
	public static void main(String[] args) throws InterruptedException {
		CarTester carTester = new CarTester();
		ICar[] carArr = new ICar[] {
				//ICar의 자식객체를 묶어버림
				new HyundaiCar(),
				new FordCar(),
				new ToyotaCar()		
		};
		int[] score = new int[carArr.length];
		
		for (int i = 0; i < carArr.length; i++) {
			// DI(Dependency Injection): 의존성 주입
			// Ioc(Inversion of Control): 역제어
			
			carTester.setCar(carArr[i]); // 결국 제어하는건 carArr가 제어함
			
			score[i] += carTester.onOffTest();
			System.out.printf("---OnOff 테스트 점수는 %d입니다\n", score[i]);
			score[i] += carTester.speedTest();
			System.out.printf("---Speed 테스트 점수는 %d입니다\n", score[i]);
			score[i] += carTester.footBreakTest();
			System.out.printf("---Break 테스트 점수는 %d입니다\n", score[i]);
			score[i] += carTester.driveTest();
			
			System.out.printf("===>전체 테스트 점수는 %d입니다\n", score[i]);
			System.out.println("----------------------------");
		}
		
		// 제일 큰 점수를 알려줌
		int max = score[0];
		int maxIdx = 0;
		for (int i = 1; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
				maxIdx = i;
			}
		}
		
		System.out.printf("가장 높은 점수를 받은 차는 %d번째 차이고 점수는 %d입니다.", maxIdx+1, max);
		System.out.println(carArr[maxIdx+1].getClass().getName());
	}
}
