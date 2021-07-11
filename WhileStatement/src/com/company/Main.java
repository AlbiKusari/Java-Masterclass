package com.company;

public class Main {

    public static void main(String[] args) {

        int count = 1;

        while (count != 6){
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println();

        count = 1;

        while (true) {

            if (count == 6)
                break;

            System.out.println("Count value is " + count);
            count++;

        }

        System.out.println();

        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6);

        System.out.println();

        int number = 4;
        int finishNumber = 20;
        int evenCounter = 0;
        int evenAccumulator = 0;

        while (number <= finishNumber) {

            number++;
            if (!isEvenNumber(number))
                continue;

            System.out.println("Even number = " + number);
            evenCounter++;
            evenAccumulator+= number;

            if (evenCounter == 5) break;
        }
        System.out.println("Total even numbers found: " +evenCounter);
        System.out.println("Sum of even numbers = " + evenAccumulator);

    }

    public static boolean isEvenNumber (int number) {
        return number % 2 == 0;
    }

}
