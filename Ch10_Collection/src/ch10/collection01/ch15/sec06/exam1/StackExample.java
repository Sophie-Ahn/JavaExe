package ch10.collection01.ch15.sec06.exam1;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Stack 컬렉션 생성
        Stack<Coin> coinBox = new Stack<Coin>();

        // 동전 넣기
        coinBox.push(new Coin(100)); // stack에 넣는 것을 push
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));

        // 동전을 하나씩 꺼내기
        while(!coinBox.isEmpty()){
            Coin coin = coinBox.pop(); // stack에서 꺼내는 것을 pop
            System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
        }
    }
}
