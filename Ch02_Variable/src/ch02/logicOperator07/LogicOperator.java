package ch02.logicOperator07;

public class LogicOperator {
	public static void main(String[] args) {
		boolean logic;
		
		// And 연산
		logic = true && true;
		System.out.println(logic); // true
		logic = true && false;
		System.out.println(logic); // false
		
		// Or 연산
		logic = true || true;
		System.out.println(logic); // true
		logic = true || false;
		System.out.println(logic); // true
		
		// Xor 연산 (암호화기나 인공지능에 쓰이는 연산)
		logic = true ^ true;
		System.out.println(logic); // false
		logic = true ^ false;
		System.out.println(logic); // true
		
		// Not 연산
		logic = !false;
		System.out.println(logic); // true
		logic = !true;
		System.out.println(logic); // false
	}
}
