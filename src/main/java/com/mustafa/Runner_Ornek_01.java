package com.mustafa;

import java.util.Scanner;

public class Runner_Ornek_01 {
    public static void main(String[] args) {

        /**
         *  Kullanıcının girdiği iki sayıyı karşılaştırma
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz : ");
        int sayi1 = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        int sayi2 = scanner.nextInt();

        if(sayi1>sayi2){
            System.out.println(sayi1+ " büyüktür "+sayi2);
        } else if(sayi1<sayi2){
            System.out.println(sayi1+ " küçüktür "+sayi2);
        }else System.out.println("Sayılar eşittir.");


        System.out.println();
        /**
         * if in kısa kullanımı, iki saydan büyük olanı gösterme
         */
        String result = (sayi1 < sayi2 ) ? "Girilen ikinci sayı büyük" : "Girilen birinci sayı büyük";
        System.out.println(result);

    }// main sonu
}// class sonu