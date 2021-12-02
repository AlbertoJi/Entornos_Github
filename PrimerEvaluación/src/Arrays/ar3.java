package Arrays;

import java.util.Arrays;
import java.util.Scanner;

//Haz un programa en el que se cree un array que lea por teclado la longitud que tiene
//que tener y a continuación lo inicialice con números aleatorios comprendidos entre 1 y
//10. Mostrar la suma de todos los números que se guardan en el array.
public class ar3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime como quieres de largo el array");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random() * 11);
        }
        System.out.println("Al salir del bucle");
        System.out.println(Arrays.toString(a));
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma = suma +a[i];
        }
        System.out.println(suma);
    }

}
