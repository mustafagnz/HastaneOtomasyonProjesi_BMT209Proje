package com.company;

import java.util.*;

public class basHekim extends user {

    private doktor doktor;
    Scanner oku = new Scanner(System.in);

    public basHekim(int id, int tc, String name, int password) {
        super(id, tc, name, password);
    }

    ArrayList<doktor> doktorList = new ArrayList();

    public void doktorEkle() {
        System.out.print("doktor idsini giriniz: ");
        int id = oku.nextInt();
        System.out.print("doktor tcsini giriniz: ");
        int tc = oku.nextInt();
        System.out.print("doktor ismini giriniz: ");
        String name = oku.next();
        System.out.print("doktor sifresini belirleyiniz: ");
        int password = oku.nextInt();

        doktor doktor = new doktor(id, tc, name, password);
        doktorList.add(doktor);


        System.out.println("doktor eklendi");

    }

    public void doktorSil() {
        System.out.println("silinecek doktor idsi:");
        int sil = oku.nextInt();
        doktorList.remove(sil - 1);


        System.out.println("doktor silindi");
        System.out.println("silinen doktor ismi :" + getName());

    }

    public void doktorGoruntule() {
        for(doktor doktor : doktorList){
            System.out.println(doktor);
        }
    }

}
