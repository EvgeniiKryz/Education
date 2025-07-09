package exercise.For;

//Задача: Вивести всі числа, кратні 3, від 1 до N

import java.util.Scanner;

public class Ex_8 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            if (i % 3 != 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
