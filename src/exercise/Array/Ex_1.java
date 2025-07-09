package exercise.Array;

//Створіть масив, після чого знайдіть найменший елемент масиву

public class Ex_1 {
    public static void main(String[] args){

        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 5;
            System.out.println("Element " + i + " = " + arr[i]);
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println("Minimal element = " + min);
    }
}
