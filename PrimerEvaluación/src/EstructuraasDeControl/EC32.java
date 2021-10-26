package EstructuraasDeControl;

import java.util.Scanner;

//Hacer un programa que imprima todos los números múltiplos de 5 entre 1 y n, siendo n
//un número introducido por el usuario.
public class EC32 {
    public static void main(String[] args) {
     //numero % 5 == 0
     //entre 1 y n hay que reconocer sison multiplos de 5
     //
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
