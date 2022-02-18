package com.company;

public class Main {

    public static void main(String[] args) {
        
        for ( int i=0 ; i < args.length ; i++ ) {

            //inner loop checking
            for ( int j=0 ; j < args.length - 1 ; j++ ) {
                int hasilCompare = args[j].compareToIgnoreCase(args[j+1]) ;

                if ( hasilCompare > 0 ) {
                    String temp = args[j] ;
                    args[j] = args[j+1];
                    args[j+1] = temp;
                }

            }

        }

        for (int i=0 ; i < args.length ; i++){
            System.out.println(args[i]);
        }

    }
}