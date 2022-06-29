package com.section5;

public class EvenDigitSum {


    public static  int getEvenDigitSum(int nubmber){

        int sumeven =0;

        if(nubmber<0){


            return  -1;
        }

        while (nubmber != 0) {

            int rem = nubmber%10;
            nubmber=nubmber/10;


            if (rem%2==0){

                sumeven=sumeven+rem;

            }


        }

        return sumeven;
    }











}
