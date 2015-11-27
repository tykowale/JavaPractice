package com.practice;

import java.util.Random;

/**
 * Created by tylerkowalewski on 11/26/15.
 */
public class Die {
    private int numOfSides;

    public Die() {
        this(6);
    }

    public Die(int sides) {
        if (sides < 2) {
            throw new IllegalArgumentException("A die must have more than one side");
        }

        numOfSides = sides;
    }

    public int roll() {
        Random rand = new Random();
        return rand.nextInt(numOfSides) + 1;
    }

    public int getNumOfSides() {
        return numOfSides;
    }
}
