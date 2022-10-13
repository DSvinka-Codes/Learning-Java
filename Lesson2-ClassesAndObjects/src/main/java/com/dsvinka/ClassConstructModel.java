package com.dsvinka;

public class ClassConstructModel {
    int number;
    char symbol;

    ClassConstructModel() {
        this.number = 100;
        this.symbol = 'B';
    }

    ClassConstructModel(int number, char symbol) {
        this.number = number;
        this.symbol = symbol;
    }

    void show() {
        System.out.println("Значения полей " + number + " и " + symbol);
    }
}
