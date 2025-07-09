package com.itproger;

import java.util.Scanner;

public class L9 {
    public static void main(String[] args) {

        int[] arr = new int[4];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < arr.length; i ++) {
            System.out.println("Ввдіть число: ");
            int value = scanner.nextInt();
            arr[i] = value;
        }

        int min = arr[0];
        for(int i = 0; i < arr.length; i ++) {
            if(arr[i] < min)
                min = arr[i];
        }
        System.out.println("Minimal: " + min);

        // Багатомірний масив

        char [][] syms = new char[2][4];
        // [[1, 5, 9, 4], [5, 8, 8, 4]]

        syms[0][0] = 't';
        System.out.println(syms[0][0]);

        byte [][] nums = new byte[][] {
                {5, 8},
                {8, 5},
                {7, 1}
        };

        System.out.println(nums[2][0]);



    }
}
