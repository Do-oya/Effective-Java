package com.example.effetivejava.Chap2_GenerateObjectAndDestroy.item4;

public class MathUtils {
    // private 생성자 : 인스턴스화를 막음
    private MathUtils() {
        throw new AssertionError("Utility class");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
}
