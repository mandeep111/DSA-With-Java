package com.example.dsa.recursion;

public class SumOfPositiveNumber {
    public static void main(String[] args) {
        int number = 45;
        int output = new SumOfPositiveNumber().calculateSum(number);
        System.out.println("The sum of " + number + " is "+output);
    }

    public int calculateSum(int number) {
        if (number <= 0) {
            return 0;
        }
        return (number%10) + calculateSum(number/10);
    }
}