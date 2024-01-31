package ch09.resolve07;

public class Triangle {
    private int width;
    private int height;

    public Triangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // setter
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int calculate(){
        int calculate = (width * height) / 2;
        System.out.println(calculate);
        return calculate;
    }
}
