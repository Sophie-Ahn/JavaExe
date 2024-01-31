package ch08.class09;

import java.util.Scanner;

public class Chinese {
    public Scanner sc;
    private String[] menu = {"0.짜장면", "1.간짜장", "2.쟁반짜장", "3.삼선짜장", "4.불짜장"};

    public void viewMenu() {
        for(int i = 0; i < menu.length; i++) {
            System.out.println(menu[i]);
        }
    }

    public int chooseMenu(Scanner sc) {
        System.out.print("메뉴선택");
        int chooseMenu = sc.nextInt();

        switch(chooseMenu){
            case 0:
                System.out.println(menu[0] + " 나왔습니다~");
                break;
            case 1:
                System.out.println(menu[1] + " 나왔습니다~");
                break;
            case 2:
                System.out.println(menu[2] + " 나왔습니다~");
                break;
            case 3:
                System.out.println(menu[3] + " 나왔습니다~");
                break;
            case 4:
                System.out.println(menu[4] + " 나왔습니다~");
                break;
            default:
                System.out.println("간짜장먹어 구냥");
        }
        
        return chooseMenu;
    }

}
