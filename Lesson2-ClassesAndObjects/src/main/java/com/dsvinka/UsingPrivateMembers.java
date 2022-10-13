package com.dsvinka;

public class UsingPrivateMembers {
    public static void main(String[] args) {
        var objA = new UsingPrivateMembersModel("Alpha");
        var objB = new UsingPrivateMembersModel("Bravo");
        var objC = new UsingPrivateMembersModel("Charlie");

        objA.show();
        objB.show();
        objC.show();

        objB.set("Второй Объект");
        objB.show();
    }
}
