package ch08.class06;

/*
 * 클래스로 묶은 변수를 쉽게 접근 허용하는 것은
 * 프로그래밍의 오류를 가져오게 되는 중대한 원인이 된다는 사실을
 * 경험적으로 알게 됨.
 * 
 * 그래서 클래스 내부에서만 사용한다는 개념(private)과
 * 밖에서도 접근한다는 개념(public)이 등장하게 되었다.
 */

public class Human {
	// private는 이제 내부가 아닌 외부에서 직접적으로 접근하는 것이 불가하게 됨.
	private String name;
	private int age;
	private double score;
	
	// setter
	public void setName(String _name) {
		name = _name;
	}
	public void setAge(int _age) {
		if(_age < 0) {
			return; // void가 있음으로써 중간에 끝내버린다는 뜻 (이 함수를 끝내버려라)
		}
		age = _age;
	}
	public void setScore(double _score) {
		if(_score < 0) {
			return;
		}
		score = _score;
	}
	
	// getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getScore() {
		return score;
	}
}