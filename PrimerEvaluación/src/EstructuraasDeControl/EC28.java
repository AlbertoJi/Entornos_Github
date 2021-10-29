package EstructuraasDeControl;
//Escribe un programa que reciba dos valores enteros por teclado, a y b, y dibuje un
//rectángulo en que la base sea el número mayor y la altura el número menor, con un
//carácter también introducido por teclado.

import java.util.Scanner;

public class EC28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el número 1 ");
        int n = sc.nextInt();
        System.out.println("Dime el número");
        int n2 = sc.nextInt();
        System.out.println("Dime el caracter");
        char c = sc.next().charAt(0);
        for (int i = 0; i <= n; i++) {

            for (int j = 0; j < n2; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
//        no = int(input("Introduce la altura del triángulo (entero positivo): "))
//        for ig in range(no):
//        print("*"*(ig+1))
    }
}
