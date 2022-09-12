package com.bridgelabz;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Welcome to BinarySearch Program");
        BinarySearch search = new BinarySearch();
        String[] array = {"apple", "ball", "cat", "dog"};
        String word = "dog";
        int result = search.searchingMethod(array, word);
        if (result == -1)
            System.out.println("Element not found in the data");
        else
            System.out.println("Element found in the data at Index : " + result);
    }

    public int searchingMethod(String[] array, String word) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (word.compareTo(array[mid]) == 0) {
                return mid;
            } else if (word.compareTo(array[mid]) > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

