package cho06.method01;

public class Resolve4 {
	public static void gugudan (int a) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(a + " * " + i + " = " + (a*i));
		}
	}
	public static void main(String[] args) {
		gugudan(3);
	}
}
