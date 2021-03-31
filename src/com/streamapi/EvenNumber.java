package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {

    public static void main(String args[]){

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

         //all match
        boolean isMatching = numbers.stream().allMatch(n-> n>0);
        System.out.println(isMatching);

        List<Integer> twoEvenSquares =
                numbers.stream()
                        .filter(n -> {
                            System.out.println("filtering " + n);
                            return n % 2 == 0;
                        })
                        .map(n -> {
                            System.out.println("mapping " + n);
                            return n * n;
                        })
                        .limit(2)
                        .collect(Collectors.toList());
        System.out.println(twoEvenSquares);
    }

    //filter(Predicate): Takes a predicate (java.util.function.Predicate) as an argument and returns a stream including all elements that match the given predicate
    //distinct: Returns a stream with unique elements (according to the implementation of equals for a stream element)
    //limit(n): Returns a stream that is no longer than the given size n

    //skip(n): Returns a stream with the first n number of elements discarded
    //findFirst
    //findAny
    //.ifPresent(System.out::println);
}
