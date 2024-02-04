package ch09.resolve14.resolve2;

public class Samsung implements ITablet{

    @Override
    public void movie() {
        System.out.println("삼성무비가 잘 켜진다!");
    }

    @Override
    public void music() {
        System.out.println("삼성뮤직이 잘 켜진다!");
    }

    @Override
    public void readBook() {
        System.out.println("삼성리드북이 잘 켜진다!");
    }
}
