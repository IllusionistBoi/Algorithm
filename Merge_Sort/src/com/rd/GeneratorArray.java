package com.rd;

import java.util.Random;
import java.util.stream.Stream;

public class GeneratorArray {

    // Size of Array
    private int size;

    // Constructor
    public GeneratorArray(int size) {
        this.size = size;
    }

    /**
     * Method to generate random number
     * under specified range
     * @return array of random numbers
     */
    public Double[] generate() {
        Double[] x = Stream.generate(new Random()::nextDouble).distinct().limit(size).toArray(Double[]::new);

        for (int i = 0; i < size; i++) {
            // Assigning value in power of 10 (Multiple of 10)
            x[i] *= (int)Math.pow(10,((int)(Math.random()*((7-5)+1))+5));
            // Rounding off the decimal
            x[i] = Double.valueOf(Math.round(x[i]*100.0)/100.0);
        }
        // Return the array
        return x;
    }

    public static void main(String[] args) {
        Double[] array = new GeneratorArray(10).generate();

        for(Double d: array) {
            System.out.println(d);
        }
    }
}
