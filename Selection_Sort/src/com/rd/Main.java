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
     * Method to check if the array is
     * sorted or not
     * @param array
     * @return boolean true if sorted else false
     */
    static boolean isSorted(Double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        long size = 10;

        // While loop to change the size of the array
        while(size < 1000) {

            // Value assignment to the array using generatorArray function
            array = new GeneratorArray((int) size).generate();
            System.out.println("Unsorted Array:");
            arrayPrint(array);


            // To check the run time of the program
            final long startTime = System.currentTimeMillis();
            // Function Called with array passed as parameter
            array = new SelectionSort().sort(array);
            final long elapsedTime = System.currentTimeMillis() - startTime;

            System.out.println("Sorted Array is: ");
            arrayPrint(array);

            System.out.println("Computation Time is: " + elapsedTime + " for array size: " + size + " Is Sorted? " + isSorted(array) );
            System.out.println(" ");

            //Used for graph in excel
            //System.out.println(elapsedTime + " " + size + " " + isSorted(array));

            // changes the array input
            size = (int) (size * 1.2);
        }
    }


}
