package P2_Alfonso_Gismera_y_Alberto_Jiménez;
/**
 *@author 1daw : Alfonso Fco Gismera y Alberto Jiménez
 */
import java.util.Scanner;

//Dado un número de dos dígitos, imprime su primer número (las decenas).
public class ej10var {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número");
    int n = sc.nextInt();
    int m = n/10;
        if (n >= 10) {
            System.out.println("Este es tu numero en decenas " + m);
        } else {
            System.out.println("Error 404");
        }
    }
}
