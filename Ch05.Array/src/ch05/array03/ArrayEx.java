package ch05.array03;

public class ArrayEx {
	public static void main(String[] args) {
		
		
		// 배열의 초기화
				// 배열은 클래스이고 kor은 스택(stack)에 위치하여
				// 참조값(해시코드)이 들어있고
				// 실제 배열의 값들은 힙(heap) 메모리에 위치한다.
				int[] kor = {98, 99, 100};
				System.out.println("배열의 크기: " + kor.length);
				
				int[] math = {100, 68,  98, 99, 70};
				System.out.println("배열의 크기: " + math.length);
				
				int[] eng = new int[] {100, 20, 60, 70};
				System.out.println("배열의 크기: " + eng.length);
				
				for(int i = 0; i < kor.length; i++) {
					System.out.println(kor[i] + " ");
				}
				for(int i = 0; i < math.length; i++) {
					System.out.println(math[i] + " ");
				}
				for(int i = 0; i < eng.length; i++) {
					System.out.println(eng[i] + " ");
				}
	}
}
