package org.backend.PrimeiroTesteBT.classes;


public class Professor {
    private Integer id;
    private String nome;
    private Materia materia;
    private Integer[][] HorarioDP;

    private Integer[] SemanaCont = new Integer[6]; // temporario

    public Integer[] getSemanaCont() {
        return SemanaCont;
    }

    public Integer[][] getHorarioDP() {
        return HorarioDP;
    }

    public Materia getMateria() {
        return materia;
    }

    public String getNome() {
        return nome;
    }

    public Integer getId() {
        return id;
    }


    public Professor(Integer id, String nome, Materia materia, Integer[][] horarioDP) {
        this.id = id;
        this.nome = nome;
        this.materia = materia;
        HorarioDP = horarioDP;
    }
    public void leitura(Integer[][] horarioDP) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (HorarioDP[i][j] != 0) {
                    SemanaCont[i] += 1;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            SemanaCont[5] += SemanaCont[i];
        }
    }

    public byte ApDiSemana(Integer[] SemanaCont) {
        for (int i = 0; i < 5; i++) {
            if (SemanaCont[i] == 1) {
                return (byte)i;
            }
        }
        return (byte)9;
    }

    public void ini(){
        for (int i = 0; i < 6; i++) {
            SemanaCont[i] = 0;
        }
    }


    public void mostrar() {
        System.out.println(materia.getNome());
        System.out.println("segunda: " + SemanaCont[0]);
        System.out.println("terceira: " + SemanaCont[1]);
        System.out.println("quarta: " + SemanaCont[2]);
        System.out.println("quinta: " + SemanaCont[3]);
        System.out.println("sexta: " + SemanaCont[4]);
        System.out.println("Total: " + SemanaCont[5]);
    }


}
