package ch16.lambda01.ch09.sec07.exam03;

public class Button {
	// 정적 멤버 인터페이스
	public static interface ClickListener{
		// 추상메서드
		void onClick();
	}
	
	// 필드
	private ClickListener cliickListener;
	
	// 메서드
	public void setClickListener(ClickListener clickListener) {
		this.cliickListener = clickListener;
	}
	
	public void click() {
		this.cliickListener.onClick();
	}
}
