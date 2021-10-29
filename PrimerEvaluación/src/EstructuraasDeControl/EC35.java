package EstructuraasDeControl;

import java.util.Scanner;

//Hacer un programa que dibuje un triángulo rectángulo de n elementos de lado,
//        siendo n un número introducido por teclado, utilizando asteriscos (*). Por ejemplo,
//        para n = 5:
public class EC35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el número");
        int n = sc.nextInt();
        System.out.println("Dime el caracter");
        char c = sc.next().charAt(0);
        for (int i = 0; i <= n; i++) {

            for (int j = 0; j < n -i; j++) {
                System.out.print(c);
            }
            System.out.println();
        }

    }
}
