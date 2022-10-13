package com.dsvinka;

import javax.swing.*;

public class ClassMethods {
    public static void main(String[] args) {
        var objA = new ClassMethodsModel();
        var objB = new ClassMethodsModel();

        objA.set(100, 'A');
        objB.set(200, 'B');

        JOptionPane.showMessageDialog(null, objA.getInfo(), "Первый объект", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, objB.getInfo(), "Второй объект", JOptionPane.INFORMATION_MESSAGE);
    }
}
