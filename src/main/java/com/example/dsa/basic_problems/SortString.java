package com.example.dsa.basic_problems;

import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int compare = A.compareTo(B);
        if(compare < 0) {
            System.out.println(A + " comes first");
        } else {
            System.out.println(B + " comes first");
        }
    }
}
