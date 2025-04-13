package org.backend.Desativado;

public class Demo2 {

     String [][]aulasSemana = new String[5][5];
     String [][]Prof = new String[5][5];

     public void inst(){
         for (int i = 0; i < 5; i++) {
             for (int j = 0; j < 5; j++) {
                 aulasSemana[i][j] = " ";
             }
         }
     }

   public void testS() {
         inst();
         for (int i = 1; i < 5; i++) {
             if (Prof[1][i].equalsIgnoreCase("sim")) {
                aulasSemana[1][i] = "Prof";
                Prof[1][i] = "Sim";
             }
         }
     }
}
