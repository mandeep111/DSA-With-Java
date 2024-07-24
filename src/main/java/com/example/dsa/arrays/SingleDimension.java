package com.example.dsa.arrays;

import java.util.Arrays;

public class SingleDimension {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Arrays.fill(arr, Integer.MIN_VALUE);
        System.out.println("Initial array: " + Arrays.toString(arr));
        SingleDimension singleDimension = new SingleDimension();
        // insert in different location
        singleDimension.insert(arr, 0,5);
        singleDimension.insert(arr, 4,44);
        singleDimension.insert(arr, 10,50);

        // access value with specific index
        singleDimension.access(arr, 0);
        singleDimension.access(arr, 4);

        // search for value in array
        singleDimension.search(arr, 0);
        singleDimension.search(arr, 44);

        // traverse the array elements
        singleDimension.traverse(arr);

        // delete value from array using index
        singleDimension.delete(arr, 4);
        singleDimension.delete(arr, 0);

        // sum of array
        singleDimension.sumOfArray();

        // sum of pair in array
        singleDimension.twoSum();
    }

    public void insert(int[] arr, int index, int value) {
        /*
        After array instantiation, the default values for array element is set to minimum integer
        value. So if value of certain index is equals to Integer.MIN_VALUE, then we will insert
        on that index or say index is already occupied.
        */
        System.out.println("Insert in array::");
        try {
            if (arr[index] == Integer.MIN_VALUE) {
                arr[index] = value;
                System.out.println("After: "+Arrays.toString(arr));
            } else {
                System.out.println("The index is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bound");
        }
    }

    public void access(int[] arr, int index) {
        System.out.println("Accessing array at index: "+ index);
        try {
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bound");
        }
    }

    public void search(int[] arr, int value) {
        System.out.println("Given array: "+ Arrays.toString(arr));
        System.out.println("Search array for value: "+ value);
        boolean isPresent = false;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == value) {
                String result = String.format("The value %d is located at index %d", value, i);
                System.out.println(result);
                isPresent = true;
            }
        }
        if (!isPresent) {
            System.out.println(value + " is not present in the given array");
        }
    }

    public void traverse(int[] arr) {
        System.out.println("Traversing the array");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }

    public void delete(int[] arr, int index) {
        System.out.println("Deleting array at index "+ index);
        try {
            arr[index] = Integer.MIN_VALUE;
            System.out.println(Arrays.toString(arr));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bound");
        }
    }

    public void sumOfArray() {
        System.out.println("Sum of array:");
        int[] arr = {1,2,3,5,8,13,21};
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of given array is: "+ sum);
    }

    public void twoSum() {
        int[] arr = {3,3};
        int result = 6;
        for (int i=0; i<arr.length; i++) {
            for (int j=1; j<arr.length; j++) {
                int sum = arr[i]+arr[j];
                System.out.println("Sum is: "+ sum);
                if (result == sum) {
                    System.out.println("The elements are: "+ arr[i] +" ," + arr[j]);
                    System.out.println(Arrays.toString(new int[] {i,j}));
                    break;
                } else System.out.println("Not found");

            }
        }
    }
}