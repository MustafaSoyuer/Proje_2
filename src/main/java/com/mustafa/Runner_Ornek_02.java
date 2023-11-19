package com.mustafa;

import java.util.Scanner;

public class Runner_Ornek_02 {


    public static void main(String[] args) {

        /**
         * üç öğrencinin girilen notlarından hangi öğrencinin ortalamasının en yüksek ve en düşük olduğunu bulma
         */
        System.out.println("1.öğrencinin notlarını giriniz");
        double ortalama1= notGirme();
        System.out.println("1.öğrencinin ortalaması..: "+ortalama1);

        System.out.println("2.öğrencinin notlarını giriniz");
        double ortalama2= notGirme();
        System.out.println("2.öğrencinin ortalaması..: "+ortalama2);

        System.out.println("3.öğrencinin notlarını giriniz");
        double ortalama3= notGirme();
        System.out.println("3.öğrencinin ortalaması..: "+ortalama3);
        
        if(ortalama1> ortalama2 && ortalama1> ortalama3){
            System.out.println("En yüksek not ortalaması "+ortalama1 +" ile 1.öğrenci");
        } else if (ortalama2> ortalama1 && ortalama2> ortalama3) {
            System.out.println("En yüksek not ortalaması "+ortalama2 +" ile 2.öğrenci");
        } else {
            System.out.println("En yüksek not ortalaması "+ortalama3 +" ile 3.öğrenci");
        }

        if(ortalama1<ortalama2 && ortalama1<ortalama3){
            System.out.println("En düşük not ortalaması "+ortalama1 +" ile 1.öğrenci");
        } else if (ortalama2< ortalama1 && ortalama2< ortalama3) {
            System.out.println("En düşük not ortalaması "+ortalama2 +" ile 2.öğrenci");
        } else {
            System.out.println("En düşük not ortalaması " + ortalama3 + " ile 3.öğrenci");
        }


    }// main sonu

    public static double notGirme(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.sınav : ");
        double s1 = scanner.nextDouble();
        System.out.println("2.sınav : ");
        double s2 = scanner.nextDouble();
        System.out.println("3.sınav : ");
        double s3 = scanner.nextDouble();
        double ortalama = (s1+s2+s3)/3;
        return ortalama;
    }

}// class sonu
