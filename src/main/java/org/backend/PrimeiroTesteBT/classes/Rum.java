package org.backend.PrimeiroTesteBT.classes;
import java.util.ArrayList;


public class Rum {


    static String[][] HrAulas = new String[5][5];

    static Professor p1 = new Professor(1, "Kairo", new Materia(1, "Matemática", 3), new Integer[5][5]);
    static Professor p2 = new Professor(2, "Maria", new Materia(2, "História", 2), new Integer[5][5]);

    static Professor p3 = new Professor(3, "João", new Materia(3, "Geografia", 2), new Integer[5][5]);
    static Professor p4 = new Professor(4, "Ana", new Materia(4, "Português", 4), new Integer[5][5]);

    static Professor p5 = new Professor(5, "Carlos", new Materia(5, "Física", 2), new Integer[5][5]);
    static Professor p6 = new Professor(6, "Fernanda", new Materia(6, "Química", 2), new Integer[5][5]);

    static Professor p7 = new Professor(7, "Lucas", new Materia(7, "Biologia", 2), new Integer[5][5]);
    static Professor p8 = new Professor(8, "Patrícia", new Materia(8, "Filosofia", 2), new Integer[5][5]);

    static Professor p9 = new Professor(9, "Eduardo", new Materia(9, "Sociologia", 2), new Integer[5][5]);
    static Professor p10 = new Professor(10, "Juliana", new Materia(10, "Educação Física", 2), new Integer[5][5]);
    static Professor p11 = new Professor(11, "André", new Materia(11, "Inglês", 2), new Integer[5][5]);

    public static ArrayList<Professor> lista = new ArrayList<>();
    public static ArrayList<Professor> ordenada = new ArrayList<>();

    public static void ff(String[][] HrAulas) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                HrAulas[i][j] = "";
            }
        }
        ordenada.add(p1);
        ordenada.add(p2);
        ordenada.add(p3);
        ordenada.add(p4);
        ordenada.add(p5);
        ordenada.add(p6);
        ordenada.add(p7);
        ordenada.add(p8);
        ordenada.add(p9);
        ordenada.add(p10);
        ordenada.add(p11);
        for (int i = 0; i < ordenada.size(); i++) {
            GeracaoDehr.setrandHrprof(ordenada.get(i).getHorarioDP());
            ordenada.get(i).ini();
            ordenada.get(i).leitura(ordenada.get(i).getHorarioDP());
        }
        lista = ordenarPorTotalAulasSemana(
                ordenada);
    }

    public static ArrayList<Professor> ordenarPorTotalAulasSemana(ArrayList<Professor> entrada) {
        ArrayList<Professor> novaLista = new ArrayList<>(entrada); // Cria cópia

        int n = novaLista.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                int total1 = novaLista.get(j).getSemanaCont()[5];
                int total2 = novaLista.get(j + 1).getSemanaCont()[5];

                if (total1 > total2) {
                    Professor temp = novaLista.get(j);
                    novaLista.set(j, novaLista.get(j + 1));
                    novaLista.set(j + 1, temp);
                }
            }
        }

        return novaLista;
    }



    public static void ru(){
        ff(HrAulas);

        for (int i = 0; i < lista.size(); i++) {
            FudeuV1(i);
        }
    }

    public static void testeMIn(){
        Integer id1  = 100, id2  = 10;
        for (int i = 0; i < lista.size(); i++) {
            id1 = Integer.min(id1,lista.get(i).getSemanaCont()[4]);
            if (id1 == lista.get(i).getSemanaCont()[4]) {
                id2 = i;
            }
        }
        System.out.println(id1);
        System.out.println(id2 + lista.get(id2).getMateria().getNome());
    }


    public static void FudeuV1(int a) {
        int cont = 0;
        int b = a;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (lista.get(b).getHorarioDP()[i][j] == 1) {
                    if (HrAulas[i][j].isEmpty()) {
                        if (lista.get(b).getMateria().isCheck()){}
                        else{
                        if (cont < lista.get(b).getMateria().getQuantAulas()) {
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
    }

    public static void main(String[] args) {
        boolean verification = true;
        int ver = 0;
        while (verification == true) {

        ru();

            testeMIn();
        String[] dias = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta"};
        for (int i = 0; i < HrAulas.length; i++) {
            System.out.println(dias[i] + ":");
            for (int j = 0; j < HrAulas[i].length; j++) {
                System.out.println("  Aula " + (j + 1) + ": " + HrAulas[i][j]);
            }
            System.out.println();
        }

       /* for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getMateria().getNome() + " "+ lista.get(i).getMateria().isCheck() + " Quant Aulas: " + lista.get(i).getSemanaCont()[5]);
        }
        */

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getMateria().isCheck()) {
                ver++;
                if(ver == lista.size()){
                    verification = true;
                    System.out.println("Log true");
                }
            } else{
                verification = false;
                System.out.println("Log False");
            }

        }
    }
    }
}





