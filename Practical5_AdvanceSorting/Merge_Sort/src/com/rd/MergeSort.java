package com.rd;

public class MergeSort {

    /**
     * MergeSort Performed
     *
     * @param array       array passed for mergeSort
     * @param arrayLength length of array passed
     */
    public static void mergeSort(Double[] array, int arrayLength) {

        // Base Case
        if (arrayLength < 2)
            return;

        /**
         *  Array midpoint found and array
         *  divided into two different array
         *  left and right array
         */
        int mid = arrayLength / 2;
        Double[] leftArray = new Double[mid];
        Double[] rightArray = new Double[arrayLength - mid];

        /**
         *  Array diveded into two parts and copied into
         *  two separate arrays leftArray & rightArray
         */
        int k = 0;

        for (int i = 0; i < arrayLength; ++i) {

            if (i < mid)
                leftArray[i] = array[i];

            else {
                rightArray[k] = array[i];
                k = k + 1;
            }
        }


        /**
         * mergeSort Function is called recursively to again divede
         * the right and left array into sub array until all subarray
         * length becomes 1
         */
        mergeSort(leftArray, mid);
        mergeSort(rightArray, arrayLength - mid);

        /**
         * Merge method called on each and
         * every subdivision made
         */
        merge(leftArray, rightArray, array, mid, arrayLength - mid);
    }


    public static void merge(Double[] leftArray, Double[] rightArray, Double[] array, int leftSize, int rightSize) {

        // Random variable value assigned to avoid garbage value
        int i = 0;
        int l = 0;
        int r = 0;

        /**
         * Conditions that check merging conditions
         */
        while (r < rightSize && l < leftSize) {
            if (leftArray[l] > rightArray[r])
                array[i++] = rightArray[r++];
            else
                array[i++] = leftArray[l++];
        }

        while (r < rightSize)
            array[i++] = rightArray[r++];

        while (l < leftSize)
            array[i++] = leftArray[l++];
    }
}