package com.allstate.models;

import com.allstate.controllers.HomeController;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(HomeController.class)
public class HomeTest {
    @Autowired
    private MockMvc mvc ;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }
    @Test
    public void objectTest() throws Exception {
        Home h = new Home("hi");
        assertEquals("hi",h.getMessage());
    }
    @Test
    public void helloMessageForGet() throws  Exception {

        this.mvc.perform(get("/")).andExpect(status().isOk()).andExpect(jsonPath("$.message" , is("Hello Spring")));

    }


}