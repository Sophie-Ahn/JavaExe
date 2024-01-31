package ch09.extends03;

public class Father extends GrandFather {
	long money = 10000000000000000L;
	
	Father() {
		System.out.println("Father 생성");
	}
	
	void wealth() {
		System.out.println("돈을 많이 버셨다");
	}
}
