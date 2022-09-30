package windows;

import javax.swing.*;

public class WindowsOpenWithInput {
    public static void main(String[] args) {
        // Записываем заголовок
        var title = JOptionPane.showInputDialog(null, "Заголовок окна", "Заголовок", JOptionPane.QUESTION_MESSAGE);

        // Записываем текст
        var text = JOptionPane.showInputDialog(null, "Текст окна", "Текст", JOptionPane.QUESTION_MESSAGE);

        // Выводим результат
        JOptionPane.showMessageDialog(null, text, title, JOptionPane.INFORMATION_MESSAGE);
    }
}
