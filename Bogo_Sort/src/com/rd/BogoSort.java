package com.rd;

public class BogoSort {

    private static Double[] array;

    /**
     * Method to print the array passed
     *
     * @param array being printed
     */
    public static void arrayPrint(Double[] array) {
        // Iterating through the element of array without using indices
        for (Double element : array)
            System.out.print(element + ", ");

        System.out.println();
    }

    /**
     * Meethod to check if array is sorted or not
     *
     * @param a array to be sorted
     * @return boolean true/false
     */
    static boolean isSorted(Double[] a) {
        for (int i = 0; i < a.length - 1; ++i) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }


    /**
     * Method to print number of times a sorting happens.
     *
     * @param arr
     */

    public static void RandomSort(Double[] arr) {
        int counter = 0;
        if (arr.length < 2) {
            return;
        }
   //     System.out.println("We'll sort " + arr.length + " elements:");

        // Till the time element are not sorted.
        while (!isSorted(arr)) {
            BogoSort.shuffle(arr);
            counter++;
        }

        // when sorting done. we print the counter
    //    System.out.println("The Solution found! (shuffled " + counter + " these many number of times)");
   //     arrayPrint(arr);
    }

    /**
     * Method to shuffle random indexes of given array
     *
     * @param arr array to be shuffled
     */
    private static Double[] shuffle(Double[] arr) {

        // Takes two random index and assigns it to index 1 and 2 respectively. /
        for (int x = 0; x < arr.length; ++x) {
            int index1 = (int) (Math.random() * arr.length);
            int index2 = (int) (Math.random() * arr.length);

            Double a = arr[index1];

            arr[index1] = arr[index2];
            arr[index2] = a;
        }
        return arr;
    }
}
