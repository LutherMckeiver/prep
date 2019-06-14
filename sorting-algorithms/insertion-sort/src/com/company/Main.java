package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(insertionSort(new int[] {12, 11, 14, 5, 6}));
    }

    public static String insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; ++i) {
            int currentValue = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > currentValue) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = currentValue;
        }
        return Arrays.toString(arr);
    }
}
