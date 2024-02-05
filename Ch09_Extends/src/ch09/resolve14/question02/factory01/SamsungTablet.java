package ch09.resolve14.question02.factory01;

import ch09.resolve14.question02.ITablet;

public class SamsungTablet implements ITablet {

	@Override
	public void movie() throws InterruptedException {
		System.out.println("SamsungTablet - 깨끗");
		Thread.sleep((long) Math.random() * 500 + 500);
	}

	@Override
	public void music() throws InterruptedException {
		System.out.println("SamsungTablet - 적당히 들을만함");
		Thread.sleep((long) Math.random() * 500 + 500);
	}

	@Override
	public void readBook() throws InterruptedException {
		System.out.println("SamsungTablet - 눈이 덜 아픔");
		Thread.sleep((long) Math.random() * 500 + 500);
	}
}
