package variablesDatosOperadores;

import java.util.Scanner;

//Escribe un programa que lea un valor entero y verifique si es menor que 10 y mayor
//que 0. El programa debe imprimir un booleano (true o false).
public class ej32var {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Di un número");
        int n = 10;
        int na = sc.nextInt();
        boolean f = (n > na) && (0 < na);
        System.out.println("Es " + f);
    }
}
