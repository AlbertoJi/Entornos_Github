package P3_Alfonso_Gismera_y_Alberto_Jiménez;
/**
 *@author 1daw : Alfonso Fco Gismera y Alberto Jiménez
 */
import java.util.Scanner;

public class EJ21var {
//        Programación y muestre la nota final (la nota final es la media de las tres
//        evaluaciones).
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Dime cuantas evaluaciones");
    int total = sc.nextInt();
    double num = 0;
    double suma = 0;
    int cont = 0;
    System.out.println("Dime las notas");
    for (int i = 1; i <= total; i++) {
        System.out.println("Nota");
        num = sc.nextInt();
        suma = suma + num;
        cont++;
        System.out.println("Nota de la " + cont + " evaluación");
    }
    double media = suma / cont;
    System.out.println("Media: " + media);
    if ((media >= 5) && (media <= 10)) {
        System.out.println("Aprovado");
    } else {
        System.out.println("Suspendido");
    }
  }
}
