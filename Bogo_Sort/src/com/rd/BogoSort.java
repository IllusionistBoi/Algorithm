package com.rd;

public class BogoSort {

    /**
     * Method to shuffle random indexes of given array
     *
     * @param arr array to be shuffled
     */
    public static Double[] shuffle(Double[] arr) {

        /* Takes two random index and assigns it to index 1 and 2 respectively. */
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
