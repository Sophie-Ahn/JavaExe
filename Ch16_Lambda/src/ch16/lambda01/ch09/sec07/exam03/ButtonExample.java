package ch16.lambda01.ch09.sec07.exam03;


public class ButtonExample {
	public static void main(String[] args) {
		// Ok 버튼 객체 생성
		Button btnOk = new Button();
		
		// Ok 버튼 객체에 ClickListener 구현 객체 주입
		btnOk.setClickListener(new Button.ClickListener() { // static interface이기 때문에 바로 ClickListener을 불러올 수 있음
			
			@Override
			public void onClick() {
				System.out.println("Ok 버튼을 클릭했습니다");
			}
		});
		
		//Ok버튼 클릭하기
		btnOk.click();
		
		// cancel 버튼 객체 생성
		Button cancel = new Button();
		
		// cancel 버튼 객체에 ClickListener 구현 객체 주입
		cancel.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("cancel 버튼을 클릭했습니다");
			}
		});
		
		// cancel버튼 클릭하기
		cancel.click();
	}
}
