package com.company;

public class Main {

    public static void main(String[] args) {
        mergeSort(new int[] {5, 4, 3, 2, 1});
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) return arr; // base case

        int midpoint = arr.length / 2;
        int[] left = new int[midpoint];
        int[] right;

        if (arr.length % 2 == 0) {
            right = new int[midpoint];
        }
        right = new int[midpoint + 1];

        for (int i = 0; i < midpoint; i++) {
            left[i] = arr[i];
        }

        for (int j = 0; j < right.length; j++) {
            right[j] = arr[midpoint + j];
        }

        int[] result = new int[arr.length];

        left = mergeSort(left);
        result = merge(left, right);

        return result;

    }


    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i, j, k;
        i = j = k = 0;
        while (i < left.length || j < right.length) {
            if (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    result[k++] = left[i++];
                } else {
                    result[k++] = right[j++];
                }
            } else if (i < left.length) {
                result[k++] = left[i++];
            } else if (j < right.length) {
                result[k++] = right[j++];
            }
        }
        return result;
    }
}
