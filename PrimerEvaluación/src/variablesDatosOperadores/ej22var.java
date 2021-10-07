package variablesDatosOperadores;

import java.util.Scanner;

public class ej22var {
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
        System.out.println("Media " + Math.round(media));

        if (media > 5)
            System.out.println(" Aprobado");
        else
            System.out.println(" Suspendido");

    }
}
