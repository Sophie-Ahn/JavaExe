package ch08.class04;

/*
 * static이 아닌 일반 메서드는 객체를 만들어서 호출 해야한다.
 * 그래서 Arith.java에서 static을 빼니까 오류가 난 것 
 */

public class ArithEx {
	public static void main(String[] args) {
		int a = 19, b = 5;
		int result = 0;
		
		// 오류난 메서드
//		result = Arith.add(a, b);
//		System.out.println(result);
//		result = Arith.sub(a, b);
//		System.out.println(result);
//		result = Arith.mul(a, b);
//		System.out.println(result);
//		result = Arith.div(a, b);
//		System.out.println(result);
		
		Arith arith = new Arith(); // static이 아닌 일반 메서드는 객체를 만들어야 오류가 안남
		
	}
}
