package ch09.resolve14.resolve1;

public class LazerPrint extends PrintInfo {

	private int amountOfToner;
	
	public LazerPrint(String modelName, String manufacturer, String kindOfInterface, int numOfPrint, int amountPaper, int amountOfToner) {
		super(modelName, manufacturer, kindOfInterface, numOfPrint, amountPaper);
		this.amountOfToner = amountOfToner;
	}
	
	public void amountOfToner() {
		System.out.println("토너 잔량: " + this.amountOfToner);
		System.out.println();
	}
	
	@Override
	public void print() {
		super.showPrinterInfo();
		amountOfToner();
	}
	
}
