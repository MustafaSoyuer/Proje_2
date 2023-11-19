package com.mustafa;

import java.util.Scanner;

public class Runner_Ornek_04 {
    public static void main(String[] args) {

        /**
         *  mail kodu=123 , telefon kodu=456 olsun. Elle girilen kodların doğruluğu sorgulayan program
         */
        int mailKodu = 123;
        int telefonKodu = 456;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mail kodunuzu giriniz");
        int mKod = scanner.nextInt();
        System.out.println("Telefon kodunuzu giriniz");
        int tKod= scanner.nextInt();

        if(mKod==mailKodu && tKod!=telefonKodu){
            System.out.println("Girdiğiniz telefon kodu hatalı");
        } else if (mKod!=mailKodu && tKod==telefonKodu) {
            System.out.println("Girdiğiniz mail kodu hatalı");
        } else if ( mKod!=mailKodu && tKod!=telefonKodu){
            System.out.println("Girdiğiniz kodlar hatalı");
        } else {
            System.out.println("Girdiğiniz kodlar doğru");
        }


    }//main sonu
}// class sonu
