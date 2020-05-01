package com.rd;

import java.util.Scanner;

/* Takes Two Numbers as input from the user and then pass into the algorithm for computation*/

public class Main {

    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number for multiplication using the Russian Peasant’s algorithm");
        int Number1 = input.nextInt();
        int Number2 = input.nextInt();

        System.out.println("Answer is : " + Russian_PeasantAlgorithm.multiply(Number1,Number2));

        final long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("Computation Time is : " + elapsedTime);
    }
}
