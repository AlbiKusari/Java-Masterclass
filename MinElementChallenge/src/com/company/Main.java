package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Write the length of array: ");
        int count = readInteger();
        int [] intArray = readElements(count);

        System.out.println(findMin(intArray));


    }

    public static int readInteger() {

        return scanner.nextInt();

    }

    public static int [] readElements(int count) {

        System.out.println("Enter " + count + " integer values.\r");
        int [] values = new int[count];

        for (int i = 0; i < values.length; i++)
            values[i] = scanner.nextInt();

        return values;
    }

    public static int findMin(int [] array){

        int min = array[0];

        for (int i = 1; i < array.length; i++)
            if (min > array[i])
                min = (array[i]);

        return min;
    }

}
