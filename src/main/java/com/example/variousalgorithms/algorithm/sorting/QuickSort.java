package com.example.variousalgorithms.algorithm.sorting;

/**
 * <h1>QuickSort</h1>
 * QuickSort is a Divide and Conquer algorithm. It picks an element as pivot
 * and partitions the given array around the picked pivot.
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        quickSort(intArray, 0, intArray.length - 1);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void quickSort(int[] input, int left, int right) {
        int pivot = input[left]; // Take first element as pivot.
        int i = left;            // i does the search from left to right.
        int j = right;           // j does the search from right to left.
        int aux;

        while (i < j) {                             // While searches do not cross each other.

            while (input[i] <= pivot && i < j) i++; // Looks for element > pivot
            while (input[j] > pivot) j--;           // Looks for element < pivot

            if (i < j) {                            // If searches have not crossed, exchange them.
                aux = input[i];
                input[i] = input[j];
                input[j] = aux;
            }
        }

        // Does the same than the above if condition, but out of the while after both indexes crossed.
        input[left] = input[j]; // Place the pivot in its place, so < to its left and > to its right.
        input[j] = pivot;

        if (left < j - 1)                                // Check the size of left side ini order to assure that its size is still > 1.
            quickSort(input, left, j - 1);          // Order left subarray.
        if (j + 1 < right)
            quickSort(input, j + 1, right);          // Order right subarray.
    }

}
