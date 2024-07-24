package com.example.dsa.recursion;

public class PowerOfNumber {
    public static void main(String[] args) {
        int output = new PowerOfNumber().calculatePower(4,4);
        System.out.println(output);
    }

    public int calculatePower(int number, int power) {
        if (power == 0) {
            return 1;
        }
        return number * calculatePower(number, power-1);
    }
}
