package com.section4;

public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {


        printYearsAndDays(561600);
    }

    public  static  void printYearsAndDays(long minutes){

        // long mins = 561600;

        if (minutes<0){


            System.out.println("Invalid Value");
        }

        int hrs = (int) (minutes/60);
        int days = hrs/24;

        int year = days/365;
        int remaindays = days%365;


        System.out.println(minutes+" min = "+year+" y and "+remaindays+" d");


        // System.out.println("days" + days);
        //long reminMins = mins-(mins%60);

        //  System.out.println(hrs);
        // System.out.println(reminMins);


    }

}
