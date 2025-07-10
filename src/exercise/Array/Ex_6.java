package exercise.Array;

//Створіть масив, використовуючи цикл do while.
// Кожен елемент, а також розмір масиву повинен вводити користувач з клавіатури.

import java.util.Scanner;

public class Ex_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        int i = 0;

        do {
            System.out.println("Enter arr[" + i + "]");
            arr[i] = scanner.nextInt();
            i++;

        } while (i < n);

        System.out.println("Your array: ");
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");

        }


    }
}
