package exercise.Array;

//Виведіть двовимірний масив на екран за допомогою циклів for. Оформіть все у вигляді матриці.
// Ось сам масив:
// int[][] numbers = {
//	{2, 45, 91},
//	{90, 47, 82},
//	{10, 5, 32},
//	{8, 78, 30},
//	{25, 1, 27},
//	{38, 82, 83}
//};

public class Ex_7 {
    public static void main(String[] args){

        int numbers[][] = {
                {2, 45, 91},
                {90, 47, 82},
                {10, 5, 32},
                {8, 78, 30},
                {25, 1, 27},
                {38, 82, 83}
        };

        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers[i].length; j++){

                System.out.print(numbers[i][j] +  " ");
            }
            System.out.println();
            System.out.print("123");
        }

    }
}
