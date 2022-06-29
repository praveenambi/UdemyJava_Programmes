package com.section4;

public class AreaCalculator {


    public  static double  area(double radius){

        if (radius<0){

            return -1.0;
        }


        return  radius*radius*Math.PI;

    }


    public  static double  area(double x,double y){

        double rad=-1.0;

        if (x>=0 && y>=0){

            rad= x*y;

            return rad;
        }

        return  rad;
    }


}
