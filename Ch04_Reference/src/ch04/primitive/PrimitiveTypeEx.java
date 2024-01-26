package ch04.primitive;

public class PrimitiveTypeEx {
	public static void main(String[] args) {
		// 아래 변수는 Stack에 생성되었다가
		// main의 영역을 벗어나면 Stack에서 사라진다.
		// 지역변수
		byte b = 10;
		char ch = 'A';
		short s = 10000;
		int i = 99999999;
		long l = 99999999999999L;
		float f = 3.14f;
		double d = 3.14;
		System.out.println(Byte.SIZE);
		System.out.println(Character.SIZE);
		System.out.println(Short.SIZE);
		System.out.println(Integer.SIZE);
		System.out.println(Long.SIZE);
		System.out.println(Float.SIZE);
		System.out.println(Double.SIZE);
	}
}
