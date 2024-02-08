package ch13.Generic01.ch13.sec01;

/*
 * T는 대명사이다
 * E, A, MY, HELLO... 모두 가능하다.
 * T는 자료형을 프로그래머가 직접 선택하라는 의미
 */

public class Box<T> {
	public T content; // 타입 파라미터로 T 사용 (상황에 따라 다르게 써도 되긴 함)
}
