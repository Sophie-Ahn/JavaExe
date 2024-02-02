package ch09.resolve14.resolve1;

public abstract class PrintInfo {
	protected String modelName; // 모델명
	protected String manufacturer; // 제조사
	protected String kindOfInterface; // 인터페이스 종류
	protected int numOfPrint; // 인쇄매수
	protected int amountPaper; // 인쇄 종이 잔량
	
	public PrintInfo(String modelName, String manufacturer, String kindOfInterface, int numOfPrint, int amountPaper) {
		this.modelName = modelName;
		this.manufacturer = manufacturer;
		this.kindOfInterface = kindOfInterface;
		this.numOfPrint = numOfPrint;
		this.amountPaper = amountPaper;
	}
	
	public void showPrinterInfo() {
		System.out.println("모델명: " + this.modelName);
		System.out.println("제조사: " + this.manufacturer);
		System.out.println("인터페이스 종류: " + this.kindOfInterface);
		System.out.println("인쇄매수: " + this.numOfPrint);
		System.out.println("인쇄 종이 잔량: " + this.amountPaper);
		this.numOfPrint++;
	}
	
	public abstract void print();
}
