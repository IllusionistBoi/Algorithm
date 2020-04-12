package com.rd;

import java.util.*;

public class QuickSort {

    /**
     * Array Partitioned and passing smaller array recursively
     * then joining the sorted array returned form recursion and piviot
     *
     * @param array unsorted array passed
     * @param arr_Size array size
     * @return
     */
    public static Double[] QuickSort(Double[] array, int arr_Size) {

        // Base Case (Array Empty)
        if(arr_Size < 2)
            return array;

        // Pivot position
        int current_position = 0;
        Double temp;

        // Dividing array into parts
        for(int i = 1; i < arr_Size; i++) {
            if(array[i] <= array[0]) {
                current_position++;

                temp = array[i];
                array[i] = array[current_position];
                array[current_position] = temp;
            }
        }

        temp = array[0];

        array[0] = array[current_position];

        // Changing the pivot position with temp
        array[current_position] = temp;

        /**
         * Sorting Left array elements
         * Left position : With reference to pivot
         */
        Double[] left = QuickSort(array,current_position);

        /**
         *  Elements to the right of the pivot
         *  separated in array2
         */
        Double[] array2 = Arrays.copyOfRange(array, current_position + 1, arr_Size);

        /**
         *  Sorting Right array elements
         *  Right position : with reference to pivot
         */
        Double[] right = QuickSort(array2, arr_Size - current_position - 1);

        /**
         * Merging all the array
         * @output final sorted array
         */
        Double[] final_array = new Double[arr_Size]; //final array, to merge everything together
        for(int i = 0; i < current_position; i++)
            final_array[i] = left[i];

        final_array[current_position] = array[current_position];

        for(int i = current_position + 1; i < arr_Size; i++)
            final_array[i] = right[i - current_position - 1];

        return final_array;
    }
}