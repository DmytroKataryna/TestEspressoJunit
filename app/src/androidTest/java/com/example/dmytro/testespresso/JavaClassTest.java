package com.example.dmytro.testespresso;

import junit.framework.TestCase;

import org.junit.Test;

public class JavaClassTest extends TestCase {

    private JavaClass javaClass;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        javaClass = new JavaClass();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void testAdd() {
        int actual = javaClass.add(2, 2);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void testMult() {
        int actual = javaClass.multy(3, 2);
        int expected = 6;
        assertEquals(expected, actual);
    }
}
