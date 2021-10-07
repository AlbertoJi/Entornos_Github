package variablesDatosOperadores;

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
        System.out.println("le corresponde a cada ardilla " + co + " nueces" +" Y sobran " + resto + " nueces");


    }


}
