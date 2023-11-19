package com.mustafa;

import java.util.Scanner;

public class Runner_Ornek_06 {
    public static void main(String[] args) {

        /**
         * Dışarıdan girilen iki sayı ile seçilen işlemi yaptıran program
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz..: ");
        int sayi1 = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz..: ");
        int sayi2 = scanner.nextInt();

        System.out.println("1- Toplama");
        System.out.println("2- Cıkarma");
        System.out.println("3- Carpma");
        System.out.println("4- Bölme");

        System.out.println("Yapılacak işlemi seçiniz..: ");
        int islem = scanner.nextInt();

        if(islem==1){
            System.out.println("Seçilen işlem toplama");
            System.out.println(sayi1+ " + "+sayi2+" = "+(sayi1+sayi2));
        }else if(islem==2){
            System.out.println("Seçilen işlem çıkarma");
            System.out.println(sayi1+" - "+sayi2+" = "+(sayi1-sayi2));
        }else if(islem==3){
            System.out.println("Seçilen işlem çarpma");
            System.out.println(sayi1+" * "+sayi2+" = " +(sayi1*sayi2));
        }else if(islem==4){
            System.out.println("Seçilen işlem bölme");
            System.out.println(sayi1+" / "+sayi2+" = "+((double)sayi1/sayi2));
        }else{
            System.out.println("Geçersiz seçim yaptınız");
        }


    }// main sonu
}// class sonu
