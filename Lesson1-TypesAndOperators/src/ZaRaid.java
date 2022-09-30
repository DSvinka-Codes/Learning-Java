import javax.swing.*;

public class ZaRaid {
    public static void main(String[] args) {
        // Спрашиваем какой рост у человека
        var tHeight= JOptionPane.showInputDialog("Рост (в метрах)"); // "1.30"
        // Спрашиваем какой вес у человека
        var tMass = JOptionPane.showInputDialog("Вес"); // "40"

        // Убираем кавычки из высоты
        var nHeight = Float.parseFloat(tHeight); // 1.30
        // Убираем кавычки из массы
        var nMass = Float.parseFloat(tMass); // 40

        // Вычисляем
        float bmi = nMass/(nHeight*nHeight); // 2.39398172
        // Округляем
        bmi = Math.round(bmi * 100) / 100.0f; // 2.39

        // Выводим куда-то.
        // Вес = Mass
        // Рост = Height

        var text = "Ваш вес: " + nMass;
        text += "\nВаш рост: " + nHeight;
        text += "\nВаш индекс: " + bmi;

        JOptionPane.showMessageDialog(null, text);


    }
}
