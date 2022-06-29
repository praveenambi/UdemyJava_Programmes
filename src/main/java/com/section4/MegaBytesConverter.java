package com.section4;

public class MegaBytesConverter {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(5000);
    }

    public static  void printMegaBytesAndKiloBytes(int kiloBytes){

        if (kiloBytes<0){

            System.out.println("Invalid Value");
            return;
        }


        int megBytes = kiloBytes/1024;

        //System.out.println("Mega bytes " + megBytes);


        int kiBytes= (kiloBytes-(megBytes*1024));

        //System.out.println("Kbs " + kiBytes);



        System.out.println(kiloBytes+" KB = "+megBytes+" MB and "+kiBytes+" KB");
    }
}
