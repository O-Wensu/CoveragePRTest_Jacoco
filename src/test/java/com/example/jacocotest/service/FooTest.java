package com.example.jacocotest.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FooTest {
    private Foo foo = new Foo();

    @Test
    public void partiallyCoveredHelloMethodTest() {
        String actual = foo.hello("펭");
        assertEquals(actual, "하");
    }
}