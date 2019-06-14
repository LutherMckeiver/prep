package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[] { 12, 13, 24, 10, 3, 6, 90, 70 };


        quickSort( arr, 0, arr.length - 1 );

        // Verify sorted array
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0) return;

        if (low >= high) return;

        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        int i = low, j = high;
        while (i <= j) {

            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSort(arr, low, j);
        }

        if (high > i) {
            quickSort(arr, i, high);
        }
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

}
