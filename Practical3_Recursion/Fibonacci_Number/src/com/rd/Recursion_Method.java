package com.rd;

public class Recursion_Method {

    /**
     * Method to calculate sequence using
     * recursion
     *
     * @param N number for which fibonacci sequence is calculated
     * @return multiplied sequence is returned as result
     */
    static int Fibonacci(int N) {
        if( N <= 1)
            return N;
        else
            return Fibonacci(N - 1) + Fibonacci(N - 2);
    }
}
