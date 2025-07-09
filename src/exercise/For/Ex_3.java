package exercise.For;

//Створіть програму, яка проситиме користувача ввести число 10.
//
//Програма буде вимагати ввести число 10 доти, доки користувач його не введе.

import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число 10 ");
        int n = scanner.nextInt();

        while (n != 10){
            System.out.println("Введіть число 10 ще раз ");
            n = scanner.nextInt();
            if (n == 10)
                System.out.println("Вірно");
        }

    }
}