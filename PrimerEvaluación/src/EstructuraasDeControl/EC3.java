package EstructuraasDeControl;

import java.util.Scanner;

//Escribe un programa que pida dos números e indique si el primero es mayor que el
//segundo o no.
public class EC3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero 1:");
        int x = sc.nextInt();
        System.out.println("Numero 2:");
        int y = sc.nextInt();
        if (x > y ) {
            System.out.println("El primero mayor que el segundo.");
        } else {
            System.out.println("El segundo mayor que el primero.");
        }
    }
}
