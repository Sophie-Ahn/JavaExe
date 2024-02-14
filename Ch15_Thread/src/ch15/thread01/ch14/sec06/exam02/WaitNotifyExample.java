package ch15.thread01.ch14.sec06.exam02;

/* 순서를 맞춰주는 동기화 기법
 * 2개의 스레드가 순서대로 1번씩 처리하는 동기화
 * 
 * thread 배분과 시간이 정확하지 않음
 */

public class WaitNotifyExample {
	public static void main(String[] args) {
		WorkObject workObject = new WorkObject();
		
		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);
		
		// threadA가 먼저 스타트를 했다고 해서 A가 먼저 run 되지 않음
		// 하지만 확률상 A가 먼저 실행될 가능성이 큼
		threadA.start();
		threadB.start();
	}
}
