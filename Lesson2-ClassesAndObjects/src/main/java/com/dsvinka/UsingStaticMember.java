package com.dsvinka;

public class UsingStaticMember {
    public static void main(String[] args) {
        UsingStaticMemberModel.show();

        var objA = new UsingStaticMemberModel();
        var objB = new UsingStaticMemberModel();
        var objC = new UsingStaticMemberModel();

        UsingStaticMemberModel.show();
        objB.show();
        objC.show();
    }
}
