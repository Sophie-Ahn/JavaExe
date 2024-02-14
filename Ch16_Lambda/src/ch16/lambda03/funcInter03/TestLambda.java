package ch16.lambda03.funcInter03;

@FunctionalInterface
interface PrintString {
	void showString (String str);
}

public class TestLambda {
	public static void main(String[] args) {
		PrintString reStr = returnString();
		reStr.showString("Hello");
	}
	
	public static PrintString returnString() {
		// 파라미터가 1개짜리의 익명객체를 만들어서 리턴하는 람다식 방식
		return s -> System.out.println(s + "world");
	}
}
