package org.backend.Desativado;

public class LtSemana {
    Integer [][]Prof = new Integer[5][5];
    Integer[] SemanaCont = new Integer[6];

    public void Instancia() {
        for (int i = 0; i < 6; i++) {
            SemanaCont[i] = 0;
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                Prof[i][j] = 0;
            }
        }
    }

    public void leitura(Integer[][] Prof) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (Prof[i][j] != 0) {
                    SemanaCont[i] += 1;
                }
            }
        }
    }
    public Integer ApDiSemana(Integer[][] Prof) {
    for (int i = 0; i < 5; i++) {
        if (SemanaCont[i] == 1) {
            return SemanaCont[i];
        }
    }
    return 0;
    }


    public void mostrar() {
        System.out.println("segunda: " + SemanaCont[0]);
        System.out.println("terceira: " + SemanaCont[1]);
        System.out.println("quarta: " + SemanaCont[2]);
        System.out.println("quinta: " + SemanaCont[3]);
        System.out.println("sexta: " + SemanaCont[4]);
        for (int i = 0; i < 5; i++) {
            SemanaCont[5] += SemanaCont[i];
        }
    }

    public void main(){
        Instancia();
        Prof[0][0] = 1;
        Prof[0][1] = 1;
        Prof[0][2] = 1;
        Prof[0][3] = 1;
        Prof[1][2] = 1;
        leitura(Prof);
        mostrar();
        System.out.println(SemanaCont[5]);
    }

}
// 1 lt materias


/*
vai ler a classe da materia que por hr vai ser na base do sorteio, pegar o prof que - tem aulas inserir no horarios que ele tiver liberdo, fazer assim enquanto for possivel








pegar o prof com menos dias de aula tentar fazer manualmente ou usando randon e usando as verificações, brute force até sair um validado
outra ideia



otimizaões trabalhar com byte, fracionar a geração o maximo possivel, variaveis reutilizando dados ja existentes
 */

