package com.rd;

public class Russian_PeasantAlgorithm {

    /**
     * Basic Idea Behind the algorithms is that it takes two numbers and uses the first number to decide
     * whether it must be used for addition or not.
     * If its even discard, ifs it odd then add it to the
     * result. during the compilation we also half the first number
     * and double the second number till first number is not equal to -ve number
     *
     * @param number1 input number 1
     * @param number2 input number 2
     * @return multiplied value of both number
     */
    public static int multiply(int number1, int number2) {
        int Result = 0;

        while(number1!=0) {
            if(number1 % 2 == 0) {

            } else {
                Result += number2;
            }
            number1 /= 2;
            number2 *= 2;
        }
        return Result;
    }
}
