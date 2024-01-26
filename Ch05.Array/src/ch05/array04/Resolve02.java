package ch05.array04;

public class Resolve02 {
	public static void main(String[] args) {
		String[] names = {"nameA", "nameB", "nameC", "nameD", "nameE",
				"nameF", "nameG", "nameH", "nameI", "nameJ"};
		
		for (int i = 9; i < names.length; i--) {
			if (0 <= i) {
				System.out.println(names[i]);
			}
		}
	}
}
