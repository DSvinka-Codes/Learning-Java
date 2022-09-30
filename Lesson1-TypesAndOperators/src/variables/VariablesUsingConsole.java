package variables;

import javax.swing.*;

public class VariablesUsingConsole {
    public static void main(String[] args) {
        // Числовая переменная:
        int number = 123;

        // Дробная переменная:
        double x1 = 32.1;
        float x2 = 40.3f;

        // Символьная переменная:
        char symbol = 'A';

        // Логическая переменная:
        boolean state = true;

        // Выводим всё в консоль
        System.out.println("Используемые переменные с помощью прямого указания типов:");

        System.out.println("Целое число: " + number);
        System.out.println("Дробное число 1: " + x1);
        System.out.println("Дробное число 2: " + x2);
        System.out.println("Символ: " + symbol);

        // Используем вывод в консоль с форматированием
        System.out.printf("\nЛогистическое значение: %s%n", state);
    }

    // Тута мы вместо прямого указания типов, мы указываем var.
    // Java сама заменит все Var на правильные типы.
    // Но стоит помнить что это не означает, что в переменную в которой было число, можно записать строку.
    public void runWithVar() {
        // Числовая переменная:
        var number = 123;

        // Дробная переменная:
        var x1 = 32.1;
        var x2 = 40.3f;

        // Символьная переменная:
        var symbol = 'A';

        // Логическая переменная:
        var state = true;

        // Выводим всё в консоль
        System.out.println("Используемые переменные с помощью Var:");

        System.out.println("Целое число: " + number);
        System.out.println("Дробное число 1: " + x1);
        System.out.println("Дробное число 2: " + x2);
        System.out.println("Символ: " + symbol);

        // Используем вывод в консоль с форматированием
        System.out.printf("\nЛогистическое значение: %s%n", state);
    }
}
