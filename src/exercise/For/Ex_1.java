package exercise.For;

//Квадрати чисел
//Складіть програму, що виводить на екран квадрати чисел від 10 до 20 включно

public class Ex_1 {
    public static void main(String[] args){
        for (int i = 10; i <= 20; i++){
            int square = i*i;

            System.out.println("Квадрат числа " + i + " = " + square);
        }

    }
}
