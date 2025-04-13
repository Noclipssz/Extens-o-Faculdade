package org.backend.PrimeiroTesteBT.classes;

public class Materia {
    private Integer id;
    private String nome;
    private Integer quantAulas;
    private boolean check;

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public Materia(Integer id, String nome, Integer quantAulas) {
        this.id = id;
        this.nome = nome;
        this.quantAulas = quantAulas;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQuantAulas() {
        return quantAulas;
    }
}
