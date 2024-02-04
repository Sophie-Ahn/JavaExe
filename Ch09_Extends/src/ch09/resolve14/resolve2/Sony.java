package ch09.resolve14.resolve2;

public class Sony implements ITablet {
    @Override
    public void movie() {
        System.out.println("소니무비가 잘 켜진다!");
    }

    @Override
    public void music() {
        System.out.println("소니뮤직이 잘 켜진다!");
    }

    @Override
    public void readBook() {
        System.out.println("소니리드북이 잘 켜진다!");
    }
}
