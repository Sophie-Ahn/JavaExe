package ch15.thread01.ch14.sec05.exam02;

public class JoinExample {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
			// join을 안 걸어주면 main이 먼저 종료가 되서 리턴당함
			sumThread.join();
		} catch(InterruptedException e) {
			
		}
		
		System.out.println("1~100 합:" + sumThread.getSum());
	}
}
