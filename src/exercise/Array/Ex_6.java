package exercise.Array;

//Створіть масив, використовуючи цикл do while.
// Кожен елемент, а також розмір масиву повинен вводити користувач з клавіатури.

import java.util.Scanner;

public class Ex_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = scanner.nextInt();
        int array[] = new int[size];
        int i = 0;

        do {
            System.out.println("Enter arr[" + i + "]");
            array[i] = scanner.nextInt();
            i++;

        } while (i < size);

        System.out.println("Your array: ");
        for (int j = 0; j < size; j++) {
            System.out.print(array[j] + " ");

        }
    }
}
