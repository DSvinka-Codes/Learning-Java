package console;

import java.util.Scanner;

public class ConsoleInput {
    public void run() {
        // Инициализируем сканер
        var input = new Scanner(System.in);

        // Переменные для названия дня недели и месяца
        // Да, да, если нужно объявить 2+ переменной одно и того же типа, можно их указать через запятую.
        // Это тоже самое что:
        // - String day;
        // - String month;

        String day, month;

        // Отправляем в консоль сообщение без переноса строки
        System.out.print("Укажите день недели: ");

        // Ожидаем ввода с консоли.
        day = input.nextLine();

        // Отправляем в консоль сообщение без переноса строки
        System.out.print("Укажите месяц: ");

        // Ожидаем ввода с консоли.
        month = input.nextLine();

        // А вот и ответ
        var text = "Сегодня "+day+", месяц - "+month;

        System.out.println(text);
    }
}
