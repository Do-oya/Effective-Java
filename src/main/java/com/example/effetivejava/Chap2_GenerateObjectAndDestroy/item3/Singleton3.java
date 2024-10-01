package com.example.effetivejava.Chap2_GenerateObjectAndDestroy.item3;

public enum Singleton3 {
    INSTANCE;

    public void doSomething() {
        System.out.println("Singleton3");
    }

    public static void main(String[] args) {
        Singleton3.INSTANCE.doSomething();
    }
}
