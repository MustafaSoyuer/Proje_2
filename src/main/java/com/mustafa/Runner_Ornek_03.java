package com.mustafa;

import java.util.Scanner;

public class Runner_Ornek_03 {
    public static void main(String[] args) {

        /**
         *      Girilen notun harf notu karşılığını veren program
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Notunuzu giriniz");
        int not = scanner.nextInt();
        if(not>90){
            System.out.println("Harf notunuz..: AA ile geçtiniz");
        }else if (not>85){
            System.out.println("Harf notunuz..: BA ile geçtiniz");
        } else if (not > 80) {
            System.out.println("Harf notunuz..: BB ile geçtiniz");
        }else if (not > 75){
            System.out.println("Harf notunuz..: CB ile geçtiniz");
        }else if (not >70){
            System.out.println("Harf notunuz..: CC ile geçtiniz");
        }else if (not >50){
            System.out.println("Koşullu geçtiniz");
        }else {
            System.out.println("Dersten kaldınız ");
        }



    }// main sonu
}// class sonu
