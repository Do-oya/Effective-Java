package com.example.effetivejava.Chap2_GenerateObjectAndDestroy.item3;

public class Singleton1 {
    // 싱글톤 인스턴스를 미리 생성해 둠
    public static final Singleton1 INSTANCE = new Singleton1();

    // private 생성자로 외부에서 인스턴스 생성 불가
    private Singleton1() {}

    public void doSomething() {
        System.out.println("Doing something in the Singleton class");
    }

    public static void main(String[] args) {
        // Singleton.INSTANCE를 통해 싱클턴 객체에 접근
        Singleton1.INSTANCE.doSomething();
    }
}
