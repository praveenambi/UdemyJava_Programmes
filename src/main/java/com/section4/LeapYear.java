package com.section4;

public class LeapYear {

    public static void main(String[] args) {

        System.out.println(isLeapYear(1800));
    }

    public  static boolean isLeapYear(int year){


        boolean status = false;

        if (year>=1 && year<=9999){

            if (year%4==0){

                if (year%100==0){


                    if (year%400==0){

                        status= true;

                        return  status;
                    }else {
                        status= false;
                        return status;

                    }

                }else {

                    status= true;
                    return  status;
                }



            }else {

                status = false;
                return false;
            }


        }else {

              status= false;
        }


       return  status;
    }



}
