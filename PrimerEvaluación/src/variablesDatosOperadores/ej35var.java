package variablesDatosOperadores;

import java.util.Scanner;

//Escribe un programa que lea los números a, b y c y compruebe si existe algún par de
//ellos que sumen exactamente 20. El programa debe imprimir un booleano (true o
//false).
public class ej35var {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primer número");
        int n1 = sc.nextInt();
        System.out.println("Segundo número");
        int n2 = sc.nextInt();
        System.out.println("Tercer número");
        int n3 = sc.nextInt();
        int var1 =(n1 + n2);
        int var2 =(n1 + n3);
        int var3 =(n3 + n2);
        int var4 =(n1 + n2 + n3);
        boolean n4 = (var1 == 20) || (var2 == 20) || (var3 == 20) || (var4 == 20);
        System.out.println("Es " + n4);
    }
}
