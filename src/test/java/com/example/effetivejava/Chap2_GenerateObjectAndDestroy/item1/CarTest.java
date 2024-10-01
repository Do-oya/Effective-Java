package com.example.effetivejava.Chap2_GenerateObjectAndDestroy.item1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    @Test
    @DisplayName("정적 팩터리 메서드를 사용하여 Car 객체가 제대로 생성 되었는지 테스트")
    public void testCarCreation() {
        // 정적 팩터리 메서드를 사용하여 Car 객체 생성
        Car car = Car.of("Tesla", "Red");

        // car 객체가 null 아니어야 함
        assertNotNull(car);

        // car 객체의 모델과 색상이 예상대로 설정되었는지 확인
        assertTrue(car.toString().contains("Tesla"));
        assertTrue(car.toString().contains("Red"));
    }

    @Test
    @DisplayName("결과가 올바르게 나오는지 테스트")
    public void testCarToString() {
        Car car = Car.of("BMW", "Blue");
        String expected = "Car [model=BMW, color=Blue]";
        assertEquals(expected, car.toString());
    }
}
