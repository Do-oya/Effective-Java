package com.example.effetivejava.Chap2_GenerateObjectAndDestroy.item3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Singleton3Test {
    @Test
    @DisplayName("enum 사용")
    public void test() {
        Singleton3 instance1 = Singleton3.INSTANCE;
        Singleton3 instance2 = Singleton3.INSTANCE;

        assertSame(instance1, instance2);
    }
}
