package com.hillel.Piatnytsia.homeworks.homework18;

import com.hillel.Piatnytsia.homeworks.homeworks18.ArrayUtils;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestArrayUtils {

   @Test
    public void checkAverageSum(){
       int[] arr1 = {2, 4, 7, 8, 4};//ціле
       int[] arr2 = {2, 4, 2, 2};//раціональне
       int[] arr3 = {2, 4, 4};//ірраціональне

       assertEquals(5, ArrayUtils.getAverageMatrix(arr1));
       assertEquals(2.5, ArrayUtils.getAverageMatrix(arr2));
       assertEquals(3.3333333333333335, ArrayUtils.getAverageMatrix(arr3));
   }

    @Test
    public void checkNullOrEmptyArray(){
        assertNull(ArrayUtils.getAverageMatrix(new int[]{}));
        assertNull(ArrayUtils.getAverageMatrix(null));
    }

    @Test
    public void checkSquareArray(){
        int[][] arr1 = {{0, 0}, {0, 0}};
        int[][] arr2 = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

        assertTrue(ArrayUtils.isSquareMatrix(arr1));
        assertTrue(ArrayUtils.isSquareMatrix(arr2));
    }

    @Test
    public void checkNullAndEmptySquareArray(){
        assertFalse(ArrayUtils.isSquareMatrix(new int[][]{}));
        assertFalse(ArrayUtils.isSquareMatrix(null));
    }
}
