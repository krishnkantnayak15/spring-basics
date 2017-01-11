package com.allstate.models;
import java.util.stream.Stream;

public class Math {
    public static int square(int x){
        return x * x;
    }
    public static long factorial(int num){
        return Stream.iterate(1L, n  ->  n  + 1)
                .limit(num).reduce(
                        (long) 1,
                (a, b) -> a * b);


    }
}