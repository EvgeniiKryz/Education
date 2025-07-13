package exercise.CollectionsFramework;

//Створіть ArrayList з ім'ям "digits".
//
//Виконайте дії:
//додайте 4 елементи;
//створіть копію масиву;
//з копії видаліть передостанній елемент;
//встановіть значення "5.2" для елемента за індексом 2;
//виведіть усі елементи в консоль.

import java.util.ArrayList;

public class Ex_2 {
    public static void main(String[] args) {

        ArrayList<Float> digits = new ArrayList<>();

        digits.add(1.5f);
        digits.add(2.3f);
        digits.add(5.8f);
        digits.add(3.1f);
        System.out.println("Digits: " + digits);

        ArrayList<Float> new_digits = (ArrayList<Float>) digits.clone();

        int n = new_digits.size() - 2;
        new_digits.remove(n);

        new_digits.set(2, 5.2f);

        System.out.println("New_digits: " + new_digits);
    }
}
