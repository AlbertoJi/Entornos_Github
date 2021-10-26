package P2_Alfonso_Gismera_y_Alberto_Jiménez;
/**
 *@author 1daw : Alfonso Fco Gismera y Alberto Jiménez
 */
import java.util.Scanner;

public class ej6var {
//    N ardillas encuentran K nueces y deciden dividirlas equitativamente. Escribe un
//programa que calcule (y muestre) cuántas nueces corresponden a cada ardilla y
//cuántas sobrarán tras el reparto.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿cuantas ardillas?");
        int n = sc.nextInt(); //ardillas
        System.out.println("¿cuantas nueces?");
        int k = sc.nextInt(); //nueces
        int co = k / n;
        int resto = n % k;
        if ((n >= 1) && (k >=0)) {
            System.out.println("le corresponde a cada ardilla " + co + " nueces" +" Y sobran " + resto + " nueces");
        } else {
            System.out.println("Error 404");
        }
    }


}
