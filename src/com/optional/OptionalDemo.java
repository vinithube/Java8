package com.optional;

import java.util.Optional;

public class OptionalDemo {

    //To avoid NPE - null pointer exception
    //This is public final class

    public static void main(String[] args){

          Integer[] array = new Integer[3];
         // array[2] = 7;
          Optional<Integer> optional = Optional.ofNullable(array[2]);
          if(optional.isPresent()){
              System.out.println(array[2].toString());
          }else{
              System.out.println("Else no value");
          }
    }
}
