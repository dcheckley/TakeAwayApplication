package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WelcomeTest {

    @Test
    void justATest1() {

        var w = new Welcome();
        assertEquals("hello", w.justATest());
    }

}