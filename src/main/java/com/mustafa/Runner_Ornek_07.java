package com.mustafa;

import java.util.Scanner;

public class Runner_Ornek_07 {
    public static void main(String[] args) {

        /**
         *  Girilen boy ve kiloya göre vücut kitle endeksini bulan ve durumunu söyleyen program
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Boyunuzu giriniz (Örnek: 1,70)...: ");
        double boy = scanner.nextDouble();
        System.out.println("Kilonuzu giriniz...: ");
        double kilo = scanner.nextDouble();
        double indeks = (kilo / (boy*boy));
        if (indeks <18.5) {
            System.out.println("İndeksiniz = " +indeks+ " ---> "+"Zayıf");
        }
        else if (indeks >= 18.5 && indeks<=24.9) {
            System.out.println("İndeksiniz = " +indeks+ " ---> "+"Normal.");
        }
        else if (indeks >= 25 && indeks<= 29.9) {
            System.out.println("İndeksiniz = " +indeks+ " ---> "+"Kilolu.");
        }
        else if (indeks >= 30 && indeks<=34.9) {
            System.out.println("İndeksiniz = " +indeks+ " ---> "+ "Obez.");
        }
        else
            System.out.println("İndeksiniz = " +indeks+ " ---> "+ "Aşırı obez");


    }//main sonu
}// class sonu
