package com.practice;

/**
 * Created by tylerkowalewski on 11/26/15.
 */
public class Runner {

    public static void main(String[] args) {
        Die die = new Die(2);
        System.out.println(die.roll());
        Die secondDie = new Die();
        System.out.println(secondDie.getNumOfSides());
    }
}
