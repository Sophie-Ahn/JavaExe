package ch09.resolve07;

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
