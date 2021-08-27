package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {

        int [] array1 = {1 , 2 , 3 , 4 , 5};
        reverse(array1);
        int [] array2 = {1 , 3 , 5 , 6 , 7 , 8};
        reverse(array2);

    }

    public static void reverse(int [] array) {

        System.out.print("Array: ");
        for (int i : array)
            System.out.print(i + " ");
        System.out.println();

        int temp;
        int count = 0;

        for (int i = array.length-1; i >= array.length/2 ; i--){
            temp = array[count];
            array[count] = array[i];
            array[i] = temp;
            count++;
        }
        System.out.print("Reversed array: ");
        for (int i : array)
            System.out.print(i + " ");
        System.out.println("\n");

            }
        }

