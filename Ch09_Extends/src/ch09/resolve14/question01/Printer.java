package ch09.resolve14.question01;

public abstract class Printer {
	protected String modelName;
	protected String manufacturer;
	protected P_INTERFACE pInterface;
	protected int printCount;
	protected int paperRemain;
	
	public  Printer(String modelName, String manufacturer, P_INTERFACE pInterface, int printCount, int paperRemain) {
		this.modelName = modelName;
		this.manufacturer = manufacturer;
		this.pInterface = pInterface;
		this.printCount = printCount;
		this.paperRemain = paperRemain;
	}
	
	public void print() {
		this.paperRemain--;
	}
}
