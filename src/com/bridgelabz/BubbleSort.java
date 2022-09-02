package com.bridgelabz;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {8, 0, 2, 3, 1};
        int temp = 0;
        for(int i = 1; i < array.length; i++){
            for(int j = 0; j < array.length-1; j++){
                if(array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("Printing the Sorted Array");
        for(int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
