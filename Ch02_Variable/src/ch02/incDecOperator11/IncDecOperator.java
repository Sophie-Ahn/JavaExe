package ch02.incDecOperator11;

public class IncDecOperator {
	public static void main(String[] args) {
		int num = 0;
		// num++, ++num은 모두 1씩 증가시키는 것
		num++;
		System.out.println(num);
		++num;
		System.out.println(num);
		
		// result에 num의 값을 먼저 대입한 후 num 1이 증가
		int result = num++;
		System.out.println("result = " + result);
		System.out.println("num = " + num);
		
		// 먼저 1이 증가하고 result에 값을 대입
		result = ++num;
		System.out.println("result = " + result);
		System.out.println("num = " + num);
		
		System.out.println("num = " + num--);
		System.out.println("num = " + --num);
	}
}
