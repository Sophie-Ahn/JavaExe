package ch05.array08;

import java.util.Arrays;

public class Resolve4 {
	public static void main(String[] args) {
		int[] numArr = {7, 100, 20, 4, 66};
		int num = numArr[0];
		int[] arr = new int[5];
		
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr.length; j++) {
				if (arr[i] < numArr[j]) {
					num = numArr[j];
				}
			}						
			arr[i] = num;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
