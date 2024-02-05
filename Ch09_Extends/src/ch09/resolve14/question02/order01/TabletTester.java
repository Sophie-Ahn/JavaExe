package ch09.resolve14.question02.order01;

import ch09.resolve14.question02.ITablet;

public class TabletTester {
	private final int TEST_NUM = 3;
	private ITablet tablet;
	
	public TabletTester(ITablet tablet) {
		/*
		 * 외부에서 주입
		 * CarTest는 ICar에 의존적이다.
		 */
		// 인자를 주입하는 생성자를 만듬
		this.tablet = tablet;
	}
	
	public TabletTester() {
		// 인자를 주입하지 않은 생성자를 만듬
	}
	
	public void setTablet(ITablet tablet) {
		this.tablet = tablet;
	}
	
	public int movieTest() throws InterruptedException {
		for (int i = 0; i < TEST_NUM; i++) {
			tablet.movie();
		}
		
		return (int) Math.random() * 50 + 50; // 50 ~ 99
	}
	public int musicTest() throws InterruptedException {
		for (int i = 0; i <TEST_NUM; i++) {
			tablet.music();			
		}
		return (int) Math.random() * 50 + 50; // 50 ~ 99
	}
	public int readBookTest() throws InterruptedException {
		for (int i = 0; i <TEST_NUM; i++) {
			tablet.readBook();
		}
		return (int) Math.random() * 50 + 50; // 50 ~ 99
	}
	public int driveTest() throws InterruptedException {
		for(int i = 0; i < TEST_NUM; i++) {
			
		}
		return (int) Math.random() * 50 + 50; // 50 ~ 99
	}
}
