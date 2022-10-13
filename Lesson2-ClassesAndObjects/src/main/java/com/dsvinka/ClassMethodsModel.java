package com.dsvinka;

public class ClassMethodsModel {
    int number;
    char symbol;

    public void set(int number, char symbol) {
        this.number = number;
        this.symbol = symbol;
    }

    public String getInfo() {
        var text = "Число: " + this.number;
        text += "\nСимвол: " + this.symbol;

        return text;
    }
}
