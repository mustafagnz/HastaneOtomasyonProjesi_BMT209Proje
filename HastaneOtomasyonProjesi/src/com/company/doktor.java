package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class doktor extends user {
    public doktor(int id, int tc, String name, int password) {
        super(id, tc, name, password);
    }

    Scanner oku = new Scanner(System.in);

    ArrayList<Integer> saatler = new ArrayList<Integer>();

    public void musaitlikOlustur() {
        System.out.println("saat oluşturunuz");
        int saat;
        while (true) {
            saat = oku.nextInt();
            saatler.add(saat);
            if (saat == 0) {
                break;
            }
        }
    }

    public void musaitlikSil() {
        System.out.println("silinecek saat:");
        int sil = oku.nextInt();
        saatler.remove(sil - 1);
    }

    public void goster() {
        for (int i = 0; i < saatler.size(); i++) {
            System.out.println(saatler.get(i));
        }
        System.out.println("saat giriniz");

        for (int i = 0; i < saatler.size(); i++) {
            if(oku.nextInt()==saatler.get(i)){
                System.out.println("randevu oluşturuldu");
            }
            else {
                System.out.println("gün içinde birden fazla randevu alamazsınız");
            }
        }
    }

    @Override
    public String toString() {
        return "doktor{" +
                "tc=" + tc +
                ", name='" + name + '\'' +
                ", password=" + password +
                '}';
    }
}

