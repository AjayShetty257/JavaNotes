package com.lessons.may.week4;
/**
 * This snippet has basics of 8 wrapper classes
 * for all the 8 primitive data types
 * Wrapper classes are for two purposes
 * 1. You can convert or use any primitive class to a reference type and use it as an object
 * 2. It has specific helper methods (static methods) that performs standard tasks
 *
 * @since 28-05-2020
 * */
public class WrapperClasses {
    public static void main(String[] args) {

        // Four datatypes for whole numbers
        byte b = 1;
        Byte b1 = b;

        short s = 1;
        Short s1 =  s;

        int i = 5;
        Integer i1 = 1;

        long l = 123123;
        Long l1 = l;

        System.out.println(Long.MIN_VALUE);

        //Two numbers for decimals
        float f = 12345.011f;
        Float f1 = f;

        double d = 1d;
        Double d1 = d;

        //One for character literal
        char c = '!';
        Character c1 = c;

        //One for boolean
        boolean bool = true;
        Boolean bool1 = bool;
        String s11 = bool+ "";

        System.out.println(s11);
    }

}
