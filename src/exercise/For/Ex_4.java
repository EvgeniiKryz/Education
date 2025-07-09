package exercise.For;

//Створіть нескінченний цикл, у якому просите користувача ввести число.
//
//
//Створіть перевірки:
//
//при введенні числа 0 виходьте із циклу;
//у разі введення числа 1 пропускайте одну ітерацію;

import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;


        while (true) {

            System.out.println("Ввудіть число: ");
            n = scanner.nextInt();

            if (n == 1)
                continue;
            else if (n == 0)
                break;
            System.out.println("Пройшов цикл");

        }
        System.out.println("Цикл завершенно");
    }
}
