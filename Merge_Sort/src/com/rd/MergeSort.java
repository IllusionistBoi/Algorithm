package com.rd;

public class MergeSort {

    static void mergeSort(int[] a) {

        N = array.length;
        //base case
        if (n == 1) {
            return array;
        }

        //create left and right sub-arrays
        left = mergeSort(left);
        right = mergeSort(right);

        mergeArray = merge(left, right);

        return mergedArray;
    }

    static void merge(int[] a, int[] b) {

        //repeat while both arrays have elements in them

        while (a.notEmpty() && b.notEmpty()) {

            //if element in 1st array is <= 1st element in 2nd array
            if (a.firstElement <= b.firstElement) {
                S.insertLast(a.removeFirst());
            } else if (b.firstElement <= a.firstElement) {
                S.insertLast(b.removeFirst());
            }

            //when while loop ends
            If(a.notEmpty()) {
                //add remaining elements in a to S
            } else if (b.notEmpty()) {
                //add remaining elements in b to S
            }

            return S;
        }
    }
}

