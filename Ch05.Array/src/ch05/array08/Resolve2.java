package ch05.array08;

public class Resolve2 {
	public static void main(String[] args) {
		int[] arr = {6, 5, 100, 40, 4, 98};
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
