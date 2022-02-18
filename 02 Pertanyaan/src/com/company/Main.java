package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int benar = 0 ;
        Scanner scanner = new Scanner(System.in) ;
        // (a) komputer akan menampilkan pertanyaan secara random kepada pemain; (3 pertanyaan random disimpan di arraylist) (3 jawaban juga ada di arraylist jawaban)
        // buat 2 array list
        // array list pertanyaan
        ArrayList<String> pertanyaan = new ArrayList<>() ;
        pertanyaan.add("Makanan bulat tapi digoreng dadakan?") ;
        pertanyaan.add("Makanan yang kalau direbus malam malam enak sekali?") ;
        pertanyaan.add("Buah apa yang suka bangun pagi?") ;

        // array list jawaban
        ArrayList<String> jawaban = new ArrayList<>() ;
        jawaban.add("tahu") ;
        jawaban.add("mie") ;
        jawaban.add("apel") ;

        ArrayList<Character> acakJawaban = new ArrayList<>() ;

        Random rand_int = new Random() ;

        while( benar < 3 ) {

            boolean betul_pertanyaan_ini = false ;
            int angka = rand_int.nextInt(pertanyaan.size());
            betul_pertanyaan_ini=false;

            while (betul_pertanyaan_ini == false) {

                // Print pertanyaan
                System.out.println(pertanyaan.get(angka));
                // Mengacak huruf dalam jawaban
                String jawab = jawaban.get(angka) ;
                // Input jawaban ke acakJawaban
                for (Character chars:jawab.toCharArray()) {
                    acakJawaban.add(chars) ;
                }
                // Print jawaban secara acak
                for ( int i=0 ; i < acakJawaban.size() + 3 ; i++ ) {
                    int acakKata_int = rand_int.nextInt(acakJawaban.size()) ;
                    System.out.print( acakJawaban.get(acakKata_int) );
                    acakJawaban.remove(acakKata_int);
                }

                String coba_jawab = scanner.nextLine() ;
                if ( coba_jawab.equals(jawab) ) {
                    System.out.println("JAWABAN ANDA BETUL");
                    betul_pertanyaan_ini = true ;
                    benar++;
                    jawaban.remove(angka) ;
                    pertanyaan.remove(angka) ;
                }   else {
                    System.out.println("coba lagi");
                }
            }

        }
        /*
        (b) bersamaan dengan itu, komputer juga akan menampilkan jawabannya namun dalam susunan acak, misal (APEL akan ditampilkan random P E L A)
        //ArrayList<Character> acakJawaban = new ArrayList<>();
        //for (int i = 0; i < jawaban2.length(); i++) {
        //            acakJawaban.add(jawaban2.charAt(i));
        //        }
        //        for (int j = 0; j < jawaban2.length(); j++) {
        //            angkaRandom=randoms.nextInt(acakJawaban.size());
        //            System.out.print(acakJawaban.get(angkaRandom));
        //            acakJawaban.remove(angkaRandom);
        //        }
        (c) user diminta menjawab pertanyaan tersebut sampai benar atau 1 untuk mengganti soal dan -1 untuk menyerah dan mengakhiri permainan.
        (d) soal yang sudah pernah muncul dan terjawab, tidak akan muncul lagi.
        // remove pertanyaan dan jawaban dari arrayList

        // sout score , jumlah pertanyaan yang terjawab

         */
    }
}
