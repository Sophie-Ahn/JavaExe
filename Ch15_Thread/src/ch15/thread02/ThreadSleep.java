package ch15.thread02;

public class ThreadSleep {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				int sum = 0;
				for(int i = 0; i < 10; i++) {
					sum += i;
					System.out.println("누적 합은" + sum);
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("총합은" + sum);
				Thread workThread = Thread.currentThread();
				System.out.println(workThread.getName() + " 종료");
			}
		});
		t1.start();
		
		// workThread가 끝날 때까지 mainThread가 기다려야할때
		// 간단하게 sleep을 줄 수 있지만
		// 예측할 수 있는 시간대에서만 써야해서 힘듬
		try {
			Thread.sleep(1100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Thread mainThread = Thread.currentThread(); 
		System.out.println(mainThread.getName() + " 종료");
	}
}
