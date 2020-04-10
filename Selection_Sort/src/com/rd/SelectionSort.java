package com.rd;

class SelectionSort {

    /**
     * Method to sort the array using selection sort
     * @param arr takes unsorted array as input
     * @return the sorted array
     */
    public Double[] sort (Double arr[]){
        Double temp;
        int n;
        n = arr.length;

        for (int i = 0; i < n -1; i++){
            int min_index = i;
            // iterating and swapping in array
            for (int j = i + 1; j < n; j++) {
                if (arr[min_index] > arr[j]) {
                    min_index = j;
                }

                //swap arr[i] & arr[min_index]
                temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;
            }
        }
        return arr;
    }
}
