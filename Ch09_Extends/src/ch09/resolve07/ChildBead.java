package ch09.resolve07;

/*
 * 클래스 설계에서 접근권한 설정
 * 1) 필드 -> private
 * 	  메서드 -> public
 * 2) 메서드 중에 내부에서만 사용하는 메서드 -> private
 */

public class ChildBead {
    private int amount;
    private String name;

    public ChildBead(String name, int amount) {
        this.amount = amount;
        this.name = name;
    }

    public void win(ChildBead loserName, int amount) {
        this.amount += amount;
        loserName.amount -= amount;
    }

    public void printBead() {
        System.out.println(this.name + "의 구슬 갯수: " + this.amount + "개");
    }
}
