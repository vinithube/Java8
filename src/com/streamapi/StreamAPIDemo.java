package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIDemo {

    //It is used to handle streams of data inside collection
    //It is used to computation(math operation) over Data
    //filter() ,map(), collect()

    //intermediate //terminal operation
    // read more details - https://www.educative.io/blog/master-stream-api-and-beyond

    public static void main(String[] args){

           List<Person> list = new ArrayList<Person>();
           list.add(new Person(1,"John"));
           list.add(new Person(2,"Vinod"));
           list.add(new Person(3,"Thube"));

           //1. we want person who's id is >1
           list = list.stream().filter(p->p.getId() > 1)
                   .filter(p->p.getName().startsWith("V"))
                   .collect(Collectors.toList());
           //collect in new list ..else it will refer old list only
           System.out.println(list.size());
           System.out.println(list);
           //create new list of Id based on this list

//          List<Long> idlist = list.stream().map(p ->p.getId()).collect(Collectors.toList());
//
//          System.out.println(idlist.size());
//
//          System.out.println(idlist);
        

        //https://codingnconcepts.com/java/streams-in-java-8/

        
        List<String> fruits = Arrays.asList("mango", "apple", "banana", "grapes", "orange");

        //1 - Filter elements from List
        // convert list to stream
        // filter out grapes
        // collect the output and convert streams to a List
        List<String> result = fruits.stream()   //stream operation
                              .filter(fruit -> !fruit.equals("grapes"))  //intermediate operation
                              .collect(Collectors.toList());  //terminal operation
        result.forEach(System.out::println);

        System.out.println("-------------------------");
        //2 - Change all elements in List
        // stream () | map() | collect
        // convert list to stream
        // map to uppercase
        // collect the output and convert streams to a List

        List<String> result1 = fruits.stream()
                .map(f -> f.toUpperCase())
                .collect(Collectors.toList());
        result1.forEach(System.out::println);
        System.out.println("-------------------------");

        //3 - Sort all elements in List
        List<String> result2 = fruits.stream()  // convert list to stream
                               .sorted() //sort in alphabetic order
                               .collect(Collectors.toList()); // collect the output and convert streams to a List
        result2.forEach(System.out::println);
        System.out.println("-------------------------");

         //4 -  Multiple intermediate operations
         // convert list to stream
         // filter out grapes
         // map to uppercase
         // sort in alphabetical order
         // collect the output and convert streams to a List

        List<String> result3 = fruits.stream()              // convert list to stream
                .filter(fruit -> !"grapes".equals(fruit))   // filter out grapes
                .map(fruit -> fruit.toUpperCase())          // map to uppercase
                .sorted()                                   // sort in alphabetical order
                .collect(Collectors.toList());              // collect the output and convert streams to a List

        result3.forEach(System.out::println);

        System.out.println("-------------------------");

        //5 - Find elements in List
        // stream() | filter() | findAny() | orElse()
        String foundFruits = fruits.stream() // convert list to stream
                          .filter(fruit -> "mango".equals(fruit))   // we love mango
                          .findAny() // If `findAny` then return found
                          .map(fruit -> fruit.toUpperCase())
                          .orElse(null);  // If not found, return null
        System.out.println(foundFruits);

        System.out.println("-------------------------");




    }

}
