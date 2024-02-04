package ch09.resolve14.resolve2;

public class TabletMain {

    public static void main(String[] args) {

        TabletTester tester = new TabletTester();

        tester.test(new Samsung());
        tester.test(new Sony());
        tester.test(new Lg());
    }
}
