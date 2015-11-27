package com.practice;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tylerkowalewski on 11/27/15.
 */
public class DieSpec {
    Die defaultDie;
    Die customDie;

    @Before
    public void setUp() {
        defaultDie = new Die();
        customDie = new Die(12);
    }

    @Test
    public void correctNumberOfSides() {
        assertEquals(defaultDie.getNumOfSides(), 6);
        assertEquals(customDie.getNumOfSides(), 12);
    }

    @Test
    public void correctRoll() {
        int defaultResult;
        int customResult;
        for (int i = 0; i < 10000; i++) {
            defaultResult = defaultDie.roll();
            customResult = customDie.roll();

            if (defaultResult > defaultDie.getNumOfSides() || defaultResult < 1) {
                fail("Die roll out of range");
            }

            if (customResult > customDie.getNumOfSides() || customResult < 1) {
                fail("Die roll out of range");
            }
        }
    }
}
