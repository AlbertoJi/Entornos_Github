package EstructuraasDeControl;

import java.util.Scanner;

//Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de
//números a introducir). El programa debe informar de cuantos números introducidos
//son mayores que 0, menores que 0 e iguales a 0.
public class EC34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos números");
        int n = sc.nextInt();
        int num;
        int contceros = 0;
        int contP = 0;
        int contN = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Numero:");
            num = sc.nextInt();
            if (num > 0) {
                contP++;
            } else if (num < 0) {
                contN++;
            } else {
             contceros++;
            }
        }
        System.out.println("Número de positivos " + contP);
        System.out.println("Número de negativos " + contN);
        System.out.println("Número de ceros " + contceros);
    }
}

