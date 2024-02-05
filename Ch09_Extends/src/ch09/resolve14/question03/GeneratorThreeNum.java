package ch09.resolve14.question03;

public class GeneratorThreeNum {
	public static int[] getRandomNum() {
		int[] numArr = new int[3];
		
		// 1번째 난수 생성
		numArr[0] = (int) (Math.random() * 10);
		
		// 2번째 난수 생성
		boolean isRun = true;
		while(isRun) {
			int rNum = (int) (Math.random() * 10);
			
			if(rNum == numArr[0]) {
				continue;
			}
			
			numArr[1] = rNum;
			isRun = false;
		}
		
		// 3번째 난수 생성
		isRun = true;
		while(isRun) {
			int rNum = (int) (Math.random() * 10);
			
			if(rNum == numArr[0] || rNum == numArr[1]) {
				continue;
			}
			
			numArr[2] = rNum;
			isRun = false;
		}
		
		return numArr;
	}
}
