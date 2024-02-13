package ch15.thread01.ch14.sec03.exam03;

import java.awt.Toolkit;

// 만드는 방법이 두가지가 있는데 이것은 두번째 방법
public class BeepPrintExample {
	public static void main(String[] args) {
		// main 스레드가 해야할 일
		// main스레드(주인아저씨)가 work스레드 (알바생)을 고용한다.
		Thread thread = new Thread() {			
			// 알바생이 해야할일
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						
					}
				}
			}
		};
		
		// worker스레드(알바생) 일 시작하기
		thread.start();
		
		// 주인아저씨가 할일
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try{
				Thread.sleep(500);
			} catch(Exception e) {
				
			}
		}
	}
}
