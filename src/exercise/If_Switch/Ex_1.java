package exercise.If_Switch;

//Вивести парне число
//З двох чисел із різною парністю вивести на екран парне число. a, b - дані числа

public class Ex_1 {
    public static void main(String[] args){

        int a = 4;
        int b = 5;

        if (a % 2 == 0){
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
