package com.section4;

public class SpeedConverter {


    public static void main(String[] args) {
        System.out.println(Math.round(0.621371));



        printConversion(95.75);


        System.out.println("To miles per hour "+toMilesPerHour(95.75));
    }


    public static long toMilesPerHour(double kilometersPerHour) {
        long result;

        if (kilometersPerHour < 0) {


            return -1;
        }

        double res = kilometersPerHour/1.609;

        result = Math.round(res);


        return result;

    }


    public static void printConversion(double kilometersPerHour) {


        if (kilometersPerHour < 0) {

            System.out.println("Invalid Value");
        } else {


//
//            long rounded  = Math.round(0.621371);
//
//            double res = kilometersPerHour * rounded;

            long res2 =toMilesPerHour(kilometersPerHour);

            System.out.println(kilometersPerHour + " km/h = " + res2 + " mi/h");


        }
    }

}