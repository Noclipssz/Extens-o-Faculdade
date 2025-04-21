package org.backend.PrimeiroTesteBT.classes;

import java.util.ArrayList;
import java.util.Collections;

public class Rum {
    static String[][] HrAulas = new String[5][5];

// Arrays de horários individuais para cada matéria
        static byte[][] MatHrMatematica = new byte[5][5];
        static byte[][] MatHrHistoria = new byte[5][5];
        static byte[][] MatHrGeografia = new byte[5][5];
        static byte[][] MatHrPortugues = new byte[5][5];
        static byte[][] MatHrFisica = new byte[5][5];
        static byte[][] MatHrQuimica = new byte[5][5];
        static byte[][] MatHrBiologia = new byte[5][5];
        static byte[][] MatHrFilosofia = new byte[5][5];
        static byte[][] MatHrSociologia = new byte[5][5];
        static byte[][] MatHrEducacaoFisica = new byte[5][5];
        static byte[][] MatHrIngles = new byte[5][5];

        // Criação de professores com horários exclusivos
        static Professor p1 = new Professor((byte) 1, "Kairo", new Materia((byte) 1, "Matemática", (byte) 3), GeracaoDehr.setrandHrprof(MatHrHistoria));
        static Professor p2 = new Professor((byte) 2, "Maria", new Materia((byte) 2, "História", (byte) 2), GeracaoDehr.setrandHrprof(MatHrHistoria));
        static Professor p3 = new Professor((byte) 3, "João", new Materia((byte) 3, "Geografia", (byte) 2), GeracaoDehr.setrandHrprof(MatHrGeografia));
        static Professor p4 = new Professor((byte) 4, "Ana", new Materia((byte) 4, "Português", (byte) 4), GeracaoDehr.setrandHrprof(MatHrPortugues));
        static Professor p5 = new Professor((byte) 5, "Carlos", new Materia((byte) 5, "Física", (byte) 2), GeracaoDehr.setrandHrprof(MatHrFisica));
        static Professor p6 = new Professor((byte) 6, "Fernanda", new Materia((byte) 6, "Química", (byte) 2), GeracaoDehr.setrandHrprof(MatHrQuimica));
        static Professor p7 = new Professor((byte) 7, "Lucas", new Materia((byte) 7, "Biologia", (byte) 2), GeracaoDehr.setrandHrprof(MatHrBiologia));
        static Professor p8 = new Professor((byte) 8, "Patrícia", new Materia((byte) 8, "Filosofia", (byte) 2), GeracaoDehr.setrandHrprof(MatHrFilosofia));
        static Professor p9 = new Professor((byte) 9, "Eduardo", new Materia((byte) 9, "Sociologia", (byte) 2), GeracaoDehr.setrandHrprof(MatHrSociologia));
        static Professor p10 = new Professor((byte) 10, "Juliana", new Materia((byte) 10, "Educação Física", (byte) 2), GeracaoDehr.setrandHrprof(MatHrEducacaoFisica));
        static Professor p11 = new Professor((byte) 11, "André", new Materia((byte) 11, "Inglês", (byte) 2), GeracaoDehr.setrandHrprof(MatHrIngles));


    public static ArrayList<Professor> lista = new ArrayList<>();


    public static void ff(ArrayList<Professor> ordenada) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                HrAulas[i][j] = "";
            }
        }
        for (Professor prof : ordenada) {
        //    GeracaoDehr.setrandHrprof(prof.getHorarioDP());
            prof.ini();
            prof.leitura(prof.getHorarioDP());
        }
    }

    public static void adicionarProfessoresAleatoriamente(ArrayList<Professor> lista) {
        ArrayList<Professor> temp = new ArrayList<>();
        temp.add(p1); temp.add(p2); temp.add(p3); temp.add(p4); temp.add(p5); temp.add(p6); temp.add(p7); temp.add(p8); temp.add(p9); temp.add(p10); temp.add(p11);
        Collections.shuffle(temp);
        lista.addAll(temp);
    }

    public static void instanciar(ArrayList<Professor> lista) {
        lista.clear();
        adicionarProfessoresAleatoriamente(lista);
        resetarChecks(lista);
        ff(lista);
    }

    public static void resetarChecks(ArrayList<Professor> lista) {
        for (Professor prof : lista) {
            if (prof.getMateria() != null) {
                prof.getMateria().setCheck(false);
            }
        }
    }

    public static void ru(ArrayList<Professor> lista) {
        for (int i = 0; i < lista.size(); i++) {
            FudeuV1(i);
        }
    }

    public static void FudeuV1(int a) {
        int cont = 0;
        int b = a;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (lista.get(b).getHorarioDP()[i][j] == 1) {
                    if (HrAulas[i][j].isEmpty()) {
                        if (!lista.get(b).getMateria().isCheck() && cont < lista.get(b).getMateria().getQuantAulas()) {
                            cont++;
                            HrAulas[i][j] = lista.get(b).getMateria().getNome();
                            if (cont == lista.get(b).getMateria().getQuantAulas()) {
                                lista.get(b).getMateria().setCheck(true);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void limparHrAulas() {
        for (int i = 0; i < HrAulas.length; i++) {
            for (int j = 0; j < HrAulas[i].length; j++) {
                HrAulas[i][j] = "";
            }
        }
    }

    public static void main(String[] args) {
        int i1 = 0;
        String[] dias = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta"};
        boolean concluido = false;

        while (!concluido) {
            lista.clear();
            limparHrAulas();
            instanciar(lista);
            ru(lista);
            i1++;

            concluido = true;
            for (Professor p : lista) {
                if (!p.getMateria().isCheck()) {
                    concluido = false;
                    break;
                }
            }
        }

        for (int i = 0; i < HrAulas.length; i++) {
            System.out.println(dias[i] + ":");
            for (int j = 0; j < HrAulas[i].length; j++) {
                System.out.println("  Aula " + (j + 1) + ": " + HrAulas[i][j]);
            }
            System.out.println();
        }

    }
}
