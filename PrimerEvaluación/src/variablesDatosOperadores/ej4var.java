package variablesDatosOperadores;

import java.util.Scanner;

public class ej4var {
    public static void main(String[] args) {
//        Escribir un programa en el cual se piden cuatro números y se calcule e imprima la
//        suma de los dos primeros y el producto del tercero y el cuarto.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int suma = n1 + n2;
        System.out.println("suma los dos primeros " + suma);
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int pro =  n3 * n4;
        System.out.println("multiplicación del tres y cuatro " + pro);
    }
}
