package com.allstate.controllers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


public class CoordinateControllerTest {
    @Autowired
    private MockMvc mvc;
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }
    @Test
    public void shouldSquareAnInteger() throws Exception {
        this.mvc.perform(get("/coordinate/distance/[{\"x1\":3, \"y1\":4},{\"x2\":5, \"y2\":6}]"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.distance", is(16)));
    }


}