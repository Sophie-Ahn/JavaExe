package ch10.collection01.ch15.sec05.exam3;

import java.util.TreeSet;

/*
 * 트리정렬을 원할때
 * 인터페이스를 직접 상속 받는 방법
 */

public class ComparableExample {
    public static void main(String[] args) {
        // TreeSet 컬렉션 생성
        TreeSet<Person> treeSet = new TreeSet<Person>();

        // 객체저장
        treeSet.add(new Person("홍길동", 45));
        treeSet.add(new Person("감자바", 25));
        treeSet.add(new Person("박지원", 31));
        treeSet.add(new Person("안슬기", 28));
        treeSet.add(new Person("추경현", 28));
        treeSet.add(new Person("미키마우스", 100));
        treeSet.add(new Person("둘리", 10));

        // 객체를 하나씩 가져오기
        for(Person person : treeSet){
            System.out.println(person.name + ":" + person.age);
        }
    }
}
