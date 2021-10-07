package variablesDatosOperadores;

import java.util.Scanner;

public class ej5var {
//    Escribe un programa que lea un valor entero n de la entrada estándar y muestre el
//    resultado de la siguiente expresión aritmética:
//            ((n + 1) * n + 2) * n + 3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        System.out.println(((n + 1) * n + 2) * n + 3);
//        otra forma
        int num = sc.nextInt();
        int resultado = ((num + 1) * num + 2) * num + 3;
        System.out.println(resultado);
    }
}
