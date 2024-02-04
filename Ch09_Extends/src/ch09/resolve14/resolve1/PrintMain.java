package ch09.resolve14.resolve1;

public class PrintMain {
	public static void main(String[] args) {
		InkjetPrint incPrint = new InkjetPrint("Inc01", "Samsung", "USB", 10, 10);
		LaserPrint laserPrint = new LaserPrint("Lazer01", "LG", "parallel port", 5, 50);

		incPrint.print();
		incPrint.print();
		laserPrint.print();
		laserPrint.print();
		laserPrint.print();
	}
}
