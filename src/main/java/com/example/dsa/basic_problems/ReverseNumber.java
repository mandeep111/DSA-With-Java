package com.example.dsa.basic_problems;

public class ReverseNumber {
    public static void main(String[] args) {
        int a = 54321508;
        int reverse = 0;
        while(a!=0) {
            int lastDigit = a%10;
            reverse = (reverse*10) + lastDigit;
            a = a/10;
        }
        System.out.println(reverse);
    }
}
