package com.allstate.controllers;


import com.allstate.models.Coordinate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoordinateController {
    @RequestMapping(value = "coordinate/distance" , method = RequestMethod.POST)
    public double  distance(@RequestBody Coordinate c){

        return Coordinate.distance(c);

    }

}
