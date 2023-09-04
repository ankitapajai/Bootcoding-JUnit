package com.bootcoding.junit.Array;

import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.*;

public class ArraySumTest {

    @Test
    public void test() {
        ArraySum arraySum = new ArraySum();
        int[] nums = {1, 2, 3, 4, 5};
        int actualSum = arraySum.getSum(nums);
        int expectedSum = 15;
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void getMaxElement() {
        ArraySum s = new ArraySum();
        int[] num = {1, 4, 6, 8};
        int max = num[0];
        System.out.println("Maximum elements in an array: ");
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println(max);
    }

    @Test
    public void evenElement(){
        ArraySum array = new ArraySum();
        int[] num1 = { 5, 10, 3, 7, 2, 8 };

        System.out.println("Even numbers in the array:");
        for (int number : num1) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
