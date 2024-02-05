package ch09.resolve14.question02.factory01;

import ch09.resolve14.question02.ITablet;

public class LenovoTablet implements ITablet {
	@Override
	public void movie() throws InterruptedException {
		System.out.println("LenovoTablet - 가성비 나쁘지 않음");
		Thread.sleep((long) Math.random() * 500 + 500);
	}

	@Override
	public void music() throws InterruptedException {
		System.out.println("LenovoTablet - 들을만한 수준");
		Thread.sleep((long) Math.random() * 500 + 500);
	}

	@Override
	public void readBook() throws InterruptedException {
		System.out.println("LenovoTablet - 눈이 안 아픔");
		Thread.sleep((long) Math.random() * 500 + 500);
	}
}
