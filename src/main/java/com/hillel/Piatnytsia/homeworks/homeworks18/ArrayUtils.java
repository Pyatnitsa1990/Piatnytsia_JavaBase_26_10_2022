package com.hillel.Piatnytsia.homeworks.homeworks18;

public class ArrayUtils {
    public static Double getAverageMatrix(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static boolean isSquareMatrix(int[][] array) {
        if (array == null || array.length == 0) {
            return false;
        }
        int rowCount = array.length;
        for (int[] ints : array) {
            if (ints.length != rowCount) {
                return false;
            }
        }
        return true;
    }
}







