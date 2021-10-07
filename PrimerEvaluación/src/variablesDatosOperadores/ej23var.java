package variablesDatosOperadores;

import java.util.Scanner;

//    Realiza un programa que pida un número y un porcentaje, y
//    a. Calcule y muestre ese número incrementado en ese porcentaje.
//    b. Calcule y muestre ese número decrementado en ese porcentaje.
public class ej23var {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dame un número:");
        int n = sc.nextInt();
        System.out.println("dame un porcentage:");
        int por = sc.nextInt();
        int cal = (n * por) / 100;
        System.out.println("Porcentaje " + cal);
        System.out.println("Número incrementado " + (n + cal));
        System.out.println("Número decrementado " + (n - cal));
    }

}
