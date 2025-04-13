package org.backend.Desativado;
import org.backend.Desativado.classe.*;

import java.util.*;

public class demo {

    public class GeradorHorarios {
        static List<String> diasSemana = Arrays.asList("Segunda", "Terça", "Quarta", "Quinta", "Sexta");
        static List<String> horarios = Arrays.asList("08:00 - 09:00", "09:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00");
        static int [][]aulasSemana = new int[5][5];
        public static void main(String[] args) {
            List<Professor> professores = Arrays.asList(
                    new Professor("Ana", Arrays.asList("Segunda", "Terça")),
                    new Professor("Carlos", Arrays.asList("Quarta", "Quinta", "Sexta")),
                    new Professor("Beatriz", Arrays.asList("Segunda", "Quinta"))
            );

            List<Materia> materias = Arrays.asList(
                    new Materia("Matemática", 4),
                    new Materia("História", 3),
                    new Materia("Física", 3)
            );

            List<Horario> horariosGerados = new ArrayList<>();

            for (String dia : diasSemana) {
                for (String horario : horarios) {
                    for (Materia materia : materias) {
                        for (Professor professor : professores) {
                            if (professor.diasDisponiveis.contains(dia)) {
                                horariosGerados.add(new Horario(dia, horario, professor, materia));
                                break;
                            }
                        }
                    }
                }
            }

            System.out.println("Horários Gerados:");
            for (Horario h : horariosGerados) {
                System.out.println(h);
            }
        }
    }

}
