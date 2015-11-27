package com.practice;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tylerkowalewski on 11/27/15.
 */
public class MedianSpec {
    int[] arr;
    double[] doubleArr;

    @Test
    public void allIntegerPositives() {
        arr = new int[] {4, 8, 15, 16, 23, 42};
        assertEquals(Median.getMedian(arr), 15.5, 0.01);
    }

    @Test
    public void allDoublePositives() {
        doubleArr = new double[] {0.2, 1.1, 9.2, 7.6, 3.9};
        assertEquals(Median.getMedian(doubleArr), 3.9, 0.01);
    }

    @Test
    public void mixedDoubles() {
        doubleArr = new double[] {0.2, -1.1, 12.2, -7.6, 1.1, -12, 2.1};
        assertEquals(Median.getMedian(doubleArr), 0.2, 0.01);
    }
}
