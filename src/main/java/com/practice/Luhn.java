package com.practice;

/**
 * Created by tylerkowalewski on 11/27/15.
 */
public class Luhn {

    public static void main(String[] args) {
        System.out.println(checkNum("49927398716")); // true
        System.out.println(checkNum("49927398717")); // false
        System.out.println(checkNum("1234567812345678")); // false
        System.out.println(checkNum("1234567812345670")); // true
    }

    public static boolean checkNum(String ccNum) {
        int total = 0;
        boolean alternate = false;

        for (int i = ccNum.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(ccNum.charAt(i));

            if (alternate) {
                digit *= 2;
                if (digit > 9) {
                    digit = (digit % 10) + 1;
                }
            }

            total += digit;
            alternate = !alternate;
        }

        return total % 10 == 0;
    }
}
