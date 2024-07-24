package com.example.dsa.leetCode;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println(canConstruct("aabbb", "aaaaabbbbb"));
        System.out.println(findMaxConsecutiveOnes(new int[] {1,1,1,2,1,2,2,3,4,5}));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int temp = 0;
        int counter = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i]==1) {
                temp++;
                if (temp >= counter) {
                    counter = temp;
                }

            } else {
                temp = 0;
            }

        }
        return counter;
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) {
            return false;
        }
        StringBuilder result = new StringBuilder();
        StringBuilder magazineBuilder = new StringBuilder(magazine);
        for (int i=0; i<ransomNote.length(); i++) {
            for (int j=0; j<magazine.length(); j++) {
                if (ransomNote.charAt(i) == magazineBuilder.charAt(j)) {
                    result.append(magazineBuilder.charAt(j));
                    magazineBuilder.setCharAt(j, '-');
                    System.out.println("Magazine " + magazineBuilder);
                    break;
                }
            }
        }
        return ransomNote.equals(result.toString());
    }
}
