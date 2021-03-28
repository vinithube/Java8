package com.functional;

@FunctionalInterface
public interface FunctionalInterfaceDemo1 {

    //functional interface which can have only one abstract method
    //also called as SAM - Single Abstract Method
    //any number of default and static methods

    public void im_am_abstract();  // only one abstract method required

    //public void im_am_Second_abstract(); //if you add second it will give you error

    //you have 2 default method
    public default void defaultm1(){
        System.out.println("first default method");
    }

    public default void defaultm2(){
        System.out.println("second default method");
    }

    //you have 2 static method
    public static void static1(){
        System.out.println("first static method");
    }

    public static void static2(){
        System.out.println("second static method");
    }
}
