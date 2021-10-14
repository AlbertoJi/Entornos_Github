package EstructuraasDeControl;

import java.util.Scanner;

//Escribe un programa que pida tres números y los muestre ordenados (de mayor a
//menor);
public class EC10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a > b) && (b >c)) {
            System.out.println("El orden es " + a + " " + b + " " + c);
        } else if (a > c && c > b) {
            System.out.println("El orden es " + a + " " + c + " " + b);
        } else if (b > a && a > c) {
            System.out.println("El orden es " + b + " " + a + " " + c);
        } else if ((b > c) && (c > a)) {
            System.out.println("El orden es " + b + " " + c + " " + a);
        } else if ((c > a) && (a > b)) {
            System.out.println("El orden es " + c + " " + a + " " + b);
        } else if ((c > b) && (b > a)) {
            System.out.println("El orden es " + c + " " + b + " " + a);
        }
    }
}
