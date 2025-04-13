package org.backend.PrimeiroTesteBT.classes;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class GeracaoDehr {
    private static ArrayList<Professor> listas = new ArrayList<>();
    public String[][] GradeHoraStrings = new String[5][5];

    public static void tetserand() {
     for (int i = 0; i < 51; i++) {
         int numero = ThreadLocalRandom.current().nextInt(0, 2);
         System.out.println(numero);
     }
    }

    public static void setrandHrprof (Integer[][] Hora) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                Hora[i][j] = ThreadLocalRandom.current().nextInt(0, 2);
            }
        }
    }


    public void main(String[] args) {
            Integer id1  = 10, id2  = 10, id3 = 10;
            for (int i = 0; i < 10; i++) {
               id1 = Integer.min(id1, i);
               id2 = Integer.min(id2, id1);
               id3 = Integer.min(id3, id2);
            }
            System.out.println(id1);
            System.out.println(id2);
            System.out.println(id3);
    }
}
