package exercise.If_Switch;

//Створіть програму для отримання двох чисел від користувача з клавіатури.
//
//Створіть змінну result і помістіть тернарну операцію до неї.
//
//Тернарна операція наступна: якщо друге введене користувачем число дорівнює нулю,
//то в result помістіть число 1, інакше ділення отриманих від користувача змінних.

import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();

        int result = b == 0 ? (a) : (a / b); //тернарна операція. Це скорочена форма if else

        System.out.println(result);


    }
}
