package com.allstate.models;
import java.util.*;

public class Triangle {
    private int height ;
    private int width ;

    public Triangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getArea(){
        return (int)(this.height * this.width *  0.5);
    }
    public static double area(List<Triangle> triangles){
        double result = 0;
        for (int i = 0; i < triangles.size(); i++) {
           result += triangles.get(i).getHeight()* triangles.get(i).getWidth()*0.5;
        }
        return  result;

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
