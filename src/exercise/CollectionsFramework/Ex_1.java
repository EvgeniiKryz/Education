package exercise.CollectionsFramework;

//Створіть порожню колекцію «ArrayList» із типом даних «Float»
// та порожню колекцію «LinkedList» із типом даних «Boolean».
//
//За допомогою методу add помістіть у кожний по 4 елементи.
//За допомогою циклу for, а також циклу while виведіть усі елементи в консоль.

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex_1 {
    public static void main(String[] args) {

        ArrayList<Float> numbers = new ArrayList<>();
        LinkedList<Boolean> probability = new LinkedList<>();

        numbers.add(1.2f);
        numbers.add(2.5f);
        numbers.add(3.7f);
        numbers.add(5.5f);

        probability.add(true);
        probability.add(false);
        probability.add(false);
        probability.add(true);

        System.out.println("Numbers:");
        for (Float i : numbers) {
            System.out.print(i);
        }

        System.out.println();

//        int i;      not initialized
//        int i = 0;  initialized

        int i = 0;
        int n = probability.size();
        System.out.println("Probability:");
        while (i < n) {
            System.out.println(probability.get(i));
            i++;
        }
    }
}
