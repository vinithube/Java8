package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIDemo {

    //It is used to handle streams of data inside collection
    //It is used to computation(math operation) over Data
    //filter() ,map(), collect()

    //intermdiate //terminal operation

    public static void main(String[] args){

           List<Person> list = new ArrayList<Person>();
           list.add(new Person(1,"John"));
           list.add(new Person(2,"Vinod"));
           list.add(new Person(3,"Thube"));

           //1. we want person whos id is >1
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




    }

}
