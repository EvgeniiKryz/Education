package com.itproger;

import java.util.Scanner;
import java.util.stream.Stream;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть 1 число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введіть 2 число: ");
        int num2 = scanner.nextInt();

        int res;

        System.out.print("Дія: ");
        String action = scanner.next();

        switch (action) {
            case "+":
                res = num1 + num2;
                System.out.println("Результат: " + res);
                break;

            case "-":
                res = num1 - num2;
                System.out.println("Результат: " + res);
                break;

            case "*":
                res = num1 * num2;
                System.out.println("Результат: " + res);
                break;

            case "/":
                if (num2 == 0)
                    System.out.println("Error");
                else {
                    res = num1 / num2;
                    System.out.println("Результат: " + res);
                }
                break;
            case " ":
                System.out.println("Enter with space");
                break;
            case "":
                System.out.println("without space");
                break;

            default:
                System.out.println("Error");

        }
    }
}
