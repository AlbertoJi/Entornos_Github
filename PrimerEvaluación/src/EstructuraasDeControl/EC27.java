package EstructuraasDeControl;

import java.util.Scanner;

// Escribe un programa que, dado un número n introducido por teclado, dibuje un
//cuadrado de dimensiones n * n, con un carácter también introducido por teclado.
public class EC27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el número");
        int n = sc.nextInt();
        System.out.println("Dime el caracter");
        char c = sc.next().charAt(0);
        for (int i = 0; i <= n; i++) {

            for (int j = 0; j < 4; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
//for (int i = 0; i < 5; i++) { //bucle externo 0,1 etc a 4(5 interaciones)
//        System.out.println("Iteración del bucle externo i=" + i);
//        for (int j = 0; j < 10; j++) { //bucle interno 0,1,2,3 etc 9(10 iteraciones)
//        System.out.print("(i=" + i + ") (j=" + j + ")\t");// esto suele ser una linea
