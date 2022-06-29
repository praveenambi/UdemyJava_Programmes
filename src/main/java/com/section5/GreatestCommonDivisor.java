package com.section5;

public class GreatestCommonDivisor {


    public static void main(String[] args) {


       int gcm =  getGreatestCommonDivisor(1010, 10);

        System.out.println(gcm);
    }

    public static  int getGreatestCommonDivisor(int first , int second){


        int devisor =1;
        int CommonDevisor=0;


        if (first<10 || second<10){


            return  -1;
        }

        while ((devisor<= first) && (devisor<= second)){

            if ((first%devisor==0) &&(second%devisor==0)){

                CommonDevisor=devisor;

            }

            devisor++;

        }

        return  CommonDevisor;
    }


}
