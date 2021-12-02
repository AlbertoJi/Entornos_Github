package Arrays;

import java.util.Scanner;

public class ar6 {
    public static void main(String[] args) {
      double suma = 0;
      double maxa = 0, mina = 0;
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];

      for (int i = 0; i < notas.length; i++) {
          suma  = suma + notas[i];
          if (notas[i] > maxa){
              maxa = notas[i];
          }
          if (notas[i] < mina){
              mina = notas[i];
          }
        }
    }
}
