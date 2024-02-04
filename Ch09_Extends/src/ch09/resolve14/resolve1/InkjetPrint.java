package ch09.resolve14.resolve1;

public class InkjetPrint extends PrintInfo {
	private int amountOfInk; // 잉크잔량
	
	public InkjetPrint(String modelName, String manufacturer, String kindOfInterface, int amountPaper,
					   int amountOfInk) {
		super(modelName, manufacturer, kindOfInterface, amountPaper);
		this.amountOfInk = amountOfInk;
	}
	
	public void amountOfInc() {
		System.out.println("잉크 잔량: " + this.amountOfInk);
		System.out.println();
	}
	
	@Override
	public void print() {
		super.numOfPrint++; // 부모의 인쇄매수
		super.amountPaper--; // 부모의 남은 종이 매수
		this.amountOfInk--; // 자식의 잉크잔량수
		super.showPrinterInfo();
		amountOfInc();
	}

}
