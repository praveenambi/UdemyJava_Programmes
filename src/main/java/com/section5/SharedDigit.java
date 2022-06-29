package com.section5;

public class SharedDigit {


    public static void main(String[] args) {

        boolean status =  hasSharedDigit(12,23);

        System.out.println(status);
    }


    public  static  boolean hasSharedDigit(int a,  int b){

        boolean flag = false;
        int[] digits = new int[2];
        int bcount=0;
        int arem=0;
        int brem=0;
        int acount=0;

        if ((a>=10 && a<=99)  &&  (b>=10 && b<=99)){


            while (b!=0){
                brem = b%10;
                b=b/10;
                digits[bcount]=brem;

                bcount++;


            }

            while (a!=0){

                arem = a%10;
                a=a/10;


                for (int i = 0; i < digits.length; i++) {

                    if (arem==digits[i]){

                        flag=true;
                    }

                }

            }
            return flag;
        }

        return  flag;
    }



}

