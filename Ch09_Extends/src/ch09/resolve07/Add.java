package ch09.resolve07;

public class Add {
    private int a;
    private int b;

    public void setValue(int _a, int _b){
        this.a = _a;
        this.b = _b;
    }

    public int calculate(){
        int calculate = this.a + this.b;
        System.out.println(calculate);

        return calculate;
    }
}
