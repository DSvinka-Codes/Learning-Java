package com.dsvinka;

public class MethodOverloadingModel {
    int number;
    char symbol;

    void set(int number) {
        this.number = number;
    }

    void set(char symbol) {
        this.symbol = symbol;
    }

    void set(int number, char symbol) {
        this.set(number);
        this.set(symbol);
    }

    void set() {
        this.set(0, 'A');
    }

    void show() {
        System.out.println("Значение полей " + this.number + " и " + this.symbol);
    }

    void show(String txt) {
        System.out.println(txt + ": Значение полей " + this.number + " и " + this.symbol);
    }

    void show(String txtNumber, String txtSymbol) {
        System.out.println(txtNumber + ": " + this.number);
        System.out.println(txtSymbol + ": " + this.symbol);
    }
}
