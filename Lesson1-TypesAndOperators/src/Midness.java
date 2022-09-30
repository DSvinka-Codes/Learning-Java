import javax.swing.*;

public class Midness {
    public static void main(String[] args) {

        String tHeight, tMass, tAge;

        float nHeight, nMass;

        tHeight = JOptionPane.showInputDialog("Введите Рост: (в метрах)");

        nHeight = Float.parseFloat(tHeight);

        tMass = JOptionPane.showInputDialog("Введите Вес: (в кг)");

        nMass = Float.parseFloat(tMass);

        tAge = JOptionPane.showInputDialog("Введите возраст: ");

        var nAge = Integer.parseInt(tAge);

        float bmi = nMass/(nHeight*nHeight);

        bmi = Math.round(bmi * 100) / 100.0f;

        JOptionPane.showMessageDialog(null, "Ваш индекс:\n" + bmi, "Ваш результат", JOptionPane.WARNING_MESSAGE);

        //Если Меньше 16 - Пошел он нахъуй мне лень.
        //ЕСЛИ от 16 до 25
        //<18 Анорексия
        //<19 Дефицит массы тела
        //20-23 Нормальная масса тела
        //23-27 Избыточная масса тела
        //28-30 Ожирение Первой степени
        //30-35 Ожирение Второй степени
        //35-40 Ожирение Третьей степени
        //41 и более. Ожирение Четвертой степени

        //более 25 лет
        //<18 Анорексия
        //<19 Дефицит массы тела
        //20-26 Нормальная масса тела
        //26-28 Избыточная масса тела
        //28-31 Ожирение Первой степени
        //31-36 Ожирение Второй степени
        //36-41 Ожирение Третьей степени
        //41 и более Ожирение Четвертой степени

        String state;
        if (bmi < 18) {
            state = "Анорексия";
        }
        else if (bmi < 19) {
            state = "Дефицит массы тела";
        }
    }
}
