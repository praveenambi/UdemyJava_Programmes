package com.section4;

public class DecimalComparator {

    public  static  boolean areEqualByThreeDecimalPlaces(double a , double b){


        int first = (int) (a *1000);
        int second = (int) (b *1000);


        if (first==second){

            return  true;
        }else{

            return  false;
        }



    }
}
