package exercise.For;

//Задача: Знайти суму всіх непарних чисел від 1 до N

import java.util.Scanner;

public class Ex_7 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i +=2){

            sum = sum + i;

        }
        System.out.println("Сума непарних чисел: " + sum);

    }
}
