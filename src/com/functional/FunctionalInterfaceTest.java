package com.functional;

public class FunctionalInterfaceTest implements FunctionalInterfaceDemo1{

    @Override
    public void im_am_abstract() {
        System.out.println("I got overidedd");
    }

    @Override
    public void defaultm1() {

        System.out.println("I got overridedd and deafult keyword got removed");
    }

    @Override
    public void defaultm2() {

        System.out.println("I got overridedd and deafult keyword got removed");
    }

    //static methods will not get override
}
