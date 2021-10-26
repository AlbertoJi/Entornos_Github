package EstructuraasDeControl;

import java.util.Scanner;

//Hacer un programa que pida diez números por teclado y calcule su media.
public class EC26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = 0;
        double suma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Número");
            n =(int) (Math.random() * 100 + 1);
            suma += n;
            System.out.println("Suma en vuelts " + i + ":" + suma);
        }
        double media = suma / 10;
        System.out.println("Resultado" + media);

    }
}
