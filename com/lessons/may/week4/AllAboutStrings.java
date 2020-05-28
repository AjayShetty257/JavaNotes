package com.lessons.may.week4;

public class AllAboutStrings {

    public static void main(String[] args) {

        stringInMemoryConcepts();
        stringsAreImmutable();

    }

    private static void stringsAreImmutable() {
        String s11 = "Hello";
        String s22 = "Hello";


        s11.replace("H", "T");
        System.out.println(s22);

        String s1 = "Hello";

        String s2 = s1.replace("H", "T");
        System.out.println(s1);
        System.out.println(s2);

        String s3 = s1.toUpperCase();
        System.out.println(s1);
        System.out.println(s3);

        String s4 = s1.substring(1,3);
        System.out.println(s1);
        System.out.println(s4);
    }


    private static void stringInMemoryConcepts() {
        String s1 = "Hello";
        String s2 = new String("Hello");
        String s3 = "Hello";
        String s4 = new String("Hello");

        System.out.println("s1 : Literal initialization of Hello");
        System.out.println("s2 : Constructor initialization of Hello");
        System.out.println("s3 : Literal initialization of Hello");
        System.out.println("s4 : Constructor initialization of Hello");

        if (s1 == s2) {
            System.out.println("s1 & s2 Points to same string in pool..");
        } else {
            System.out.println("s1 & s2 Points to different strings in pool..");
        }

        if (s1 == s3) {
            System.out.println("s1 & s3 Points to same string in pool..");
        } else {
            System.out.println("s1 & s3 Points to different strings in pool..");
        }

        if(s2 == s4) {
            System.out.println("s2 & s4 Points to same string in pool..");
        } else {
            System.out.println("s2 & s4 Points to different strings in pool..");
        }

        if(s1.equals(s2)) {
            System.out.println("Equals only compare values..");
        } else {
            System.out.println("Equals doesn't compare values");
        }

        if(s1.equals(s3)) {
            System.out.println("Equals only compare values..");
        } else {
            System.out.println("Equals doesn't compare values");
        }
    }
}
