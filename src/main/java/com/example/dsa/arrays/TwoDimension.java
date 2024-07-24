package com.example.dsa.arrays;

import java.util.Arrays;

public class TwoDimension {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        int[][] b = {{3,4,5}, {1,5,6}}; // array initialization and instantiation takes O(mn) complexity
        int[][] c = {{1,2}, {8,6}};
        // instantiating array element with minimum integer value
        for (int row=0; row<a.length; row++) {
            for (int col=0; col<a[0].length; col++) {
                a[row][col] = Integer.MIN_VALUE;
            }
        }

        // multiplication of two-dimensional array
        TwoDimension td = new TwoDimension();
        td.multiplication(b,c);
        // can't multiply because of mismatch in rows and columns
        td.multiplication(a,c);

        // insertion of element in two-dimensional array
        td.insertion(a, 0, 0, 1500);
        td.insertion(a, 0, 1, 500);
        td.insertion(a, 1, 1, 1000);
        // this should throw an error
        td.insertion(a, 3, 1, 800);

        // searching keyword in array
        td.search(b, 6);
        td.search(c, 8);
        td.search(a, 80);

        // accessing the index to check its value
        td.access(b, 1, 1);
        td.access(b, 3, 4);

        // deleting element in array by setting minimum integer value
        td.delete(b, 1,1);
        td.delete(b, 1,3);
    }

    public void multiplication(int[][] a, int[][] b) {
        System.out.println("Array a: "+ Arrays.deepToString(a));
        System.out.println("Array b: "+ Arrays.deepToString(b));
        int row = a.length;
        int col = b[0].length;

        if (row != col) {
            System.out.println("Rows and columns length doesn't match");
        } else {
            int[][] c = new int[row][col];
            for (int i=0; i<a.length; i++) {
                for (int j = 0; j<b.length; j++) {
                    c[i][j]=0;
                    for (int k=0; k<a.length; k++) {
                        c[i][j] += (a[i][k] * b[k][j]);
                    }
                }
            }
            System.out.print("After multiplication: " + Arrays.deepToString(c));
        }
        System.out.println();
    }

    public void insertion(int[][] a, int row, int col, int value) {
        try {
            if (a[row][col] == Integer.MIN_VALUE) {
                a[row][col] = value;
                System.out.println("After insertion: "+Arrays.deepToString(a));
            } else {
                System.out.println("Array index is not empty");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of index");
        }
    }

    public void search(int[][] arr, int keyword) {
        System.out.println("Given array: "+ Arrays.deepToString(arr));
        System.out.println("Searching for keyword: "+ keyword);
        boolean isPresent = false;
        for (int row=0; row<arr.length; row++) {
            for (int col=0; col<arr[0].length; col++) {
                if (keyword == arr[row][col]) {
                    System.out.println("Keyword found at index " + row +", "+ col);
                    isPresent = true;
                }
            }
        }
        if (!isPresent) {
            System.out.println("Keyword not found in the array");
        }
    }

    public void access(int[][] arr, int row, int col) {
        try {
            System.out.println("Element at index "+ row +"," + col + " is: " + arr[row][col]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bound");
        }
    }

    public void delete(int[][] arr, int row, int col) {
        System.out.println("Given array: "+ Arrays.deepToString(arr));
        try {
            arr[row][col] = Integer.MIN_VALUE;
            System.out.println("After Deletion: " + Arrays.deepToString(arr));
        } catch (Exception e) {
            System.out.println("Array out of bound");
        }
    }
}
