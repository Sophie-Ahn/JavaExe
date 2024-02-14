package ch15.thread01.ch14.sec04;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread(); // 현재 스레드 (메인스레드)
		System.out.println(mainThread.getName() + "실행");
		
		for(int i = 0; i < 3; i++) {
			Thread threadA = new Thread() {
				@Override
				public void run() {
					System.out.println(getName() + "실행");
				}
			};
			threadA.start(); // 스레드에 기본 이름이 있음
		}
		
		Thread chatThread = new Thread() {
			@Override
			public void run() {
				System.out.println(getName() + "실행");
			}
		};
		chatThread.setName("chat-thread"); // 스레드이름을 우리가 직접 부여할 수 있음
		chatThread.start();
	}
}
