package com.rd;

class SelectionSort {

    /**
     * Method to sort the array using selection sort
     *
     * @param arr takes unsorted array as input
     * @return the sorted array
     */
    public Double[] sort(Double arr[]) {

        int n = arr.length;

        // finding and storing minimum element in min_index
        for (int i = 0; i < n - 1; i++) {
            // iterating and swapping in array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            //swap arr[i] & arr[min_index] min. element with first element
            Double temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}




