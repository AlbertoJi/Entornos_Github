package P2_Alfonso_Gismera_y_Alberto_Jiménez;
/**
 *@author 1daw : Alfonso Fco Gismera y Alberto Jiménez
 */
import java.util.Scanner;

public class ej11var {
    public static void main(String[] args) {
//        Dado un número de dos cifras, escribe un programa que permita obtener el número
//        invertido. Ejemplo, si se introduce 23 que muestre 32.
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número");
        int n = sc.nextInt();
        int m = n%10;
        int l = n/10;
        if (n >= 10) {
            System.out.println("Este es el número invertido " + m + l);
        } else {
            System.out.println("Error 404");
        }
    }
}
