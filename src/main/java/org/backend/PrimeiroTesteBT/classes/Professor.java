package org.backend.PrimeiroTesteBT.classes;

public class Professor {
    private byte id;
    private String nome;
    private Materia materia;
    private byte[][] HorarioDP;

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



}
