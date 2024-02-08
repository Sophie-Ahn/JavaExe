package ch13.Generic01.ch13.sec03.exam01;

/*
 * T는 입력되는 DataType을 가리키는 대명사
 */

public class Box<T> {
	// 필드
	private T t; // t가 인티저로 변함
	
	// Getter 메소드
	public T get() {
		return t;
	}
	
	// Setter 메소드
	public void set(T t) {
		this.t = t;
	}
}
