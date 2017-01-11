package com.allstate.models;
import java.util.stream.Stream;

public class Math {

     private static  int a=0;
     private  static  int b=1;
    public static int square(int x){
        return x * x;
    }
    public static long factorial(int num){
        return Stream.iterate(1L, n  ->  n  + 1)
                .limit(num).reduce(
                        (long) 1,
                (a, b) -> a * b);


    }
     public static  int fibonacci(int index){
         if(index == 0)
             return 0;
         else if(index == 1)
             return 1;
         else
             return fibonacci(index-1)+fibonacci(index-2);
     }

}

