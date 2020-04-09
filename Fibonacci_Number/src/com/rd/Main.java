package com.rd;

public class Main {

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

    public static void main (String args[])
    {
        final long startTime = System.currentTimeMillis();
        int n = 15;
        System.out.println(fibonacciIterative(n));

        final long timeElapsed = System.currentTimeMillis() - startTime;
        System.out.println(timeElapsed);

        System.out.println(Recursion_Method.Fibonacci(n));
    }
}

