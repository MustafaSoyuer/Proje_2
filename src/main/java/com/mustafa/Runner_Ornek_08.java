package com.mustafa;

import java.util.Scanner;

public class Runner_Ornek_08 {
    public static void main(String[] args) {

        /**
         *  Girilen hava sıcaklığı üzerinden
         * Koşullar :
         * Sıcaklık 5'dan küçük ise "Kayak" yapmayı öneren,
         * Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öneren,
         * Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öneren,
         * Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öneren program
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hava sıcaklığını giriniz...: ");
        int sicaklik = scanner.nextInt();

        if(sicaklik<=5){
            System.out.println("Kayak yapabilirsiniz");
        } else if (sicaklik<=15 && sicaklik>5) {
            System.out.println("Sinemaya gidebilirsiniz");
        } else if (sicaklik<=25 && sicaklik>15) {
            System.out.println("Piknik yapabilirsiniz");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz");
        }


    }//main sonu
}// class sonu
