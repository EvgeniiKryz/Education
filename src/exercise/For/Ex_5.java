package exercise.For;


//Створіть цикл від -7 до 12. Виводьте у консоль лише кожне третє число з пропуском чисел -1, 5 та 11.
//
//Реалізуйте програму за допомогою циклів for та do while.

public class Ex_5 {
    public static void main(String[] args){

        for (int i = -7; i <= 12; i += 3){
            if (i == -1)
                continue;
            else if (i == 5) {
                continue;

            } else if (i == 11) {
                continue;

            }
            System.out.println("Elements " + i);
        }
    }
}
