package com.example.dsa.basic_problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char[] toCharArray = A.toCharArray();
        String reverse = "";
        for (int i=A.length()-1; i>=0; i--) {
            reverse += toCharArray[i];
        }
        if (A.equalsIgnoreCase(reverse)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
