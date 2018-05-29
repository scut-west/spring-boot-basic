package com.example.demo.domain;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class FabonacciTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void should_return_1_when_input_1() throws Exception {
        int result = Fabonacci.getResult(1);
        assertEquals(1, result);
    }

    @Test
    public void should_return_3_when_input_4() throws Exception {
        int result = Fabonacci.getResult(4);
        assertEquals(3, result);
    }

    @Test
    public void should_throw_exception_when_input_less_0() throws Exception {
        exception.expect(Exception.class);
        exception.expectMessage("invaild input number");
        Fabonacci.getResult(-1);

    }
}
