package com.rd;
public class InsertionSort {

    public Double[] sort (Double array[]) {
        Double key;
        int j;
        int n = array.length;

        for (int i = 1; i < n; ++i) {
            key = array[i];
            j = i -1;

            while(j >= 0 && array[j] > key) {
                array[j+1] = array[j];
                j = j-1;
                array[j+1] = key;
            }
        }
        return array;
    }
}
