package ch02.transtype05;

public class TransDataType {
	public static void main(String[] args) {
		int total = 297;
		int stNum = 4;
		double avg;
		
		System.out.println("총점은 " + total + "입니다.");
		System.out.println("총점은 " + (total / stNum) + "입니다.");
		
		avg = total / stNum;
		System.out.println("총점은 " + avg + "입니다.");
		
		// (double) total : 컴파일러에 의해 정수 total은 double로 변환
		/*
		 * 실수와 정수 연산의 결과는
		 * 실수의 표현범위 > 정수
		 * 결과값은 실수 자료형으로 나온다.
		 */
		avg = (double) total / stNum;
		System.out.println("총점은 " + avg + "입니다.");
		
		int nAvg = (int)avg; // double인 avg가 더 크기 때문에 형변환하지 않으면 오류가 나버림 
		System.out.println(nAvg);
		
		char ch = 'A';
		System.out.println((int)ch);
		System.out.println((int)'A');
		System.out.println((char)65);
	}
}
