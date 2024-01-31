package ch09.extends04;

public class GrandFather {
	int handsomeScore; // private는 자식에게는 물려줄 수 있지만 접근은 못함
	
	GrandFather() {
		System.out.println("GrandFather 생성자");
	}
	
	GrandFather(int score) {
		this.handsomeScore = score;
		System.out.println("GrandFather 매개변수 생성자");
	}
	
	void handsome() {
		System.out.println("나는 멋져!");
	}
}
