package org.working;

public class Main2 {
    // Найти максимальный элемент в массиве из сгенерированных чисел

    // Имеется массив из 12 чисел.
    // Определите какой элемент является в этом массиве максимальный.
    public static void main(String[] args) {
        int[] numbers = {5, 12, 90, 80, 99, 38, 71, 59, 45, 12, 67, 85};

        int maxNum = numbers[0];

        for (int number: numbers){
            if (number > maxNum) {
                maxNum = number;
            }
        }
    }
}
