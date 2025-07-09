package com.itproger;

public class ex_1_2 {public static void main(String args[]) {
    int n = 4;

    int i;

    for (i = 0; i < n; i++) {

            if (i == 0 || i == n - 1) {
                System.out.print("*");
            } else {
                System.out.print("-");
            }
        }
        System.out.println();
    }
}
