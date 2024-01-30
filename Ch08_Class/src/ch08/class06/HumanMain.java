package ch08.class06;

public class HumanMain {
	public static void viewInfo(Human human) {
		System.out.println("이름: " + human.getName());
		System.out.println("나이: " + human.getAge());
		System.out.println("학점: " + human.getScore());
	}
	public static void main(String[] args) {
		Human human = new Human();
//		human.name = "안슬기";
//		human.age = 28;
//		human.score = 4.5;
		human.setName("안슬기");
		human.setAge(28);
		human.setScore(4.5);
		viewInfo(human);
		
		human.setAge(-20);
		human.setScore(-1.5);
		viewInfo(human); // 음수일 경우 return 당해서 위에 28, 4.5가 데이터값이 나옴
	}
}
