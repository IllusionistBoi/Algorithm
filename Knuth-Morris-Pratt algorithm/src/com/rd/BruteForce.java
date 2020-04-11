package com.rd;

/**
 * Program written by Ronit Dahiya, 18204009
 * Brute Force implemented
 */

public class BruteForce {

    private static int comparisons;

    public static int match(String T, String P) {
        int i = 0;
        int n = T.length();
        int m = P.length();

        while (i <= n-m) {
            int j = 0;
            while ((j < m) && (T.charAt(i+j) == P.charAt(j))) {
                comparisons++;
                System.out.println("["+comparisons+"] T["+(i+j)+"]="+T.charAt(i+j) +", P["+j+"]="+P.charAt(j));
                j++;
            }
            comparisons++;
            if (j == m) return i;
            System.out.println("["+comparisons+"] T["+(i+j)+"]="+T.charAt(i+j) +", P["+j+"]="+P.charAt(j)+ " MISMATCH");
            i++;
        }
        return -1;
    }

    /*
     * Implementation of matchTwo function using offset
     */
    public static void matchTwo(String T, String P, int offset) {

        int n = T.length();
        int m = P.length();
        while (offset <= n-m) {
            int j = 0;
            while ((j < m) && (T.charAt(offset +j) == P.charAt(j))) {
                comparisons++;
                j++;
            }
            comparisons++;
            if (j == m)
                System.out.println("index : " + offset);
            offset++;
        }

    }


}