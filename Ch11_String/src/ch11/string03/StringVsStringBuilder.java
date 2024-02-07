package ch11.string03;

public class StringVsStringBuilder {
	public static long getStringSpeed() {
		String str = "";
		long start = System.nanoTime();
		for(int i = 0; i < 26; i++) {
			str += (char)('a' + i);
		
		}
		long end = System.nanoTime();
		System.out.println("String: " + str);
		
		return end-start;
	}
	public static long getStringBuilderSpped() {
		StringBuilder strBuilder = new StringBuilder(26);
		long start = System.nanoTime();
		for(int i = 0; i < 26; i++) {
			strBuilder.append((char)('a' + i));
		}
		long end = System.nanoTime();
		System.out.println("strBuilder: " + strBuilder.toString());
		
		return end-start;
	}
	public static void main(String[] args) {
		long strMillis = getStringSpeed();
		long strBuilderMillis = getStringBuilderSpped();
		System.out.println("String 시간 = " + strMillis);
		System.out.println("StringBuilder 시간 = " + strBuilderMillis);
	}
}
