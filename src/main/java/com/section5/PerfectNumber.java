package com.section5;

public class PerfectNumber {


    public static void main(String[] args) {



        boolean status =  isPerfectNumber(6);

        System.out.println(status);


    }

    public  static  boolean isPerfectNumber(int number){

        int factor =1;
        int sum=0;

        boolean flag = false;

        if (number<1){


            return  flag;
        }

        while (factor<number){

            if (number%factor==0){

                sum=sum+factor;
                System.out.println(factor);
            }
            factor++;
        }

        if (sum==number){

            flag=true;
            return  flag;
        }

        return  flag;
    }


}
