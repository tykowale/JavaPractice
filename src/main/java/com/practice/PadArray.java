package com.practice;

import java.util.Arrays;

/**
 * Created by tylerkowalewski on 11/25/15.
 */
public class PadArray {

    public static void main(String[] args) {
        int[] arr = {4, 8, 15, 16, 23, 45};
        String[] arr2 = {"hello", "my", "good", "friend"};
        System.out.println(Arrays.toString(padArray(arr, 9)));
        System.out.println(Arrays.toString(padArray(arr, 3, 2)));
        System.out.println(Arrays.toString(padArray(arr2, 2, "NOOO")));
        System.out.println(Arrays.toString(padArray(arr2, 12)));
    }


    public static int[] padArray(int[] arr, int len) {
        int arrSize = arr.length > len ? arr.length : len;

        int[] dest = Arrays.copyOf(arr, arrSize);

        return dest;
    }

    public static int[] padArray(int[] arr, int len, int fill) {
        int[] dest = padArray(arr, len);

        for (int i = arr.length; i < len; i++) {
            dest[i] = fill;
        }

        return dest;
    }

    public static String[] padArray(String[] arr, int len) {
        int arrSize = arr.length > len ? arr.length : len;

        String[] dest = Arrays.copyOf(arr, arrSize);

        return dest;
    }

    public static String[] padArray(String[] arr, int len, String fill) {
        String[] dest = padArray(arr, len);

        for (int i = arr.length; i < len; i++) {
            dest[i] = fill;
        }

        return dest;
    }
}
