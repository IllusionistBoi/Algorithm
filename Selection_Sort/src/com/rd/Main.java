package com.rd;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // Made the array global so as to make it accessible from different function
    private static int[] array;

    /**
     * Method to print the array passed
     * @param array being printed
     */
    static void arrayPrint(int[] array) {
        // Iterating through the element of array without using indices
        for (int element : array)
            System.out.println(element);

        System.out.println();
    }

    /**
     * Method to take array input
     * from the user using scanner
     */
    static void arrayInput() {

        Scanner s = new Scanner(System.in);
        // Array input size asked from user
        System.out.println("Enter the array size: ");
        int arrayLength = s.nextInt();

        // Array initialised with that size
        array = new int[arrayLength];

        // Elements entered into the array
        System.out.println("Enter all the elements for sorting using selection sort technique:");

        for(int i = 0; i < arrayLength; i++)
            array[i] = s.nextInt();


        System.out.println("Unsorted entered array is: ");
        // function called
        arrayPrint(array);
    }


    public static void main(String[] args) {

        arrayInput();

        // To check the run time of the program
        final long startTime = System.currentTimeMillis();
        // Function Called with array passed as parameter
        array = new SelectionSort().sort(array);
        final long elapsedTime = System.currentTimeMillis() - startTime;

        System.out.println("Sorted Array is: ");
        arrayPrint(array);

        // Computation time printed
        System.out.println("Computation Time is : " + elapsedTime);

    }


}
