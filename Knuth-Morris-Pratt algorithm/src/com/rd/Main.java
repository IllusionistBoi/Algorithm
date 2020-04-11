package com.rd;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Program written by Ronit Dahiya, 18204009
 * Knuth-Morris-pratt implemented using pseudo
 * code provided
 */

//problem is comparisons. need to be able to use in all three files

public class Main {

    private static int comparisons = 0;

    public static void main(String[] args) {

        /**
         * KMP implemented for String T
         * using two examples
         */
        String T = "a pattern matching algorithm";
        comparisons = 0;
        System.out.print("Index: ");
        System.out.println(KMP.match(T, "rithm"));
        System.out.println("Comparisons: " + comparisons);
        System.out.println(" ");

        T = "abacaabaccabacabaabb";
        comparisons = 0;
        System.out.print("Index: ");
        System.out.println(KMP.match(T, "abacab"));
        System.out.println("comparisons: " + comparisons);


//        /**
//         * BruteForce ALgorithm substring
//         * performed below
//         */
//        String Y = "a pattern matching algorithm";
//        comparisons = 0;
//        System.out.print("Index: ");
//        System.out.println(BruteForce.match(Y,"rithm"));
//        System.out.print("Comparisons: " + comparisons);
//
//        Y = "abacaabaccabacabaabb";
//        comparisons = 0;
//        System.out.print("Index: ");
//        System.out.println(BruteForce.match(Y,"abacab"));
//        System.out.println("Comparisons: " + comparisons);
//
//
//
//        Y = "the cat sat on the back of the big red mat";
//        comparisons = 0;
//        BruteForce.matchTwo(Y, "the", 0);
//        System.out.println("Comparisons: " + comparisons);


        T = "a pattern matching algorithm";
        comparisons = 0;
        System.out.println("index: ");
        System.out.println(BruteForce.match(T, "rithm"));
        System.out.println("comparisons: " + comparisons);

        T = "abacaabaccabacabaabb";
        comparisons = 0;
        System.out.println("index: ");
        System.out.println(BruteForce.match(T, "abacab"));
        System.out.println("comparisons: " + comparisons);


        T = "the cat sat on the back of the big red mat";
        comparisons = 0;
        BruteForce.matchTwo(T, "the", 0);
        System.out.println("comparisons: " + comparisons);
    }
}