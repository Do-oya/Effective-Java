package com.example.effetivejava.Chap2_GenerateObjectAndDestroy.item3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Singleton2Test {
    @Test
    @DisplayName("static 팩토리 메서드")
    public void test() {
        Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();

        assertSame(instance1, instance2);
    }
}
