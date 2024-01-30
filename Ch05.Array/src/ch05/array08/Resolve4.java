package ch05.array08;

import java.util.Arrays;

public class Resolve4 {
	public static void main(String[] args) {
		int[] arr = {7, 100, 20, 4, 66, 90, 99, 1000, 55, 3, 5, 101010};

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j] < arr[j - 1]) {
					int num = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = num;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		// 선택적 정렬
		int[] numArr = new int[10000];
		// 난수로 0~100000 사이의 임의의 정수를 배열에 저장
		for (int i =0; i < numArr.length; i++) {
			double dVal = Math.random();
			numArr[i] = (int)(dVal * 100000);
		}
		for (int i = 0; i < numArr.length; i++) {
			// i번째 데이터를 선택한다.
			// i를 최소값으로 가정한다.
			int sel = numArr[i];
			int minIdx = i;
			// i다음부터 마지막까지 반복
			for (int j = i + 1; j < numArr.length; j++) {
				if(sel > numArr[j]) {
					//선택을 교체한다.
					minIdx = j;
					sel = numArr[j];
				}
			}
			
			int temp = numArr[i];
			numArr[i] = numArr[minIdx];
			numArr[minIdx] = temp;
			
		}
		
		// 버블정렬
		for (int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
