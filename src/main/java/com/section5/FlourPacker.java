package com.section5;

public class FlourPacker {

    public static void main(String[] args) {


        boolean status =  canPack(-3,2,11);
        System.out.println(status);

    }


    public  static  boolean canPack(int bigCount, int smallCount,int goal){


        boolean flag = false;

        if ( (bigCount<0) || (smallCount<0) || (goal<0)){
            return  flag;
        }


        int totalbiGcount = bigCount*5;

        if(goal > totalbiGcount + smallCount) {
            return false;
        }

        if((goal % 5) > smallCount) {
            return false;
        }
        return true;

    }


}
