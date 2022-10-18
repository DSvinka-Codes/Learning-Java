package com.dsvinka;

import java.util.Scanner;

public class IfElseSwitch {
    public static void main(String[] args) {

        var input = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        var sA = input.nextLine();
        var nA = Integer.parseInt(sA);
        System.out.print("Введите второе число: ");
        var sB = input.nextLine();
        var nB = Integer.parseInt(sB);
        System.out.print("Введите знак: ");
        var symbolC = input.nextLine();

        var result = 314159;

        switch (1) {
            case 1:
                // Super Mega MATHS
            case 2:
            case 3:
                // VERY Super Mega MATHS
                break;

            case 4:
                result = nA / nB;
                break;

            default:
                result = 666;
        };

        switch (symbolC) {
            case "+":
                result = nA + nB;
                break;

            case "-":
                result = nA - nB;
                break;
            case "*":
                result = nA * nB;
                break;
            case "/":
                result = nA / nB;
                break;
            default:
                result = 666;
        };

        result = switch (symbolC) {
            case "+" -> nA + nB;
            case "-" -> nA - nB;
            case "*" -> nA * nB;
            case "/" -> nA / nB;
            default -> 666;
        };

        System.out.println("Результат: " + result);
    }
}
