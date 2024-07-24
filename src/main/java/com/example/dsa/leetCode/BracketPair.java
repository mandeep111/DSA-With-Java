package com.example.dsa.leetCode;

import java.util.Stack;

public class BracketPair {
    public static void main(String[] args) {
        System.out.println(isValid("{()}")); // true
        System.out.println(isValid("{({)}")); // false
    }
    public static boolean isValid(String s) {
        char[] ch = s.toCharArray();
        Stack<Character> characters = new Stack<>();

        for (char c: ch) {
            if (ch.length % 2 != 0) {
                return false;
            }
            if (c == '(' || c == '{' || c == '[') characters.push(c);
            else if (c == ')' && !characters.isEmpty() && '(' == characters.peek()) {
                characters.pop();
            } else if (c == '}' && !characters.isEmpty() && '{' == characters.peek()) {
                characters.pop();
            } else if (c == ']' && !characters.isEmpty() && '[' == characters.peek()) {
                characters.pop();
            } else return false;
        }
        return characters.isEmpty();
    }

}
