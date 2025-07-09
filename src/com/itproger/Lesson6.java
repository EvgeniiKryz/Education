package com.itproger;

import java.util.Scanner;


public class Lesson6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть логін: ");
        String role = scanner.nextLine();
        System.out.println("Введіть пароль");
        String pass = scanner.nextLine();
        if (role.equals("LadyRevenko") && pass.equals("3331")) {
            System.out.println("Привіт Юля");

        } else {
            System.out.println("Пароль або логін не вірний");
            String name = scanner.nextLine();
        }

    }
}
