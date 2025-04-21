package org.backend.PrimeiroTesteBT.classes;

public class Professor {
    private byte id;
    private String nome;
    private Materia materia;
    private byte[][] HorarioDP;
    private byte[] SemanaCont = new byte[6]; // substituído Byte[] por byte[]

    public byte[] getSemanaCont() {
        return SemanaCont;
    }

    public byte[][] getHorarioDP() {
        return HorarioDP;
    }

    public Materia getMateria() {
        return materia;
    }

    public String getNome() {
        return nome;
    }

    public byte getId() {
        return id;
    }

    public Professor(byte id, String nome, Materia materia, byte[][] horarioDP) {
        this.id = id;
        this.nome = nome;
        this.materia = materia;
        this.HorarioDP = horarioDP;
    }

    public void leitura(byte[][] horarioDP) {
        ini(); // zera antes de usar
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (horarioDP[i][j] != 0) {
                    SemanaCont[i]++;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            SemanaCont[5] += SemanaCont[i];
        }
    }

    public byte ApDiSemana(byte[] SemanaCont) {
        for (int i = 0; i < 5; i++) {
            if (SemanaCont[i] == 1) {
                return (byte) i;
            }
        }
        return (byte) 9;
    }

    public void ini() {
        for (int i = 0; i < 6; i++) {
            SemanaCont[i] = 0;
        }
    }

    public void mostrar() {
        System.out.println(materia.getNome());
        System.out.println("segunda: " + SemanaCont[0]);
        System.out.println("terça: " + SemanaCont[1]);
        System.out.println("quarta: " + SemanaCont[2]);
        System.out.println("quinta: " + SemanaCont[3]);
        System.out.println("sexta: " + SemanaCont[4]);
        System.out.println("Total: " + SemanaCont[5]);
    }
}
