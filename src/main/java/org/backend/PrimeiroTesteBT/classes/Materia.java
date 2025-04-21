package org.backend.PrimeiroTesteBT.classes;

public class Materia {
    private Byte id;
    private String nome;
    private Byte quantAulas;
    private boolean check;

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public Materia(Byte id, String nome, Byte quantAulas) {
        this.id = id;
        this.nome = nome;
        this.quantAulas = quantAulas;
    }

    public Byte getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Byte getQuantAulas() {
        return quantAulas;
    }
}
