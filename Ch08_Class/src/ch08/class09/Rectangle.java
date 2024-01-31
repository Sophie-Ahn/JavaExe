package ch08.class09;

public class Rectangle {
	private int x1, y1, x2, y2;
	
	public void set(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public int square() {
		int vertical = this.x2 - this.x1;
		int horizontal = this.y2 - this.y1;
		int square = vertical * horizontal;
		
		return square;
	}
	
	public void show() {
		System.out.println("x1 좌표:" + x1);
		System.out.println("y1 좌표:" + y1);
		System.out.println("x2 좌표:" + x2);
		System.out.println("y2 좌표:" + y2);
		System.out.println("사각형 넓이: " + square());
	}
}