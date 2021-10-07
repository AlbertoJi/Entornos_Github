package variablesDatosOperadores;

import java.util.Scanner;

public class EJ21var {
//        Programación y muestre la nota final (la nota final es la media de las tres
//        evaluaciones).
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nota de la 1 evaluación");
    double num1 = sc.nextDouble();
    System.out.println("Nota de la 2 evaluación");
    double num2 = sc.nextDouble();
    System.out.println("Nota de la 3 evaluación");
    double num3 = sc.nextDouble();
    double suma = num1 + num2 + num3;
    double media = suma/ 3;
    System.out.println("Media: " + media);
    if (media > 5)
    System.out.println("Aprovado");
    else
    System.out.println("Suspendido");

}

}
