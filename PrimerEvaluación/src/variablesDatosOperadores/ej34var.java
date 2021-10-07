package variablesDatosOperadores;

import java.util.Scanner;

//Escribe un programa que lea tres números y compruebe que todos son diferentes, es
//decir, no iguales entre sí. El programa debe imprimir un booleano (true o false).
public class ej34var {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primer número");
        int n1 = sc.nextInt();
        System.out.println("Segundo número");
        int n2 = sc.nextInt();
        System.out.println("Tercer número");
        int n3 = sc.nextInt();
        boolean n4 = (n2 != n1) && ( n1 != n3) && (n2 != n3);
        System.out.println("Es " + n4);
    }
}
