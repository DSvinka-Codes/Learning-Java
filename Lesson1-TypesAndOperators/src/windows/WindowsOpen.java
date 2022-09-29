package windows;// Импортируем библиотеку, которая отвечает за окошки.
// Она в Java встроенная, её докачивать не требуется.
import javax.swing.*;

public class WindowsOpen {
    public void run() {
        var title = "Залолильная Хистория";
        var text = "Я лоля, Ты лоля, Мы лоли";

        // null - указываем что наше окно не привязано к другому окну.
        // text - указываем текст окна.
        // title - указываем заголовок окна.
        // JOptionPane.WARNING_MESSAGE - указываем иконку окна.
        JOptionPane.showMessageDialog(null, text, title, JOptionPane.WARNING_MESSAGE);
    }
}
