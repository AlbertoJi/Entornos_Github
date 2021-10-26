package P2_Alfonso_Gismera_y_Alberto_Jiménez;
/**
 *@author 1daw : Alfonso Fco Gismera y Alberto Jiménez
 */
import java.util.Scanner;

public class ej9var  {
    public static void main(String[] args) {
//Escribe un programa que calcule (y muestre) cuántas horas, minutos y segundos han transcurrido entre dos momentos del mismo día.*/
//Para ello, el programa ha de pedir por teclado seis números enteros: las horas, minutos y segundos para el momento inicial y lo mismo para el momento final. De momento vamos a considerar que los
//números introducidos van a estar en el rango adecuado y que el momento inicial introducido es menor (o igual) que el momento final. Por ejemplo, si se introducen los números 1, 2, 30,15, 21,
//1 entenderemos que el momento inicial es 1:02:30 am y el momento final es 15:21:1.
        Scanner sc = new Scanner(System.in);
        System.out.println("Hora inicial: ");
        int h1 = sc.nextInt();
        System.out.println("Minutos iniciales: ");
        int m1 = sc.nextInt();
        System.out.println("Segundos inciiales: ");
        int s1 = sc.nextInt();

        System.out.println("Hora final: ");
        int h2 = sc.nextInt();
        System.out.println("Minutos finales: ");
        int m2 = sc.nextInt();
        System.out.println("Segundos finales: ");
        int s2 = sc.nextInt();

        int h1s = h1 * 3600;
        int m1s = m1 * 60;
        int momento1 = h1s + m1s + s1;

        int h2s = h2 * 3600;
        int m2s = m2 *60;
        int momento2 = h2s + m2s + s2;

        int D = momento2 - momento1;
        int hD = D / 3600;
        int resto1 = D % 3600;
        int mD = resto1 / 60;
        int sD = resto1 % 60;
        if (momento1 < momento2 ) {
            System.out.println(hD + ":" + mD + ":" + sD);
        } else {
            System.out.println("Error 404");
        }


    }
}
