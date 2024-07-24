package com.example.dsa.leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // Problem statement
    /*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    You can return the answer in any order.

    Example 1:

    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    Example 2:

    Input: nums = [3,2,4], target = 6
    Output: [1,2]
    Example 3:

    Input: nums = [3,3], target = 6
    Output: [0,1]


    Constraints:

    2 <= nums.length <= 104
    -109 <= nums[i] <= 109
    -109 <= target <= 109
    Only one valid answer exists.*/


    // Method 1: Using brute force approach
    /* this implementation has a time complexity of O(n^2), where n is the length of the input array.
    This is because it uses two nested loops to iterate over all possible pairs of numbers in the input array.*/
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }

    //    Method 2: Using hash table
    /*This function finds the indices of two numbers that add up to a target using a hash table, with a time complexity of O(n).*/
    public static int[] twoSumUsingHashTable(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("Something went wront");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 6, 11, 15};
        int target = 17;
        int[] resultUsingBruteForce = twoSum(nums, target);
        int[] resultUsingHashTable = twoSumUsingHashTable(nums, target);
        System.out.println(Arrays.toString(resultUsingBruteForce));
        System.out.println(Arrays.toString(resultUsingHashTable));
    }
}
