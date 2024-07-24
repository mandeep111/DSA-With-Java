package com.example.dsa.recursion;

public class FibonacciSequence {
    public static void main(String[] args) {
        int fibonacci = new FibonacciSequence().getFibonacciNumber(8);
        System.out.println(fibonacci);
    }

    private int getFibonacciNumber(int i) {
        if (i == 1) {
            return 1;
        }
        if (i <= 0) {
            return  0;
        }
        return getFibonacciNumber(i-1) + getFibonacciNumber(i-2);
    }
}
