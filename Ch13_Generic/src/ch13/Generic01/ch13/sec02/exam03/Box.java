package ch13.Generic01.ch13.sec02.exam03;

public class Box<T> {
	// T는 특별하게 wapper class로 주지 않으면 Object로 저장됨
	public T content;
	
	// Box의 내용물이 같은지 비교
	public boolean compare(Box<T> other) {
		boolean result = content.equals(other.content);
		return result;
	}
}
