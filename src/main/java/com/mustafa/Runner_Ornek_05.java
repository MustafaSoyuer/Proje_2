package com.mustafa;

import java.util.Scanner;

public class Runner_Ornek_05 {
    public static void main(String[] args) {

        /**
         *  1 den girilen sayıya kadar (girilen sayı dahil) olan sayılardan
         *  çift sayıların toplamını
         *  tek sayılar toplamını
         *  çift sayıların tek sayılayıların toplamına oranını bulan program
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz..: ");
        int sayi = scanner.nextInt();
        double ciftToplam=0, tekToplam=0;

        for(int i=0 ; i<=sayi;i++){
            if(i%2==0){
                ciftToplam+=i;
            }else{
                tekToplam+=i;
            }
        }
        double oran = ciftToplam/tekToplam;
        System.out.println("Çift Sayıların Toplamı..: "+ciftToplam);
        System.out.println("Tek Sayıların Toplamı..: "+tekToplam);
        System.out.println("Çift sayılar toplamının Tek sayıların toplamına oranı : "+oran);

    }// main sonu
}// class sonu
