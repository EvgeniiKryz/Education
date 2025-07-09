package exercise.Array;

//Створіть тривимірний масив, що складається з чисел.
//
//Встановіть 23 для одного з елементів. Виведіть цей елемент на екран.

public class Ex_3 {
    public static void main(String[] args){

        int arr [][][] = new int[2][2][2];
        arr [0][1][0] = 15;
        System.out.println(arr[0][1][0]);
    }
}
