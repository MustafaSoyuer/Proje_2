package com.mustafa;

import java.util.Scanner;

public class Runner_Ornek_09 {
    public static void main(String[] args) {

        /**
         *  Girilen ay ve güne göre burç bulan program
         */

    //Koç Burcu : 21 Mart - 20 Nisan
    //Boğa Burcu : 21 Nisan - 21 Mayıs
    //İkizler Burcu : 22 Mayıs - 22 Haziran
    //Yengeç Burcu : 23 Haziran - 22 Temmuz
    //Aslan Burcu : 23 Temmuz - 22 Ağustos
    //Başak Burcu : 23 Ağustos - 22 Eylül
    //Terazi Burcu : 23 Eylül - 22 Ekim
    //Akrep Burcu : 23 Ekim - 21 Kasım
    //Yay Burcu : 22 Kasım - 21 Aralık
    //Oğlak Burcu : 22 Aralık - 21 Ocak
    //Kova Burcu : 22 Ocak - 19 Subat
    //Balık Burcu : 20 Subat - 20 Mart


        Scanner sc = new Scanner(System.in);
        System.out.println("Doğum Ayınızı Giriniz");
        int ay = sc.nextInt();
        System.out.println("Doğum Gününüzü Giriniz");
        int gun = sc.nextInt();

        if (ay == 1 && gun > 0 && gun <= 21) {
            System.out.println("Burcunuz...: Oğlak");
        } else if (ay == 1 && gun >= 22 && gun <= 31){
            System.out.println("Burcunuz...: Kova");
        } else if (ay == 2 && gun > 0 && gun <= 19) {
            System.out.println("Burcunuz...: Kova");
        } else if (ay == 2 && gun >= 20 && gun <= 31){
            System.out.println("Burcunuz...: Balık");
        } else if (ay == 3 && gun > 0 && gun <= 20) {
            System.out.println("Burcunuz...: Balık");
        } else if(ay == 3 && gun >= 21 && gun <= 31){
            System.out.println("Burcunuz...: Koç");
        }else if(ay==4 && gun>0 && gun<=20){
            System.out.println("Burcunuz...: Koç");
        }else if(ay==4 && gun>=21 && gun<=31) {
            System.out.println("Burcunuz...: Boğa");
        }else if(ay==5 && gun>0 && gun<=21){
            System.out.println("Burcunuz...: Boğa");
        }else if(ay==5 && gun>=22 && gun<=31) {
            System.out.println("Burcunuz...: İkizler");
        }else if(ay==6 && gun>0 && gun<=22){
            System.out.println("Burcunuz...: İkizler");
        }else if(ay==6 && gun>=23 && gun<=31) {
            System.out.println("Burcunuz...: Yengeç");
        }else if(ay==7 && gun>0 && gun<=22){
            System.out.println("Burcunuz...: Yengeç");
        }else if(ay==7 && gun>=23 && gun<=31) {
            System.out.println("Burcunuz...: Aslan");
        }else if(ay==8 && gun>0 && gun<=22){
            System.out.println("Burcunuz...: Aslan");
        }else if(ay==8 && gun>=23 && gun<=31) {
            System.out.println("Burcunuz...: Başak");
        }else if(ay==9 && gun>0 && gun<=22){
            System.out.println("Burcunuz...: Başak");
        }else if(ay==9 && gun>=23 && gun<=31) {
            System.out.println("Burcunuz...: Terazi");
        }else if(ay==10 && gun>0 && gun<=22){
            System.out.println("Burcunuz...: Terazi");
        }else if(ay==10 && gun>=23 && gun<=31) {
            System.out.println("Burcunuz...: Akrep");
        }else if(ay==11 && gun>0 && gun<=21){
            System.out.println("Burcunuz...: Akrep");
        }else if(ay==11 && gun>=22 && gun<=31) {
            System.out.println("Burcunuz...: Yay");
        }else if(ay==12 && gun>0 && gun<=21){
            System.out.println("Burcunuz...: Yay");
        }else if(ay==12 && gun>=22 && gun<=31) {
            System.out.println("Burcunuz...: Oğlak");
        }else{
            System.out.println("Tekrar Deneyiniz.");
        }


    }// main sonu
}// class sonu
