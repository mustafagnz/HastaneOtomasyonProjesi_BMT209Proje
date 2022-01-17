package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        basHekim basHekim = new basHekim(93343, 12345, "mustafa", 123);
        doktor doktor = new doktor(93344, 1234, "ali", 123);
        hasta hasta = new hasta(93345, 21, "veli", 2);
        System.out.println("lütfen tc ve şifrenizi giriniz");


        while (true) {
            int tc = oku.nextInt();
            int sifre = oku.nextInt();


            if (tc == basHekim.getTc() && sifre == basHekim.getPassword()) {
                System.out.println("bashekim girisi yapıldı");
                System.out.println("--------------------------");
                System.out.println("secim yapiniz");
                System.out.println("doktor eklemek için => 1");
                System.out.println("doktor silmek için => 2");
                System.out.println("doktorları görüntülemek için => 3");
                System.out.println("islemi bitirmek için => 4");

                while (true) {
                    int secim = oku.nextInt();
                    switch (secim) {
                        case 1:
                            basHekim.doktorEkle();
                            break;
                        case 2:
                            basHekim.doktorSil();
                            break;
                        case 3:
                            basHekim.doktorGoruntule();
                            break;
                    }
                    if (secim == 4)
                    {
                        System.out.println("bashekim sisteminden çıkıldı");
                        break;
                    }
                }
                tc = oku.nextInt();
                sifre = oku.nextInt();
            }


            if (tc == doktor.getTc() && sifre == doktor.getPassword()) {
                System.out.println("doktor girisi yapildi");
                System.out.println("--------------------------");
                System.out.println("secim yapiniz");
                System.out.println("saat açmak için => 1");
                System.out.println("saat silmek için => 2");
                System.out.println("çıkış yapmak için => 3");
                while (true) {
                    int secim = oku.nextInt();
                    switch (secim) {
                        case 1:
                            doktor.musaitlikOlustur();
                            break;
                        case 2:
                            doktor.musaitlikSil();
                            break;
                    }
                    if (secim == 00) {
                        System.out.println("doktor sisteminden çıkıldı");
                        break;
                    }

                }
                tc = oku.nextInt();
                sifre = oku.nextInt();

            }

            if (tc == hasta.getTc() && sifre == hasta.getPassword()) {
                System.out.println("hasta girisi yapildi");
                System.out.println("--------------------------");
                System.out.println("secim yapiniz");
                System.out.println("randevu almak için => 1");
                System.out.println("randevu silmek için => 2");
                System.out.println("çıkış yapmak için => 3");
                while (true) {
                    int secim = oku.nextInt();
                    switch (secim) {
                        case 1:
                            doktor.goster();
                            break;
                        case 2:
                            hasta.randevuSil();
                            break;
                        case 3:   System.out.println("hasta sisteminden çıkıldı");
                            break;
                    }
                    if (secim == 3) {
                        System.out.println("hasta sisteminden çıkıldı");
                        break;
                    }

                }
            }
        }
    }
}





