package com.itproger;

import java.util.Scanner;

import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

 //          System.out.print("Введіть ваше ім'я: ");
  //      String username =  scan.nextLine();
  //      System.out.println("Привіт " + username);
 //       int num1 = scan.nextInt();

        System.out.println("введіть 1 число: ");
        int num1 = scan.nextInt();

        System.out.println("введіть 2 число: ");
        int num2 = scan.nextInt();

        int res1 = num1 + num2;
        int res2 = num1 - num2;
        int res3 = num1 * num2;
        int res4 = num1 / num2;

        System.out.println("Результат: ");
        System.out.println(num1 + " + " + num2 + " = " + res1 + "\n" + num1 + " - " + num2 + " = " + res2);
        System.out.println(num1 + " * " + num2 + " = " + res3 + "\n" + num1 + " / " + num2 + " = " + res4);

    }
}
