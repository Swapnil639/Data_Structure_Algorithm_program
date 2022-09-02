package com.bridgelabz;

import java.util.Scanner;

public class PalindromePrimeNumber {
    static int rev, count;
    static int num, temp, i;

    public static void main(String[] args) {
        PalindromePrimeNumber palindromePrimeNumber = new PalindromePrimeNumber();
        palindromePrimeNumber.palPrime();
    }

    public void palPrime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lower limit");
        int a = scanner.nextInt();
        System.out.println("Enter the upper limit");
        int b = scanner.nextInt();
        System.out.println(" PrimeNumber and Palindrome series is :");
        for (num = a; num <= b; num++) {
            count = 0;
            rev = 0;
            temp = num;
            for (i = 1; i <= temp; i++) {
                if (temp % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                while (temp > 0) {
                    rev = (rev * 10) + (temp % 10);
                    temp = temp / 10;
                }
                if (rev == num) {
                    System.out.print(num + " ");
                }
            }
        }

    }
}
