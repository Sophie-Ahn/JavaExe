package ch16.lambda03.funcInter01;

public class TestMyNumber {
	public static void main(String[] args) {
		/* 	람다식은 중간의 형식은 배제하고
		 * 결과에 집중하는 방식이다
		 * 아래의 max는 안터페이스의 변수이다.
		 * (x, y) -> (x >= y) ? x : y; 를 max에 전달하면
		 * 컴파일러는 자동으로 MyNumber를 상속받은 익명의 클래스를 선언하고
		 * 익명 클래스의 객체를 생성해서 max에 전달한다.
		 * 
		 * 그리고 MyNumber의 유일한 추상 메서드인 getMax의 내용을
		 * (x, y) -> (x >= y) ? x : y;로 구성해준다.
		 * 
		 * max.getMax(10,20)를 호출하면
		 * x=10, y=20이 전달하게 된다.
		 * */
		MyNumber max = (x, y) -> (x >= y) ? x : y; // 2. 여기서 자동적으로 객체가 만들어짐
		System.out.println(max.getMax(10, 20)); // 1. getMax를 썼다는건 메모리에 올라가졌다는 것
	}
}
