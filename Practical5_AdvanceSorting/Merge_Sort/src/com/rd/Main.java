package com.rd;

public class Main {

    // Made the array global so as to make it accessible from different function
    private static Double[] array;

    /**
     * Method to print the array passed
     * @param array being printed
     */
    static void arrayPrint(Double[] array) {
        // Iterating through the element of array without using indices
        for (Double element : array)
            System.out.print(element + ", ");

        System.out.println();
    }

    /**
     * Method to check if array is Sorted or not
     * @param arr array passed
     * @return boolean value
     */
    private static boolean isSorted(Double[] arr) {
        // Iterated through the array and checked if previous value is greater or not.
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {
            } else {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {


        long size = 1000;

        // While loop to change the size of the array
        while (size < 1000000000) {

            // Value assignment to the array using generatorArray function
            array = new GeneratorArray((int) size).generate();
            System.out.println("Unsorted Array:");
            arrayPrint(array);

            // To check the run time of the program
            final long startTime = System.currentTimeMillis();
            // Function Called with array passed as parameter

            //MERGE SORT ADDED CALL HERE
            MergeSort.mergeSort(array, array.length);

            final long elapsedTime = System.currentTimeMillis() - startTime;

            System.out.println("Sorted Array is: ");
            arrayPrint(array);

            System.out.println("Computation Time is: " + elapsedTime + " for array size: " + size + " Is Sorted? " + isSorted(array));
            System.out.println(" ");

            //Used for graph in excel
            //System.out.println(elapsedTime + " " + size + " " + isSorted(array));

            // changes the array input
            size = (int) (size * 1.2);
        }
    }
}
