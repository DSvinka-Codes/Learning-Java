package windows;

import javax.swing.*;

public class WindowsInput {
    public static void main(String[] args) {
        // Заранее объявляем переменную.
        // Говорим жабе что у нас она вообще существует, и что нужно подготовиться к её использованию.
        // Можно делать такие объявления, можно не делать, по ситуации.
        // Конкретно в этой ситуации это не обязательно.
        // Хотя так мы сразу понимаем что у нас в коде будет использоваться именно такой список переменных.
        // Sting = Строка (не трусы)
        String text;

        // Получаем текст из окна.
        text = JOptionPane.showInputDialog("Введите букавки");

        JOptionPane.showMessageDialog(null, "Вы ввели такой текст:\n" + text, "tt", JOptionPane.WARNING_MESSAGE);
    }
}
