package com.company;

public class Main {

    public static void main(String[] args) {

        int counter = 0;
        int accumulator = 0;

        for (int i = 1; i <= 1000; i++)

            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("Found number = " + i);
                accumulator+= i;
                counter++;

                if (counter == 5){
                    System.out.println("Sum of the numbers above = " + accumulator);
                    break;
                }
            }

    }
}
