package com.allstate.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.allstate.models.Home;

@RestController
public class HomeController {
    @RequestMapping(value = "/" ,method = RequestMethod.GET)
    public Home home(){
        Home h = new Home("Hello Spring");
        return h;
    }
}
