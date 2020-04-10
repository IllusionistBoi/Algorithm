package com.rd;

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

    public static void main(String[] args) {

    }
}
