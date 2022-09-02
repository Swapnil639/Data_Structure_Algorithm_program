package com.bridgelabz;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("Welcome to InsertionOrder program");
        String[] array = {"Juice", "Mango", "Elephant", "Cat", "Dog"};
        String[] sorted = insertionMethod(array);
        System.out.println("Sorting Array is :");
        for (String s : sorted) {
            System.out.println(s);
        }
    }

    public static String[] insertionMethod(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
