package ch02.variable01;

public class DataType {
	public static void main(String[] args) {
		// 자료형 변수공간이름 = 값
		int num = 100;
		double dnum = 3.14;
		char ch = 'a'; // 문자 한 글자만
		String name = "안슬기";
		boolean isRun = true;
		String str = "a"; // 한 글자 이상으로 처리
		
		System.out.println(num);
		num = 99;
		System.out.println(num);
		System.out.println(dnum);
		System.out.println(ch);
		System.out.println(name);
		System.out.println(isRun);
		System.out.println(str);		
	}
}
