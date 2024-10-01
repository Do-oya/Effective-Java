package com.example.effetivejava.Chap2_GenerateObjectAndDestroy.item3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Singleton1Test {
    @Test
    @DisplayName("전통적 방식")
    public void test() {
        Singleton1 instance1 = Singleton1.INSTANCE;
        Singleton1 instance2 = Singleton1.INSTANCE;

        assertSame(instance1, instance2);
    }
}
