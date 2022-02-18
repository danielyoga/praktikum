package com.company;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> soal = new ArrayList<>();
        soal.add("Buah hijau pake rujak");
        soal.add("pake jadi wine");
        soal.add("penemu gravitasi");

        ArrayList<String> jawaban = new ArrayList<>();
        jawaban.add("mangga");
        jawaban.add("anggur");
        jawaban.add("appel");

        ArrayList<Character> acakJawaban = new ArrayList<>();

        String user="";
        int kodeSoal, kodeJawaban,angkaRandom, score=0;
        Random randoms = new Random();
        Scanner scanf = new Scanner(System.in);
        kodeSoal = randoms.nextInt(3);
        kodeJawaban = randoms.nextInt(3);

        String jawaban2 = jawaban.get(kodeJawaban);

        for (int i = 0; i < jawaban2.length(); i++) {
            acakJawaban.add(jawaban2.charAt(i));
        }
        for (int j = 0; j < jawaban2.length(); j++) {
            angkaRandom=randoms.nextInt(acakJawaban.size());
            System.out.print(acakJawaban.get(angkaRandom));
            acakJawaban.remove(angkaRandom);
        }
        while(user.compareTo(jawaban2)!=0){
            System.out.println("\ncoba jawab perhuruf:");
            user = scanf.next();
            if(user.equalsIgnoreCase(jawaban2)) {
                System.out.println("\nBENAR SEKALI!!");
                score++;
                break;
            }

            if (user.compareTo("-1")==0) {
                System.out.println("GOOD GAME");
                break;
            }
            if (user.compareTo("1")==0){

            }
        }





    }
}
