package ch05.array04;

public class Resolve04 {
	public static void main(String[] args) {
		int[] score = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] store = new int[3];
		int count = 0;
		
		for (int i = 0; i < score.length; i++) {
			if (score[i] % 3 == 0) {
				store[count] = score[i];
				count++;
			}
		}
		
		for (int i = 2; i < 3; i--) {
			if (0 <= i) {				
				System.out.println(store[i]);
			}
		}
		
		
	
	}
}
