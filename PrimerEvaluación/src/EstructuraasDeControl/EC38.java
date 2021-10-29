package EstructuraasDeControl;
//Escribe un programa que pida números hasta que se introduzca un cero. Debe
//imprimir la suma y la media de todos los números introducidos.

import java.util.Scanner;

public class EC38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        System.out.println("Dime un numero");
        int n = sc.nextInt();
        while (n !=0) {
            System.out.println("Escribe mas números");
            n = sc.nextInt();
            cont++;
        }
        System.out.println(cont);
    }
}
