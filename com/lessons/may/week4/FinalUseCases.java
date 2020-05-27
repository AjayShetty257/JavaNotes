package com.lessons.may.week4;


/**
 * {@code final} keyword has three use cases.
 *
 * 1. A final class cannot be extended i.e. Inheritance not allowed
 * 2. Used to declare a constant, usually it is public and static as well
 * 3. Used to declare a instance variable immutable i.e it is to be initialized inside constructor
 *      and cannot be changed after that. Secondly, this makes the object immutable.
 * 4. Used to make a method non overridable
 *
 * @since 28-05-2020
 */

//Use case 1 : Below final class cannot be extended by any other class
public final class FinalUseCases {

    //Use case 2 : Constant
    public static final double GRAVITY_FORCE = 9.8d;

    // Use case 3 : Instance Variable can only be set in constructor
    //              and then cannot be changed.
    private final String personName;
    private final String aadharCard;

    public FinalUseCases(String personName, String aadharCard) {
        this.personName = personName;
        this.aadharCard = aadharCard;
    }

    //Use case 4 : Below method cannot be overridden by inherited class
    public final void abc() {

    }

    public static void main(String[] args) {
        FinalUseCases f = new FinalUseCases("Rahul J S", "3515 4441 3344");

        //Does not let below operation. Gives CE.
        //f.aadharCard = "34";
    }
}
