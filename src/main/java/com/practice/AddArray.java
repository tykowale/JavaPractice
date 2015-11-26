package com.practice;

/**
 * Created by tylerkowalewski on 11/25/15.
 */
public class AddArray {

    public static void main(String[] args) {
        System.out.println(sumArray(new int[] { 1,2,3,4,5 }));
        System.out.println(sumArray(new int[] { 0 }));
        System.out.println(sumArray(new int[] { -15, 0, 100 }));
    }

    public static int sumArray(int[] arr) {
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        return total;
    }
}
