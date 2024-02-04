package ch09.resolve14.resolve3;

import java.util.Scanner;

public class BaseBallMenu {
    private Scanner sc = new Scanner(System.in);
    public int[] viewMenu() {
        int[] sel = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + "번째 숫자 입력 >> ");
            sel[i] = sc.nextInt();
        }

        return sel;
    }
}
