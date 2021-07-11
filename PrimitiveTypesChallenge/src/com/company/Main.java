package com.company;

public class Main {

    public static void main(String[] args) {

        byte byteNumber = 10;
        short shortNumber = 20;
        int intNumber = 50;

        long longTotal = 50000L + 10L * (byteNumber + shortNumber + intNumber);
        System.out.println(longTotal);

        short shortTotal = (short) (1000 + 10 * (byteNumber + shortNumber + intNumber) );

    }
}
