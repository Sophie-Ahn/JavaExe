package ch05.array08;

import java.util.Arrays;

public class Resolve3 {
	public static void main(String[] args) {
		int[] numArr = {100, 2, 33, 41, 15};
		int[] num = new int[5];
		int cnt = 0;

		for (int i = numArr.length - 1; i >= 0; i--) {
			num[cnt] = numArr[i];
			cnt++;
		}
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = num[i];
		}
		System.out.println(Arrays.toString(numArr));
		
		
		// 선생님풀이
		/*
		 * numArr.length/2까지 하면 앞과 뒤의 값 모두 접근
		 * 만약 numArr.length로 하면 다시 원래대로 돌아감
		 */
		for (int i = 0; i < numArr.length; i++) {
			int fIdx = i;
			int lIdx = numArr.length - 1 - i;
			int pre = numArr[fIdx];
			int suf = numArr[lIdx];
			
			numArr[fIdx] = suf;
			numArr[lIdx] = pre;
			
		}
		System.out.println(Arrays.toString(numArr));
	}
}
