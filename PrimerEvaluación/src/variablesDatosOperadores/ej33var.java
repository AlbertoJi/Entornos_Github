package variablesDatosOperadores;

import java.util.Scanner;

//Escribe un programa que lea tres números enteros e imprima true si el primer
// número está entre el segundo y el tercero (ambos inclusive). De lo contrario, debe
//imprimir false.
public class ej33var {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primer número");
        int n1 = sc.nextInt();
        System.out.println("Segundo número");
        int n2 = sc.nextInt();
        System.out.println("Tercer número");
        int n3 = sc.nextInt();
        boolean n4 = (n2 >= n1) && ( n1 >= n3);
        System.out.println("Es " + n4);
    }
}
