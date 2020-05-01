package com.rd;

import java.util.Arrays;

public class Main {

    // Made the array global so as to make it accessible from different function
    private static Double[] array;



    public static void main(String[] args) {

        long size = 5;

        // While loop to change the size of the array
        while(size < 1000) {

           // Value assignment to the array using generatorArray function
            array = new GeneratorArray((int) size).generate();
            System.out.println("Unsorted Array:");
            BogoSort.arrayPrint(array);

            // To check the run time of the program
            final long startTime = System.currentTimeMillis();
            // Function Called with array passed as parameter
            BogoSort.RandomSort(array);
            final long elapsedTime = System.currentTimeMillis() - startTime;

            System.out.println("Sorted Array is: ");
            BogoSort.arrayPrint(array);

            System.out.println("Computation Time is: " + elapsedTime + " for array size: " + size + " Is Sorted? ");
            System.out.println(BogoSort.isSorted(array));
            System.out.println(" ");

            //Used for graph in excel
            //System.out.println(elapsedTime + " " + size + " " + BogoSort.isSorted(array));

            // changes the array input
            size = (int) (size * 1.2);
        }
    }
}

