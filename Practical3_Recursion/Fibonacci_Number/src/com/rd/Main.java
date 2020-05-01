package com.rd;

/**
 * Code is written by Ronit Dahiya, 18204009
 * We implement fibonacci using recursion and
 * iteration. Computation time also calculated
 */
public class Main {

    /**
     * Method to calculate the fibonacci
     * sequence for given input
     *
     * @param n number for which fibonacci sequence is calculated
     * @return returns the result
     */
    static int fibonacciIterative(int n){
        if (n<=1)
            return 1;

        int fib = 1;
        int prevFib =  1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib = fib + prevFib;
            prevFib = temp;
        }
        return fib;
    }

    public static void main (String args[]) {

        // Using iterative method
        final long startTime = System.currentTimeMillis();
        int n = 15;

        System.out.println("Result using iteration: " + fibonacciIterative(n));

        final long timeElapsed = System.currentTimeMillis() - startTime;
        System.out.println("Computation time: " + timeElapsed);

        System.out.println();

        // Using recursive method
        final long startTime1 = System.currentTimeMillis();
        System.out.println("Result using recursion: " + Recursion_Method.Fibonacci(n));

        final long timeElapsed1 = System.currentTimeMillis() - startTime1;
        System.out.println("Computation time: " + timeElapsed1);

    }
}

