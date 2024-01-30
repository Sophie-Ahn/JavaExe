package ch08.class05;

public class HumanMain {
	public static void viewInfo(Human human) {
		System.out.println("이름: " + human.name);
		System.out.println("나이: " + human.age);
		System.out.println("학점: " + human.score);
	}
	public static void main(String[] args) {
		Human human = new Human();
		human.name = "안슬기";
		human.age = 28;
		human.score = 4.5;
		
		viewInfo(human);
		
		/*
		 * 중간에 많은 처리가 있었다.
		 * 그러다 age나 score값에 음수가 들어가게 됨.
		 */
		
		human.age = -10;
		human.score = - 3.5;
		
		viewInfo(human);
	}
}
