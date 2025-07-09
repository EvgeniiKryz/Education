package exercise.For;

//Вивести у циклі
//Виведіть стовпець чисел від 25 до 29 включно із пропуском числа 27.
//
//Реалізуйте програму за допомогою циклів for та do while.

public class Ex_2 {
    public static void main(String[] args){
        for (int i = 25; i <= 29; i++){
            if(i == 27)
                continue;

            System.out.println(i);
        }

    }
}
