package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int accumulator = 0;
        int counter = 1;

        while (counter <= 10) {

            System.out.print("Enter number #" + counter + ": ");

            if (scanner.hasNextInt()){
                accumulator += scanner.nextInt();
                counter++;
            }

            else System.out.println("Invalid Number");
            
            scanner.nextLine();
        }

        System.out.println("Sum of numbers above = " + accumulator);

        scanner.close();
    }
}
