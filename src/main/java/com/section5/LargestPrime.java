package com.section5;

public class LargestPrime {

    public static void main(String[] args) {


        int largeprime =  getLargestPrime(21);
        System.out.println(largeprime);


    }




    public  static  int getLargestPrime(int number){



        if (number <= 0 || number <= 1) {
            return -1;
        }
        else {
            int largestPrime = 2;
            while (largestPrime < number) {
                if (number % largestPrime != 0) {
                    largestPrime++;
                } else {
                    number = number / largestPrime;

                }
            }
            return number;
        }




    }





}
