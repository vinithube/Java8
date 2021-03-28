package com.lambda;

public class LambdaExpressionDemo {

    //its expression of instance of functional Interface

    public static void main(String args[]){

        LambdaInterface lambda = (int x) -> x+x;

        System.out.println(lambda.getAddition(8));
    }

}
