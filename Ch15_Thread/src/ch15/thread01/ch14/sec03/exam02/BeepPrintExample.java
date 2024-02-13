package ch15.thread01.ch14.sec03.exam02;

import java.awt.Toolkit;

//만드는 방법이 두가지가 있는데 이것은 첫번째 방법
public class BeepPrintExample {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch(Exception e) {
						
					}
				}
				
				for (int i = 0; i < 5; i++) {
					System.out.println("띵");
					try {
						Thread.sleep(500);
					}catch(Exception e) {
						
					}
				}
			}
		});
		
		thread.start();
	}
}
