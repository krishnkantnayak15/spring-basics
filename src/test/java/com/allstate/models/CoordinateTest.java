package com.allstate.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by localadmin on 11/01/17.
 */
public class CoordinateTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void distanceTest() throws  Exception {
        Coordinate c = new Coordinate(0,0,0,2);
        double result = Coordinate.distance(c);
        assertEquals(result,2,0);
    }

    @Test
    public void slopeTest() throws  Exception {
        Coordinate c = new Coordinate(2,4,4,8);
        double result = Coordinate.distance(c);
        assertEquals(result,4.4,.1);
    }

    @Test
    public void intercepterTest() throws  Exception {
        Coordinate c = new Coordinate(2,4,4,8);
        double result = Coordinate.intercepter(c);
        assertEquals(result,-6,.1);
    }

}