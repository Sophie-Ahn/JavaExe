package ch05.array08;

import java.util.Arrays;

public class Resolve1 {
	public static void main(String[] args) {
		int[] arr = {6, 5, 100, 40, 53, 98};
		int min = arr[0];
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println(min);
		System.out.println(max);
	}
}
