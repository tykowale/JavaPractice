package com.practice;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tylerkowalewski on 11/27/15.
 */
public class LuhnSpec {

    @Test
    public void validNumbers() {
        assertTrue(Luhn.checkNum("49927398716"));
        assertTrue(Luhn.checkNum("1234567812345670"));
    }

    @Test
    public void invalidNumbers() {
        assertFalse(Luhn.checkNum("49927398717"));
        assertFalse(Luhn.checkNum("1234567812345678"));
    }
}
