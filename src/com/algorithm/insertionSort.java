package com.algorithm;

public class insertionSort {
    public static void main(String[] args) {
        System.out.println("Har Har Mahadev");
        int[] a = {1, 1, 6, 5, 4, 19};
        insertionSorts(a);
        for (int k:a
             ) {
            System.out.println(k);
        }

    }

    private static void insertionSorts(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    swap(a, i, j);
                }
            }
        }

    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }
}
