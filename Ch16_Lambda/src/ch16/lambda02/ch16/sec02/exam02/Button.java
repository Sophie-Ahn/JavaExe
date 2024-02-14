package ch16.lambda02.ch16.sec02.exam02;

public class Button {
	// 정적 중첩 인터페이스
	// 정적 중첩: 내 안에 만들었다는 뜻
	@FunctionalInterface
	public static interface ClickListener{
		// 추상 메서드
		void onClick();
	}
	
	// 필드
	private ClickListener clickListener;
	
	// 메소드
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}
}
