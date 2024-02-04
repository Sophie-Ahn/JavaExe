package ch09.resolve14.resolve1;

public class LaserPrint extends PrintInfo {

	private int amountOfToner;

	public LaserPrint(String modelName, String manufacturer, String kindOfInterface, int amountPaper, int amountOfToner) {
		super(modelName, manufacturer, kindOfInterface, amountPaper);
		this.amountOfToner = amountOfToner;
	}

	public void amountOfToner() {
		System.out.println("토너 잔량: " + this.amountOfToner);
		System.out.println();
	}
	
	@Override
	public void print() {
		super.numOfPrint++; // 부모의 인쇄매수
		super.amountPaper--; // 부모의 남은 종이 매수
		this.amountOfToner--; // 자식의 잉크잔량수
		super.showPrinterInfo();
		amountOfToner();
	}
	
}
