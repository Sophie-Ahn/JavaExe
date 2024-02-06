package ch10.collection01.ch15.sec05.exam4;

import java.util.Comparator;

/*
 * 트리정렬을 원할때
 * 인터페이스를 직접 상속 받지 않고
 * 아래처럼 별도의 클래스를 만들어서 비교 기준을 만드는 방법
 */

public class FruitComparator implements Comparator<Fruit> {
    @Override
    public int compare(Fruit o1, Fruit o2){
        if(o1.price < o2.price) return -1;
        else if (o1.price == o2.price) return 0;
        else return 1;
    }

}
