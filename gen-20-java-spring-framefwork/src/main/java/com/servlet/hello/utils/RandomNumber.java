package com.servlet.hello.utils;

public class RandomNumber {

    public static Long getRandom(long min, long max){
        long num = min + (long) (Math.random() * (max-min));
        return num;
    }

}
