package org.backend.PrimeiroTesteBT.classes;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class GeracaoDehr {
    private static ArrayList<Professor> listas = new ArrayList<>();

    public static byte[][] setrandHrprof(byte[][] hora) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                hora[i][j] = (byte) ThreadLocalRandom.current().nextInt(0, 2);
            }
        }
        return hora;
    }
}
