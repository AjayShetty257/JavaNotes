package com.lessons.may.week4;

public class AllAboutStrings {

    int v;

    public AllAboutStrings(int v) {
        this.v = v;
    }

    public void whatIsThis(AllAboutStrings a) {
        if (a == this)
            System.out.println("This represents the object for which the method is called..");
    }

    public static void main(String[] args) {

        AllAboutStrings a = new AllAboutStrings(1);
        //a.whatIsThis(a);
        //stringInMemoryConcepts();
        //stringsAreImmutable();
        //underStandingStringBuilder();
        underStringBuilderChaining();
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

        if (s2 == s4) {
            System.out.println("s2 & s4 Points to same string in pool..");
        } else {
            System.out.println("s2 & s4 Points to different strings in pool..");
        }

        if (s1.equals(s2)) {
            System.out.println("Equals only compare values..");
        } else {
            System.out.println("Equals doesn't compare values");
        }

        if (s1.equals(s3)) {
            System.out.println("Equals only compare values..");
        } else {
            System.out.println("Equals doesn't compare values");
        }
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

        String s4 = s1.substring(1, 3);
        System.out.println(s1);
        System.out.println(s4);
    }

    public static void underStandingStringBuilder() {
        String s = "Hello";
        s += " World";

        StringBuilder s1 = new StringBuilder("Hello");
        StringBuilder s2 = s1.replace(1, 4, "at");
        // StringBuilders are mutable objects. Calling replace method
        // on s1 modifies s1 directly in the same memory location

        //Will s1 and s2 print same value ? Yes, infact they are pointing to the same memory.
        System.out.println(s1);
        System.out.println(s2);

        //This will append to the existing memory for s1
        s1.append(" World");

        //Will s2 also print the modified value ?
        // Yes, as s1 and s2 were pointing to the same memory
        // and change occurred in the same memory
        System.out.println(s1);
        System.out.println(s2);
    }

    public static void underStringBuilderChaining() {
        // Why is StringBuilder method returning value when it is mutable. Its creates confusion ?
        String r = "Hello";
        r += " World";
      //  r = r.toUpperCase();
      //  System.out.println(r);
        r = r.replace("World", "Ajay");
        System.out.println(r);


        //To ease out multiple transformations, we use chaining
        // In chaining, the method called from the object returns the modified object (return this)


        StringBuilder chained = new StringBuilder("Hello");

        //To apply multiple transformations in a clean manner, we use chaining
        chained.append(" World")
                .replace(6,11, "Ajay");

        System.out.println(chained);
    }
}
