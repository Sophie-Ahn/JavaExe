package ch09.resolve07;

public class ArrayUtility {
    public static double[] intToDouble(int[] source) {
        double[] intToDouble = new double[source.length];

        for (int i = 0; i < source.length; i++) {
            intToDouble[i] = (double) source[i];
            System.out.println(intToDouble[i]);
        }

        return intToDouble;
    }

    public static int[] doubleToInt(double[] source) {
        int[] doubleToInt = new int[source.length];

        for (int i = 0; i < source.length; i++) {
            doubleToInt[i] = (int) source[i];
            System.out.println(doubleToInt[i]);
        }

        return doubleToInt;
    }
}
