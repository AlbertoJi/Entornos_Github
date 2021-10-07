package variablesDatosOperadores;

import java.util.Scanner;

public class ej17var {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inroduce la base del triangulo");
        float n = sc.nextFloat();
        System.out.println("Inroduce la altura del triangulo");
        float a = sc.nextFloat();
        float fin =(n * a) /2;
        System.out.println("El area del triangulo es: " + fin);

    }
}
