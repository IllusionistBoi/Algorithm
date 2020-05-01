package com.rd;

public class InsertionSort {

    /**
     * Method to sort the array using InsertionSort
     *
     * @param array unsorted array is passed
     * @return sorted array is returned
     */
    public Double[] sort (Double array[]) {
        Double key;
        int j;

        // Iterated through entire array assigning key
        for (int i = 1; i < array.length; ++i) {
            key = array[i];
            j = i -1;

            // Comparing array value with key assigned
            while(j >= 0 && array[j] > key) {
                array[j+1] = array[j];
                j = j-1;
                array[j+1] = key;
            }
        }

        // Sorted array returned
        return array;
    }
}
