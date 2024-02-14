package ch16.lambda02.ch16.sec03;

public class Person {
	public void action1(Workable workable) { // 매개변수를 통해 람다식을 전달 받을 수 있게 해놓음
		workable.work("홍길동", "프로그래밍");
	}
	
	public void action2(Speakable speakable) { // 매개변수를 통해 람다식을 전달 받을 수 있게 해놓음
		speakable.speak("안녕하세요");
	}
}
