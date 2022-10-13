package com.midness;

public class Main {
    public static void main(String[] args) {
        var Midness = new PersonModel("Midness", 16);

        var Astronik = Midness.CopyModel();
        Astronik.Name = "Astronik";
        Astronik.Password = "СаняХуйСоси";

        System.out.println(Midness.getUserInfo());
        System.out.println();
        System.out.println(Astronik.getUserInfo());

    }
}
