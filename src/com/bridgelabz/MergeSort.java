package com.bridgelabz;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println("  Welcome to MergeSort Program");
        int[] array = {8, 2, 6, 9, 1};
        mergeSort(array, 0, array.length - 1);
        System.out.println("Sorting Array is :");
        System.out.println(Arrays.toString(array));
    }

    public static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int L[] = new int[n1];
        int M[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = array[left + i];
            for (int j = 0; j < n2; j++) {
                M[j] = array[mid + 1 + j];
            }
        }
        int i = 0, j = 0, K = left;
        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                array[K] = L[i];
                i++;
            } else {
                array[K] = M[j];
                j++;
            }
            K++;
        }
        while (i < n1) {
            array[K] = L[i];
            i++;
            K++;
        }
        while (j < n2) {
            array[K] = M[j];
            j++;
            K++;
        }

    }

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }
}