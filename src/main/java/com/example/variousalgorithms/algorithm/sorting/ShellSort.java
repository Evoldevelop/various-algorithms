package com.example.variousalgorithms.algorithm.sorting;

import com.example.variousalgorithms.service.PrintService;

/**
 * <h1>ShellSort</h1>
 * Shell sort is mainly a variation of Insertion Sort. In insertion sort, we
 * move elements only one position ahead. When an element has to be moved far
 * ahead, many movements are involved. The idea of ShellSort is to allow the
 * exchange of far items. In Shell sort, we make the array h-sorted for a large
 * value of h. We keep reducing the value of h until it becomes 1. An array is
 * said to be h-sorted if all sublists of every h’th element are sorted.
 */
public class ShellSort {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {

            // Once the loop makes gap equals to 1, the code below starts out
            // an insertion sort

            for (int i = gap; i < intArray.length; i++) {

                int newElement = intArray[i];
                int j = i;
                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    // Only loops 2 times when j = 6 because, for instance, in
                    // the first loop, after comparing 7 and 20, it could compare
                    // more to the left, but there is no more array to the left of zero.
                    j -= gap;
                }

                intArray[j] = newElement;
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            PrintService.printMessage(intArray[i]);
        }
    }
}
