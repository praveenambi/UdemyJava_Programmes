package com.section5;

import java.util.Scanner;

public class InputCalculator {


    public static void main(String[] args) {


        inputThenPrintSumAndAverage();


       //double rounded =  Math.round(3.666666666666666666);



        //System.out.println((int) rounded);

    }

    public static void inputThenPrintSumAndAverage(){


        int sum =0;
        float avg =0;
        int count=0;
        double avarage = 0;
        Scanner scan = new Scanner(System.in);
        //System.out.println("Please enter the values");



        while (scan.hasNextInt()){

            if (scan.hasNextInt()){

                int input = scan.nextInt();
                sum=sum+ input;

                count++;
            }else  if (count==0){

                System.out.println("SUM = 0 AVG = 0");


            }

            //scan.nextLine();
        }

        avg=sum/count;

        System.out.println("avarage value is " + avg);

        avarage = Math.round(avg);

        System.out.println("Full avarage value is " + avarage);
        System.out.println("SUM = "+sum+ " AVG = "+(int)(avarage));

    }








}
