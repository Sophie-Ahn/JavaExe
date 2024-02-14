package ch17.stream01;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamReduce {
	public static void main(String[] args) {
		int[] numArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		/* 배열의 총합을 구하는 수식
		 * 2개의 입력 param -> 1개 리턴
		 * 모든 스트림 순환
		 * a = 1 b = 2 -> 3
		 * ...
		 */
		
		/* 앞의 연산의 결과가 다시 a로 입력되고
		 * 새로운 배열의 인자가 b로 입력되어
		 * 계속 반복 연산이 진행된다.
		 */
		int sum = Arrays.stream(numArr).reduce(0, (a, b) -> a + b);
		System.out.println("sum=" + sum);
		
		String[] strArr = {"안녕하세요!!", "hello", "Good morning", "반갑습니다^^"};
		String result = Arrays.stream(strArr).reduce("", (s1, s2)->{
			if(s1.getBytes().length >= s2.getBytes().length) {
				return s1;
			} else {
				return s2;
			}	
		});
		System.out.println("가장 긴 인사말은 " + result);
	}
}
