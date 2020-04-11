package com.rd;

/**
 * Program written by Ronit Dahiya, 18204009
 * Knuth-Morris-pratt implemented using pseudo
 * code provided
 */

public class KMP {

    private static int comparisons;

    public static int match(String T, String P) {
        int n = T.length();
        int m = P.length();

        int[] F = failureFunction(P);
        int i = 0;
        int j = 0;
        while (i < n) {
            if (T.charAt(i) == P.charAt(j)) {
                if (j == m-1) {
                    comparisons++;
                    return i - j;
                } else {
                    i++;
                    j++;
                }
            } else {
                if (j > 0) {
                    j = F[j - 1];
                } else {
                    i++;
                }
            }
            comparisons++;
        }
        return -1;
    }

    /*
     * Implementation of failure function using psuedocode in lectures
     */
    public static int[] failureFunction(String P) {
        int[] F = new int[P.length()];
        int m = P.length();
        F[0] = 0;
        int i =1;
        int j=0;

        while(i < m) {
            if(P.charAt(i) == P.charAt(j)) {
                F[i] = j+1;
                i = i+1;
                j = j+1;
            } else if(j > 0) {
                j = F[j-1];
            } else {
                F[i] = 0;
                i = i+1;
            }
        }
        return F;
    }
}
