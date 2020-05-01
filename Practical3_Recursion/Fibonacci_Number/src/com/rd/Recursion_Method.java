package com.rd;

public class Recursion_Method {

    static int Fibonacci(int N) {
        if( N <= 1)
            return N;
        else
            return Fibonacci(N - 1) + Fibonacci(N - 2);
    }
}
