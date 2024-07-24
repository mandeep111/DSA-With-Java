package com.example.dsa.basic_problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        if (A.length() != B.length()) System.out.println("Not Anagrams");
        Map<Character, Integer> aFreqs = new HashMap<>();
        Map<Character, Integer> bFreqs = new HashMap<>();
        A.toLowerCase().chars().forEach(e->aFreqs.put((char) e,aFreqs.getOrDefault((char)e,0)+1));
        B.toLowerCase().chars().forEach(e->bFreqs.put((char) e,bFreqs.getOrDefault((char)e,0)+1));
        System.out.println(aFreqs);
        System.out.println(bFreqs);
        if (aFreqs.equals(bFreqs)) System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
    }
}
