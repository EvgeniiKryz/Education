package exercise.For;

//Задача: Порахувати кількість чисел, кратних 5, від 1 до N

//Умова:
//Користувач вводить число N. Програма має порахувати, скільки чисел від 1 до N включно
//діляться на 5 без остачі — і вивести цю кількість.

import java.util.Scanner;

public class Ex_9_1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 5; i <= n; i += 5){
            sum++;
        }
        System.out.println(sum);
    }
}
