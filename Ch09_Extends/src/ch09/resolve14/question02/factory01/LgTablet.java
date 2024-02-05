package ch09.resolve14.question02.factory01;

import ch09.resolve14.question02.ITablet;

public class LgTablet implements ITablet {
	@Override
	public void movie() throws InterruptedException {
		System.out.println("LgTablet - 선명");
		Thread.sleep((long) Math.random() * 500 + 500);
	}

	@Override
	public void music() throws InterruptedException {
		System.out.println("LgTablet - 그저그럼");
		Thread.sleep((long) Math.random() * 500 + 500);
	}

	@Override
	public void readBook() throws InterruptedException {
		System.out.println("LgTablet - 눈이 좀 아픔");
		Thread.sleep((long) Math.random() * 500 + 500);
	}	
}
