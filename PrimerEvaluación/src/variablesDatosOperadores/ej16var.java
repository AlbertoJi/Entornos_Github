package variablesDatosOperadores;

import java.util.Scanner;

public class ej16var {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Introduce el lado del cuadradodo ");
        double lado = sc.nextDouble();
        double perimetro = lado * 4;
        System.out.println("El perimetro del cuadrado es:" + perimetro);

    }
}
