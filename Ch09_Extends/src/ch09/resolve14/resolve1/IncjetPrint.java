package ch09.resolve14.resolve1;

public class IncjetPrint extends PrintInfo {
	private int amountOfInc; // 잉크잔량
	
	public IncjetPrint(String modelName, String manufacturer, String kindOfInterface, int numOfPrint, int amountPaper, int amountOfInc) {
		super(modelName, manufacturer, kindOfInterface, numOfPrint, amountPaper);
		this.amountOfInc = amountOfInc;
	}
	
	public void amountOfInc() {
		System.out.println("잉크 잔량: " + this.amountOfInc);
		System.out.println();
	}
	
	@Override
	public void print() {
		super.showPrinterInfo();
		amountOfInc();
		
	}

}
