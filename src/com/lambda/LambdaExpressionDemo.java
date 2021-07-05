package com.lambda;

public class LambdaExpressionDemo {

    //its expression of instance of functional Interface
    //what is lambda expression
    //Answer - https://www.educative.io/blog/java-lambda-expression-tutorial?aid=5082902844932096&utm_source=google&utm_medium=cpc&utm_campaign=blog-dynamic&utm_term=&utm_campaign=Dynamic+-+Blog&utm_source=adwords&utm_medium=ppc&hsa_acc=5451446008&hsa_cam=8090938743&hsa_grp=82569843726&hsa_ad=396819070286&hsa_src=g&hsa_tgt=aud-475527062782:dsa-837938538428&hsa_kw=&hsa_mt=b&hsa_net=adwords&hsa_ver=3&gclid=Cj0KCQjw24qHBhCnARIsAPbdtlIPHC-v19HUNfVZ0rqk8Bzv8i3gtwigOC0SNjZmC1SnrDNoivA09GIaAie7EALw_wcB

    public static void main(String args[]){

        LambdaInterface lambda = x -> x+x;
        //why this kind of implemetation

        System.out.println(lambda.getAddition(20));
    }

}
