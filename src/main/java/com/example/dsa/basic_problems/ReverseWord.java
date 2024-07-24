package com.example.dsa.basic_problems;

public class ReverseWord {
    public static void main(String[] args) {
        ReverseWord reverseWord = new ReverseWord();
        System.out.println(reverseWord.reverseWord("hello world"));
        System.out.println(reverseWord.reverseSentence("I am a man"));
    }

    String reverseWord(String word) {
        char[] charArray = word.toCharArray();
        String reverse = "";
        for (int i=charArray.length-1; i>=0; i--) {
            reverse += charArray[i];
        }
        return reverse;
    }

    String reverseSentence(String sentence) {
        String reverse = "";
        String[] split = sentence.split(" ");
        for (int i= split.length-1; i>=0; i--) {
            reverse += split[i] + " ";
        }
        return reverse;
    }
}
