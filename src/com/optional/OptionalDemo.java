package com.optional;

import java.util.Optional;

public class OptionalDemo {

    //To avoid NPE - null pointer exception
    //This is public final class
    //java.util package have introduce this
    //read more details - https://www.educative.io/edpresso/what-is-the-optional-class-in-java?aid=5082902844932096&utm_source=google&utm_medium=cpc&utm_campaign=edpresso-dynamic&utm_term=&utm_campaign=Dynamic+-+Edpresso&utm_source=adwords&utm_medium=ppc&hsa_acc=5451446008&hsa_cam=8092184362&hsa_grp=86276435689&hsa_ad=397226000870&hsa_src=g&hsa_tgt=aud-470210443636:dsa-837376625453&hsa_kw=&hsa_mt=b&hsa_net=adwords&hsa_ver=3&gclid=Cj0KCQjw24qHBhCnARIsAPbdtlKUCYDrIVDslvzLXqDHp5jwAttIRZoa3kSSrZ45yeyrebX7zB9vlzUaAkrxEALw_wcB
    public static void main(String[] args){

          Integer[] array = new Integer[3];
         // array[2] = 7;
          Optional<Integer> optional = Optional.ofNullable(array[2]);
          //dig out more optional methods
          if(optional.isPresent()){
              System.out.println(array[2].toString());
          }else{
              System.out.println("Else no value");
          }
    }
}
