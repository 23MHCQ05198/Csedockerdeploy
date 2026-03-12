package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CsecontrollerTest {

    @Test
    void testAdd() {
        Csecontroller controller = new Csecontroller();
        assertEquals(8, controller.cseadd(5,3));
    }

    @Test
    void testMul() {
        Csecontroller controller = new Csecontroller();
        assertEquals(15, controller.csemul(5,3));
    }
}
