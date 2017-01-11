package com.allstate.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.allstate.models.Triangle;
import java.util.*;

@RestController
public class TriangleController {
    @RequestMapping(value = "triangle/area" , method = RequestMethod.POST)
    public double  area(@RequestBody List<Triangle> triangle){
        System.out.println(triangle);
        return Triangle.area(triangle);

    }

}
