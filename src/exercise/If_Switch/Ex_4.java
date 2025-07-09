package exercise.If_Switch;

//Попросіть користувача ввести два числа, а також арифметичну дію (+, -, *, /).
//
//Залежно від символу, який буде введено, виконайте математичні дії над числами, введеними користувачем.
//
//Для перевірки даних використовуйте оператор switch case.

import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = scanner.nextInt();

        System.out.println("Enter number: ");
        int b = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter the math operation: ");
        char math = scanner.nextLine().charAt(0);
        int res;

        switch (math){
            case '+' :
                res = a + b;
                System.out.println(res);
                break;
            case '-' :
                res = a - b;
                System.out.println(res);
                break;
            case '/' :
                if (b == 0){
                    System.out.println("Error");
                } else {
                    res = a / b;
                    System.out.println(res);
                }
                break;
            case '*' :
                res = a * b;
                System.out.println(res);
            default:{
                System.out.println("Unknown the math operation: " + math);
            }
        }
    }
}
