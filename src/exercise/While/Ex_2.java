package exercise.While;

//Задача: Обчислити факторіал числа N
//Факторіал — це добуток усіх цілих чисел від 1 до N включно.
//Позначається як N!
//Наприклад: 5! = 1 × 2 × 3 × 4 × 5 = 120

import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число N: ");
        int n = scanner.nextInt();

        int fctr = 1;
        int i = 1;

        while(i <= n) {

//            fctr = fctr * i;
            fctr *= i;
            i++;

        }

        System.out.println("Факторіал числа " + n + " = " + fctr);

    }
}
