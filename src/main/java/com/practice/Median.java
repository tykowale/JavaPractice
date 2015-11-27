package com.practice;

import java.util.Arrays;

/**
 * Created by tylerkowalewski on 11/26/15.
 */
public class Median {

    public static void main(String[] args) {
        System.out.println(getMedian(new int[]{12, 4, 3, 93, 124, 2}));
        System.out.println(getMedian(new int[]{4, 8, 15, 16, 23, 42}));
        System.out.println(getMedian(new double[]{-1, 4.5, 2.2, 0}));
    }

    public static double getMedian(int[] arr) {
        double median[] = new double[arr.length];
        // convert int to double
        for (int i = 0; i < arr.length; i++) {
            median[i] = arr[i];
        }

        return getMedian(median);
    }

    public static double getMedian(double[] arr) {
        Arrays.sort(arr);
        int middle = arr.length / 2;

        if (arr.length % 2 != 0) {
            return arr[middle];
        }

        return (arr[middle] + arr[middle - 1]) / 2;
    }
}
