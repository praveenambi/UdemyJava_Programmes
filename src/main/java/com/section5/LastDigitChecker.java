package com.section5;

public class LastDigitChecker {


    public static boolean isValid(int number){

        if (number>=10 && number<=1000){

            return  true;
        }


        return  false;
    }


    public static  boolean hasSameLastDigit(int a, int b , int c){

        boolean flag = false;

        if (isValid(a) && isValid(b)  && isValid(c)){

            if ((a%10==b%10) || (b%10==c%10) || (a%10==c%10)){

                flag=true;


            }

            return  flag;

        }


        return  flag;
    }











}
