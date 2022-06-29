package com.section5;

public class FirstLastDigitSum {


    public static void main(String[] args) {

        int result = sumFirstAndLastDigit(-5);

        System.out.println("The result is " + result);


    }


    public static int findnoDigits(int num) {

        int count=0;

        while (num!=0) {

            num=num/10;
            count++;

        }

        return count;
    }

    public  static int sumFirstAndLastDigit(int number){

        int digits =0;
        int original= number;
        int sum=0;
        int first =0;
        int last=0;
        int counter=0;
        int count=0;


        if (number<0){

            return -1;
        }

        while (number!=0) {

            number=number/10;
            digits++;

        }



        if (digits>1){

            while (original!=0){

                int rem = original%10;
                original=original/10;

                if (counter==0){
                    first=rem;

                }else if ((counter+1)==digits){

                    last=rem;
                }

                counter++;
            }


        } else if (digits == 1) {

            int rem = original%10;
            original=original/10;
            first=rem;
            last=rem;


        }
        return  sum=first+last;
    }
}
