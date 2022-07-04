package com.example.variousalgorithms.algorithm.sorting;

/**
 * <h1>InsertionSort</h1>
 * The array is virtually split into a sorted and an unsorted part.
 * Values from the unsorted part are picked and placed at the correct position
 * in the sorted part.
 *
 * This algorithm is one of the simplest algorithm with simple implementation
 * Basically, Insertion sort is efficient for small data values
 * Insertion sort is adaptive in nature, i.e. it is appropriate for data sets
 * which are already partially sorted.
 */
public class InsertionSort {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length;
             firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];

            int i;
            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
