package com.section4;

public class TeenNumberChecker {


    public static  boolean hasTeen(int a , int b , int c ){

        if (isTeen(a) || isTeen(b) || isTeen(c) ){

            return  true;
        }
        return  false;
    }


    public  static  boolean isTeen(int num){

        if (num>=13 && num<=19){


            return  true;
        }

        return  false;

    }





}
