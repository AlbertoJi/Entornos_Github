package EstructuraasDeControl;

import java.util.Scanner;

//Escribe un programa que solicite al usuario un número entre 1 y 100, ambos
//inclusive. Si se introduce un número fuera del intervalo debe indicarlo mediante un
//error y seguir pidiendo el número hasta que se introduzca el número en el rango
//indicado. Al terminar debe imprimir por pantalla el número introducido.
public class EC36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero entre 1 y 100");
        int n = sc.nextInt();
        while (n < 1 || n  > 100) {
                System.out.println("Prueba otra vez");
                n = sc.nextInt();
            }
        System.out.println(n);
        }
    }

