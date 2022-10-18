package com.dsvinka;

public class Cycles {
    public static void main(String[] args) {
        var x = 0;

        while (x < 5) {
            x += 1;
        }


        do {
            x += 1;
        }
        while (x < 5);


        for (var i = 0; i < 5; i++) {
            System.out.println(123);
        }

        int n = 10;
        int s = 0;
        int k;

        for (k = 1; k <= n; k++) {
            s += k * k;
        }

        var txt = "Сумма квадратов чисел от 1 до " + n + ": " + s;
        System.out.println(txt);
    }
}