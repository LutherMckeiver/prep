package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(selectionSort(new int[]{34, 22, 10, 19, 17}));
    }

    public static String selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (i != min) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        return Arrays.toString(arr);
    }
}
