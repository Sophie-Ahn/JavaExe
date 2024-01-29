package ch05.array08;

import java.util.Arrays;

public class Resolve3 {
	public static void main(String[] args) {
		int[] numArr = {1, 2, 3, 4, 5};
		int[] num = new int[5];
		int cnt = 0;
		
		for (int i = numArr.length - 1; i >= 0; i--) {
			num[cnt] = numArr[i];
			cnt++;
		}
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = num[i];
		}
		System.out.println(Arrays.toString(num));
		
	}
}
