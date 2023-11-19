package com.mustafa;

import java.util.Scanner;

public class Runner_Ornek_10 {
    public static void main(String[] args) {

        /**
         *  Uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi
         *  (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak
         *  uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın;
         *
         * Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2)
         * olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
         * Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
         * Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
         * Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
         * Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz..: ");
        int yas = scanner.nextInt();
        System.out.println("Mesafeyi km cinsinden giriniz..:");
        double mesafe = scanner.nextInt();
        System.out.println("Yolculuk tipini seciniz :");
        System.out.println("1- Tek Yön");
        System.out.println("2- Gidiş Dönüş");
        int secim = scanner.nextInt();

        double normalTutar = mesafe * 0.10;
        double yasIndirimi, indirimliTutar , gidisDonusIndirimi, toplamTutar ;
        if(secim==1){
            if(yas<=12 && yas>0){
                yasIndirimi = normalTutar * 0.50;
                indirimliTutar = normalTutar - yasIndirimi;
            }else if(yas<=24 && yas>12){
                yasIndirimi = normalTutar * 0.10;
                indirimliTutar = normalTutar - yasIndirimi;
            } else if (yas>65){
                yasIndirimi = normalTutar * 0.30;
                indirimliTutar = normalTutar - yasIndirimi;
            } else {
                indirimliTutar = normalTutar;
            }
            System.out.println("Toplam tutarınız...: "+indirimliTutar);
        }else if(secim==2){
            if(yas<=12 && yas>0){
                yasIndirimi = normalTutar * 0.50;
                indirimliTutar = normalTutar - yasIndirimi;
                gidisDonusIndirimi = indirimliTutar * 0.20 ;
                toplamTutar = (indirimliTutar - gidisDonusIndirimi) * 2;
            }else if(yas<=24 && yas>12){
                yasIndirimi = normalTutar * 0.10;
                indirimliTutar = normalTutar - yasIndirimi;
                gidisDonusIndirimi = indirimliTutar * 0.20 ;
                toplamTutar = (indirimliTutar - gidisDonusIndirimi) * 2;
            } else if (yas>65){
                yasIndirimi = normalTutar * 0.30;
                indirimliTutar = normalTutar - yasIndirimi;
                gidisDonusIndirimi = indirimliTutar * 0.20 ;
                toplamTutar = (indirimliTutar - gidisDonusIndirimi) * 2;
            } else {
                gidisDonusIndirimi = normalTutar * 0.20 ;
                toplamTutar = (normalTutar - gidisDonusIndirimi) * 2;
            }
            System.out.println("Toplam tutarınız...: "+toplamTutar);
        }else System.out.println("Hatalı Veri Girdiniz !");


    }//main sonu
}//class sonu
