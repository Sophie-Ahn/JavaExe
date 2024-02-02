package ch09.resolve14.resolve1;

public class PrintMain {
	
	public static void main(String[] args) {
		IncjetPrint incPrint = new IncjetPrint("Inc01", "Samsung", "USB", 1, 10, 10);
		LazerPrint lazerPrint = new LazerPrint("Lazer01", "LG", "paraller port", 1, 5, 50);
		
		// 
		
		
		incPrint.print();
		lazerPrint.print();
	}
}
