package exercise.While;

import java.util.Scanner;

//Задача 1: Порахувати суму від 1 до N
//Опис: Користувач вводить число N. Порахуйте та виведіть суму всіх чисел від 1 до N включно.

public class Ex_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть число N: ");
        int n = scanner.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("Сумма від 1 до " + n + " = " + sum);
    }
}
