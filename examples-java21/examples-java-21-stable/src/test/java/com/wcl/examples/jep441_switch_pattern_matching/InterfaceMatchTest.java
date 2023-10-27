package com.wcl.examples.jep441_switch_pattern_matching;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class InterfaceMatchTest {
    private InterfaceMatch testSubject;

    @BeforeEach
    public void setTestSubject() {
        testSubject = new InterfaceMatch();
    }

    @Test
    public void givenDirectorProvided_whenInvoked_DirectorRemunerationReturned() {
        assertEquals(1150000,
                      testSubject.matchObject(new Director()));
    }

    @Test
    public void givenManagerProvided_whenInvoked_ManagerRemunerationReturned() {
        assertEquals(775000,
                testSubject.matchObject(new Manager()));
    }

    @Test
    public void givenWorkerProvided_whenInvoked_thenWorkerRemunerationReturned() {
        assertEquals(65000,
                testSubject.matchObject(new Worker()));
    }

    @Test
    public void givenNullProvided_whenInvoked_thenExceptionShouldBeThrown() {
        final Exception thrown = assertThrows(IllegalArgumentException.class,
                () -> testSubject.matchObject(null));

        assertEquals("No employee supplied", thrown.getMessage());
    }

    @Test
    public void givenDefaultEmployeeProvided_whenInvoked_thenZeroRemunerationReturned() {
        assertEquals(0,
                testSubject.matchObject(new TestDefaultEmployee()));
    }

    static class TestDefaultEmployee implements Employee {
        @Override
        public int getSalary() {
            return -1;
        }
    }
}
