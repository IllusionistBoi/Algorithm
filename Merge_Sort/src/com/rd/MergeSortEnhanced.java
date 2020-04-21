package com.rd;

public class MergeSortEnhanced {
    /*
        // mergesort a[lo..hi] using auxiliary array aux[lo..hi]

        private static void sort(double[] a, double[] aux, int lo, int hi) {
        int n = hi - lo + 1;
        if (n <= CUTOFF) {
            insertionSort(a, lo, hi);
            show(a, lo, hi);
            return;
        }
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        merge(a, aux, lo, mid, hi);
        show(a, lo, hi);
    }

    public static void sort(double[] a) {
        double[] aux = new double[a.length];
        sort(a, aux, 0, a.length-1);
    }


    // sort from a[lo] to a[hi] using insertion sort
    private static void insertionSort(double[] a, int lo, int hi) {
        for (int i = lo; i <= hi; i++)
            for (int j = i; j > lo && less(a[j], a[j-1]); j--)
                exch(a, j, j-1);
    }

    // draw one row of trace
    private static void show(double[] a, int lo, int hi) {
        double y = numberOfRows - row - 1;
        for (int k = 0; k < a.length; k++) {
            if      (k < lo)             StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
            else if (k > hi)             StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
            else                         StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledRectangle(k, y + a[k] * 0.25, 0.25, a[k] * 0.25);
        }
        row++;
    }
     */

}
