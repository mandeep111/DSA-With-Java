package com.example.dsa.leetCode;

import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.deepToString(rotate(matrix)));
    }

    public static int[][] rotate(int[][] arr) {
        if(arr.length != arr[0].length) {
            return null;
        }
        int len = arr.length - 1;
        for(int i = 0; i < len; i++) {
            int last = len - i;
            for(int j = i; j < last; j++) {
                int offset = j - i;
                int top = arr[i][j];
                arr[i][j] = arr[last - offset][i];
                arr[last - offset][i] = arr[last][last - offset];
                arr[last][last - offset] = arr[j][last];
                arr[j][last] = top;
            }
        }
        return arr;
    }
}
