package com.practice;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by tylerkowalewski on 11/27/15.
 */
public class AddArraySpec {
    int[] arr1;
    int[] arr2;

    @Before
    public void setUp() {
        arr1 = new int[] {1, 2, 3, 4, 5};
        arr2 = new int[] {-15, 0, 100};
    }

    @Test
    public void allPositiveArray() {
        assertEquals(AddArray.sumArray(arr1), 15);
    }

    @Test
    public void positiveAndNegative() {
        assertEquals(AddArray.sumArray(arr2), 85);
    }
}
