package ExamenAlfonsoGismera_AlbertoJimenéz;

import java.util.Scanner;

//Escribe un programa que imprima por pantalla la suma de los n
//primeros números múltiplos de 3 que además sean pares, siendo n un número introducido por
//teclado. Por ejemplo, si introducimos 4 debe imprimir 60, que es la suma de 6 + 12 + 18 +
//24.
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos números vas a meter?");
        int num = sc.nextInt();
        System.out.println("Dime el número");
        int n = sc.nextInt();
        int suma = 0;
        for (int i = 0; i <num; i++) {
            if (n % 2 == 0 && n % 3 == 0){
                suma = suma + n;
        }
        }
        System.out.println("Esta es la suma:" + suma);
    }
}
