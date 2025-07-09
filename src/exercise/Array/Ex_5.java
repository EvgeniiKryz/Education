package exercise.Array;

//Виведіть через цикл масив, що складається з чисел. Виводьте не лише значення елементів, а й індекси елементів.
//{-14, 23, 9, -4, 12, -1}

public class Ex_5 {
    public static void main(String[] args){

        int arr[] = new int[] {-14, 23, 9, -4, 12, -1};
        for (int i = 0; i < arr.length; i++){
            System.out.println("Element " + i + " = " + arr[i]);
        }
    }
}
