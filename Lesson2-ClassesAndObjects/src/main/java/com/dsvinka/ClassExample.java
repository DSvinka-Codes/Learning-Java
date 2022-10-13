package com.dsvinka;

import javax.swing.*;

// Создаём публичный класс с именем ClassExample.
public class ClassExample {
    public static void main(String[] args) {
        var obj = new ClassExampleModel();
        obj.number = 100;
        obj.symbol = 'A';

        var text = "Число: " + obj.number;
        text += "\nСимвол: " + obj.symbol;

        JOptionPane.showMessageDialog(null, text);
    }
}

