package com.bridgelabz;

import java.util.Scanner;

public class Permutations {
    static int count=0;
    public static void main(String[] args) {
        System.out.println(" Welcome to permutation program ");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string ");
        String str=scanner.next();
        String ans=" ";
        System.out.println("All possibility ways of the string is : ");
        method(str,ans);
        System.out.println("Total possibility ways are : "+count);
    }

    public static void method(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans + " ");
            count++;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i + 1);
            String rest = left + right;
            method(rest, ans + ch);
        }
    }
}