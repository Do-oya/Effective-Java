package com.example.effetivejava.Chap2_GenerateObjectAndDestroy.item6;

public class BooleanExample {
    public static void main(String[] args) {
        Boolean b1 = Boolean.valueOf(true);
        Boolean b2 = Boolean.valueOf(true);

        System.out.println(b1 == b2);
    }
}
