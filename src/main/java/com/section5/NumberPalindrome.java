package com.section5;

public class NumberPalindrome {

    public static void main(String[] args) {


        System.out.println(isPalindrome(707));


    }


    public static  boolean isPalindrome(int number){
        int original = number;
        int rev = 0;

        while (number!=0) {

            int reminder = number%10;
            rev= (rev*10) + reminder;
            number=number/10;

        }

        if (original==rev){

            return  true;
        }
        return  false;

    }
}
