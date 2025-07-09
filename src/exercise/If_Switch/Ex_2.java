package exercise.If_Switch;

//Створіть умовний оператор switch case для перевірки числової змінної.
//
//Якщо змінна дорівнює 3 - виведіть у консоль напис "Три";
//Змінна дорівнює 7 - виведіть напис "Сім";
//Для решти виведіть напис "Щось інше".

import java.util.Scanner;

public class Ex_2 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?: ");
        int age = scanner.nextInt();

        switch (age){
            case 3 :
                System.out.println("You are three years old");
                break;
            case 7 :
                System.out.println("You are seven years old");
                break;
            default:
                System.out.println("Another age");
        }


    }
}
