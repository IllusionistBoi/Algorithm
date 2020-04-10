package com.rd;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;



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
            System.out.print(element + ", ");

        System.out.println();
    }

    /**
     * Method to take array input
     * from the user using scanner
     */

    public static void main(String[] args) {

        // To check the run time of the program
        final long startTime = System.currentTimeMillis();
        // Function Called with array passed as parameter
        array = new InsertionSort().sort(array);
        final long elapsedTime = System.currentTimeMillis() - startTime;

        System.out.println("Sorted Array is: ");
        arrayPrint(array);

        // Computation time printed
        System.out.println("Computation Time is : " + elapsedTime);


    }
}
