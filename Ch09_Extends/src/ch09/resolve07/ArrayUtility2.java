package ch09.resolve07;

import java.util.Arrays;

public class ArrayUtility2 {
    public static int[] concat(int[] s1, int[] s2) {
        int[] newArr = new int[s1.length + s2.length];

        for (int i = 0; i < s1.length; i++){
            newArr[i] = s1[i];
        }
        for (int i = 0; i < s2.length; i++){
            newArr[s1.length + i] = s2[i];
        }

        System.out.println(Arrays.toString(newArr));
        return newArr;

    }

    public static int[] remove(int[] s1, int[] s2) {
        // s1 과 s2 를 비교한다.
        int count = 0;
        for (int i = 0; i < s1.length; i++){
            for (int j = 0; j < s2.length; j++){
                if (s1[i] == s2[j]){
                    s1[i] -= s2[j];
                    count++;
                }
            }
        }
        int[] newArr = new int[s1.length - count];
        for (int i = 0, j = 0; i < s1.length; i++) {
            if (s1[i] != 0) {
                newArr[j] = s1[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArr));

        return newArr;
    }
}
