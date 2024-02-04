package ch09.resolve14.resolve3;

import java.util.Arrays;

public class GeneratorThreeNum {
    public static int[] generatorNum() {
        int[] threeNum = new int[3];

        // 1번정하기
        threeNum[0] = (int) (Math.random() * 10);

        // 2번정하기
        threeNum[1] = (int) (Math.random() * 10);

        // 1번과 2번 숫자는 달라야함
        boolean isRun = true;
        while(isRun) {
            if (threeNum[0] == threeNum[1]) {
                threeNum[1] = (int) (Math.random() * 10);
            } else {
                isRun = false;
            }
        }
        // 3번정하기
        threeNum[2] = (int) (Math.random() * 10);

        // 1번과 2번과 3번 숫자 달라야함
        isRun = true;
        while(isRun) {
            if (threeNum[0] == threeNum[2] || threeNum[1] == threeNum[2]) {
                threeNum[2] = (int) (Math.random() * 10);
            } else {
                isRun = false;
            }
        }
        System.out.println(Arrays.toString(threeNum));

        return threeNum;
    }
}
