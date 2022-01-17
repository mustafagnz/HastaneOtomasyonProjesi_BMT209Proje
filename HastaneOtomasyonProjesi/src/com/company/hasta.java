package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hasta extends doktor {

    public hasta(int id, int tc, String name, int password) {
        super(id, tc, name, password);
    }

    public void randevuAl() {

        for (int i = 0; i < saatler.size(); i++) {
            System.out.println(saatler.get(i));
        }
    }

    public void randevuSil() {
        System.out.println("silinecek doktor idsi:");
        int sil = oku.nextInt();
        saatler.remove(sil - 1);
    }

}


