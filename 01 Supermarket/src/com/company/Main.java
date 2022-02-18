package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] arrayProducts = {"Rasa Kari Ayam", "Kecap Manis Bango", "Kopi Kapal Kapi", "Gula Pasir Gulaku", "Telor Ayam Sinar Mas"} ;
        int[] arrayProductPrice = {2500, 10500, 15000, 9000, 22500} ;

        ArrayList<String> records = new ArrayList<>() ;

        // Nota
        int total = 0 ;

        // Scanner
        Scanner scanner = new Scanner(System.in) ;

        while(true) {
            int sama = 0 ;
            String input = scanner.nextLine() ;
            if ( input.equals("-1") ) {
                break ;
            }

            String symbol = input.substring(0,1) ; // + / -
            int kode_barang_int = Integer.parseInt(input.substring(2,3)) ;
            int jumlah_item_int = Integer.parseInt( input.substring(4, input.length()) ) ;

            // Checking input , if there's already same element exist
            for (String j:records) {
                if (  (input.substring(2, 3)).equals(j.substring(2, 3)) ) {
                    sama = 1 ;

                    if ( symbol.equals("+") ) {
                        // + Penambahanf
                        System.out.println("Penambahan");
                        int jumlah_item_int_update = Integer.parseInt( input.substring(4, input.length()) ) + Integer.parseInt( j.substring(4, input.length()) ) ;

                        String jumlah_item_string_local = Integer.toString(jumlah_item_int_update) ;
                        total += arrayProductPrice[kode_barang_int] * jumlah_item_int ;

                        records.remove(j) ;
                        records.add(String.format("+ %d %d",kode_barang_int, jumlah_item_int_update )) ;
                        break;

                    } else if ( symbol.equals("-") ) {
                        // - Pengurangan
                        System.out.println("Pengurangan");
                        int jumlah_item_int_update = Integer.parseInt( j.substring(4, input.length()) ) - Integer.parseInt( input.substring(4, input.length()) ) ;
                        if (jumlah_item_int_update<0) {
                            jumlah_item_int_update=0 ;
                        }

                        String jumlah_item_string_local = Integer.toString(jumlah_item_int_update) ;
                        total -= arrayProductPrice[kode_barang_int] * jumlah_item_int ;

                        records.remove(j) ;
                        records.add(String.format("+ %d %d",kode_barang_int, jumlah_item_int_update )) ;
                        break;
                    }

                }
            }

            if ( sama != 1 ) {
                // Make new element
                records.add(input) ;

                if ( symbol.equals("+") ) {
                    // + Penambahan
                    System.out.println("Penambahan");
                    total += arrayProductPrice[kode_barang_int] * jumlah_item_int ;

                } else if ( symbol.equals("-") ) {
                    // - Pengurangan
                    System.out.println("Pengurangan");
                    total -= arrayProductPrice[kode_barang_int] * jumlah_item_int ;
                }

            }

        } // while end

        System.out.println("---NOTA BELANJA---");
        for (String j:records) {
            String symbol = j.substring(0,1) ; // + / -
            int kode_barang_int = Integer.parseInt(j.substring(2,3)) ;
            int jumlah_item_int = Integer.parseInt( j.substring(4, j.length()) ) ;

            if ( jumlah_item_int > 0 ) {
                System.out.printf("Nama Barang : %s \n", arrayProducts[kode_barang_int] ) ;
                System.out.printf("Kode Barang : %d, Jumlah Item : %d \n", kode_barang_int, jumlah_item_int) ;
                System.out.printf("Total Harga per Item : %d \n\n", arrayProductPrice[kode_barang_int] * jumlah_item_int) ;
            }
        }
        System.out.printf("\nTotal = %d", total);
    }
}