package com.wcl.examples.jep441_switch_pattern_matching;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObjectMatchTest {
    private ObjectMatch testSubject;

    @BeforeEach
    public void setTestSubject() {
        testSubject = new ObjectMatch();
    }

    @Test
    public void givenIntegerProvided_whenInvoked_IntegerMessageReturned() {
        assertEquals("Integer passed in",
                      testSubject.matchObject(Integer.valueOf(5)));
    }

    @Test
    public void givenNullProvided_whenInvoked_NMullMessageReturned() {
        assertEquals("Null passed in",
                testSubject.matchObject(null));
    }

    @Test
    public void givenOtherClassProvided_whenInvoked_NMullMessageReturned() {
        assertEquals("StringBuilder passed in",
                testSubject.matchObject(new StringBuilder()));
    }}
