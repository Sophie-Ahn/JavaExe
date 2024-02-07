package ch10.collection01.ch15.sec06.exam2;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Queue는 시뮬레이터나 통신에 많이 쓰임
 * */

public class QueueExample {
    public static void main(String[] args) {
        // Queue 컬렉션 생성
        Queue<Message> messagesQueue = new LinkedList<>();

        // 메시지 넣기
        messagesQueue.offer(new Message("sendMail", "홍길동"));
        messagesQueue.offer(new Message("sendSMS", "신용권"));
        messagesQueue.offer(new Message("sendKakaotalk", "감자바"));

        // 메시지를 하나씩 꺼내어 처리
        while (!messagesQueue.isEmpty()) {
            Message message = messagesQueue.poll();
            switch (message.command) {
                case "sendMail":
                    System.out.println(message.to + "님에게 메일을 보냅니다.");
                    break;
                case "sendSMS":
                    System.out.println(message.to + "님에게 SMS를 보냅니다.");
                    break;
                case "sendKakaotalk":
                    System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
                    break;
            }
        }
    }
}
