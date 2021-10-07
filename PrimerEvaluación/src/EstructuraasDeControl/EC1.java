package EstructuraasDeControl;

import java.util.Scanner;

//Escribe un programa que pida un número e indique si es par o impar (un número es
//par si al dividirlo entre 2 el resto es 0).
public class EC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dame un número:");
        int n = sc.nextInt();
        int res = n % 2;
        if (res == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }

    }
}