package com.example.effetivejava.Chap2_GenerateObjectAndDestroy.item6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringExampleTest {

    @Test
    public void testStringEquality() {
        String s1 = "hello"; // 리터럴로 정의된 문자열
        String s2 = "hello"; // 같은 리터럴을 가리키는 문자열

        // 두 문자열이 동일한 객체인지 확인 (String Pool 덕분에 동일한 참조를 가짐)
        assertEquals(true, s1.equals(s2)); // 문자열 내용이 같아야 함
        assertEquals(true, s1 == s2); // 참조도 같아야 함 (String Pool)
    }
}