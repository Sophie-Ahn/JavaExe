package ch10.collection01.ch15.sec05.exam3;

public class Person implements Comparable<Person>{
    public String name;
    public int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // int를 이용
//    @Override
//    public int compareTo(Person o) {
//        if(age < o.age) return -1; // 부호만 반대로 하면 역정렬이 되버림
//        else if (age == o.age) return 0;
//        else return 1;
//    }
    
    // 문자열을 이용
//    @Override
//    public int compareTo(Person o) {
//        if(name.hashCode() < o.name.hashCode()) return -1; // hashcode는 문자열의 길이도 같이 봐주기 때문에 정확한 비교는 안됨
//        else if (name.hashCode() == o.name.hashCode()) return 0;
//        else return 1;
//    }
    
    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name); // hashcode보다 더 정확한 정렬
//        return name.compareTo(o.name) * -1; // 역정렬
    }
}
