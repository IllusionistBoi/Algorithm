package com.rd;

/**
 * Program written by Ronit Dahiya, 18204009
 * Knuth-Morris-pratt implemented using pseudo
 * code provided
 */


public class Main {

    private static int comparisons = 0;


    public static void setComparisons(int c) {
        comparisons = c;
    }

    public static void main(String[] args) {

        /**
         * KMP implemented for String T
         * using two examples
         */
        String T = "a pattern matching algorithm";
        comparisons = 0;
        System.out.println("Index: " + KMP.match(T, "rithm"));
        System.out.println("Comparisons: " + comparisons);
        System.out.println(" ");
        System.out.println(" ");

        T = "abacaabaccabacabaabb";
        comparisons = 0;
        System.out.println("Index: " + KMP.match(T, "abacab"));
        System.out.println("Comparisons: " + comparisons);
        System.out.println(" ");
        System.out.println(" ");


        /**
         * BruteForce ALgorithm substring
         * performed below
         */
        String Y = "a pattern matching algorithm";
        comparisons = 0;
        System.out.println("Index: " + BruteForce.match(Y, "rithm"));
        System.out.println("Comparisons: " + comparisons);
        System.out.println(" ");

        Y = "abacaabaccabacabaabb";
        comparisons = 0;
        System.out.println("Index: " + BruteForce.match(Y,"abacab"));
        System.out.println("Comparisons: " + comparisons);
        System.out.println(" ");

        Y = "the cat sat on the back of the big red mat";
        comparisons = 0;
        BruteForce.matchTwo(Y, "the", 0);
        System.out.println("Comparisons: " + comparisons);

    }
}