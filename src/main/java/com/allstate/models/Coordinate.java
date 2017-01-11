package com.allstate.models;


public class Coordinate {

    private int x1 ;
    private int y1 ;
    private int x2 ;
    private int y2 ;

    private static  double slope = 0.0;

    public Coordinate(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public static double distance(Coordinate c){
        return  Math.sqrt(Math.pow(c.getY2()-c.getY1(),2)+ Math.pow(c.getX2()-c.getX1(),2));
    }

    public static double slope(Coordinate c){

        return   (c.getY2()-c.getY1()/c.getX2()-c.getX1());

    }

    public static double intercepter(Coordinate c){

       slope =  (c.getY2()-c.getY1()/c.getX2()-c.getX1());
         return  (c.getY1() - slope * c.getX1());
    }
}
