package org.backend.Desativado.classe;

public class Horario {

    String dia;
    String horario;
    Professor professor;
    Materia materia;

    public Horario(String dia, String horario, Professor professor, Materia materia) {
        this.dia = dia;
        this.horario = horario;
        this.professor = professor;
        this.materia = materia;
    }

    @Override
    public String toString() {
        return dia + " " + horario + " - " + materia.nome + " (Prof: " + professor.nome + ")";
    }
}
