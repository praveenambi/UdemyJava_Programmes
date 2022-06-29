package com.section5;

public class FactorPrinter {

    public static void main(String[] args) {
        printFactors(6);



    }


    public  static  void printFactors(int number){

        int factor=1;


        if (number<1){

            System.out.println("Invalid Value");
        }


        while (factor<=number){

            if (number%factor==0){


                System.out.println(factor);
            }
            factor++;


        }

    }


}
