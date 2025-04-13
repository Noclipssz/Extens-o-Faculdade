package org.backend.Desativado.classe;

import java.util.List;

public class Professor {
    public String nome;
    public List<String> diasDisponiveis; // Dias em que o professor pode dar aula

    public Professor(String nome, List<String> diasDisponiveis) {
        this.nome = nome;
        this.diasDisponiveis = diasDisponiveis;
    }
}
