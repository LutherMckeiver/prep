package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(optimizedBubbleSort(new int[] {8, 1, 2, 3, 4, 5, 6, 7}));
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static String optimizedBubbleSort(int[] arr) {
        boolean noSwaps;
        for (int i = arr.length; i > 0; i--) {
            noSwaps = true;
            for (int j = 0; j < i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    noSwaps = false;
                }
            }
            if (noSwaps) break;
        }

        return Arrays.toString(arr);
    }
}
