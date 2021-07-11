package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;

        while (true) {

            System.out.print("Enter a number: ");

            if (scanner.hasNextInt()) {

                int number = scanner.nextInt();

                if (number > max && max == min)
                    max = number;

                if (number <= max && min == 0)
                    min = number;

                if (number < min)
                    min = number;

                if (number > max)
                    max = number;

                scanner.nextLine();
            }

            else break;

        }

        System.out.println("Minimum value = " + min);
        System.out.println("Maximum value = " + max);

        scanner.close();
    }
}
