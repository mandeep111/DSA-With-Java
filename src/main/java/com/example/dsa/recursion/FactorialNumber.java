package com.example.dsa.recursion;

public class FactorialNumber {
    public static void main(String[] args) {
        int number = 5; // number to find the factorial
        int factorial = new FactorialNumber().calculateFactorial(number);
        String output = String.format("The factorial of %d is %d", number, factorial);
        System.out.println(output);
    }

    private int calculateFactorial(int i) {
        // stopping case
        if (i == 0) {
            return 1;
        }
        // unintentional case
        if (i < 0) {
            System.out.println("Please provide a positive number");
            return 0;
        }

        // recursive case - the flow
        return i * calculateFactorial(i-1);
    }
}
