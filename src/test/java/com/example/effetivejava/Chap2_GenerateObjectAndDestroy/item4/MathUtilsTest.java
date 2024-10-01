package com.example.effetivejava.Chap2_GenerateObjectAndDestroy.item4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    @DisplayName("리플렉션을 통한 인스턴스화 테스트")
    public void testConstructorCannotBeInvoked() {
        // 리플렉션을 사용하여 MathUtils의 생성자를 얻음
        Constructor<MathUtils> constructor = null;
        try {
            constructor = MathUtils.class.getDeclaredConstructor();
            constructor.setAccessible(true);  // private 생성자 접근 허용
            constructor.newInstance();        // 인스턴스 생성 시도
            fail("Exception should have been thrown");  // 여기 도달하면 실패
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            // AssertionError가 발생하는지 확인
            assertTrue(e.getCause() instanceof AssertionError);
        }
    }

    @Test
    public void testAdd() {
        // MathUtils의 static 메서드가 올바르게 동작하는지 테스트
        assertEquals(5, MathUtils.add(2, 3));
    }

    @Test
    public void testSubtract() {
        // MathUtils의 static 메서드가 올바르게 동작하는지 테스트
        assertEquals(1, MathUtils.subtract(3, 2));
    }
}