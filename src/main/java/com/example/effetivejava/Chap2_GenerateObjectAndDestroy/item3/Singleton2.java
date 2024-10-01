package com.example.effetivejava.Chap2_GenerateObjectAndDestroy.item3;

public class Singleton2 {
    // private 인스턴스 변수
    private static final Singleton2 INSTANCE = new Singleton2();

    // private 생성자로 외부에서 인스턴스 생성 불가
    private Singleton2() {}

    // 정적 팩터리 메서드
    public static Singleton2 getInstance() {
        return INSTANCE;
    }

    public void doSomething() {
        System.out.println("Singleton2 doSomething");
    }

    public static void main(String[] args) {
        // getInstance()로 싱글턴 객체에 접근
        Singleton2 singleton2 = Singleton2.getInstance();
        singleton2.doSomething();
    }
}
