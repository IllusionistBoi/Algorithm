package com.rd;

/**
 * Program written by Ronit Dahiya, 18204009
 * Knuth-Morris-pratt implemented using pseudo
 * code provided
 */

public class Main {
    private static int comparisons = 0;

    public static void main(String[] args) {

        String T = "a pattern matching algorithm";
        comparisons = 0;
        System.out.println("index: ");
        System.out.println(KMP.match(T, "rithm"));
        System.out.println("comparisons: " + comparisons);

        T = "abacaabaccabacabaabb";
        comparisons = 0;
        System.out.println("index: " + KMP.match(T, "abacab"));
        System.out.println("comparisons: " + comparisons);

        /**
         * BruteForce ALgorithm substring
         * performed below
         */
        T = "a pattern matching algorithm";
        comparisons = 0;
        System.out.println("index: ");
        System.out.println(BruteForce.match(T,"rithm"));
        System.out.println("comparisons: " + comparisons);

        T = "abacaabaccabacabaabb";
        comparisons = 0;
        System.out.println("index: ");
        System.out.println(BruteForce.match(T,"abacab"));
        System.out.println("comparisons: " + comparisons);


        T = "the cat sat on the back of the big red mat";
        comparisons = 0;
        BruteForce.matchTwo(T, "the", 0);
        System.out.println("comparisons: " + comparisons);

    }
}