package exercise.Array;

//Створіть масив, після чого знайдіть суму негативних елементів масиву

public class Ex_2 {
    public static void main(String[] args){
        int arr[] = new int[] {-5, 2, 8, -9, -1};
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0){
                sum = sum + arr[i];
            }
        }
        System.out.println("Sum negative elements: " + sum);

    }
}
