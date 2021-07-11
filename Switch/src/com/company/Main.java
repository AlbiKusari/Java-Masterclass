package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        /*int value = 3;

        if (value == 1)
            System.out.println("Value was 1");

        else if (value == 2)
            System.out.println("Value was 2");

        else
            System.out.println("Was no 1 or 2");*/


        int switchValue = 1;

        switch (switchValue) {

            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Value was not 1,2,3,4 or 5");
                break;
        }

        char switchLetter = 'D';

        switch (switchLetter) {

            case 'A':
                System.out.println(switchLetter + " was found");
                break;

                case 'B':
                System.out.println(switchLetter + " was found");
                break;

                case 'C': case 'D': case 'E':
                System.out.println(switchLetter + " was found");
                break;


            default:
                System.out.println("Not found");

        }

        String month = "January";

        switch (month.toLowerCase()) {

            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not sure");

        }

    }
}
