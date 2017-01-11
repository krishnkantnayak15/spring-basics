package com.allstate.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class MathTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void mathTest() throws Exception {
        float result = Math.square(5);
        assertEquals(25 , result,0 );
    }
}