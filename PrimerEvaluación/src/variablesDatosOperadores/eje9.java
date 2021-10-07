package variablesDatosOperadores;

import java.util.Scanner;

//Escribe un programa que calcule (y muestre) cuántas horas, minutos y segundos han
//transcurrido entre dos momentos del mismo día. Para ello, el programa ha de pedir
//por teclado seis números enteros: las horas, minutos y segundos para el momento
//inicial y lo mismo para el momento final. De momento vamos a considerar que los
//números introducidos van a estar en el rango adecuado y que el momento inicial
//introducido es menor (o igual) que el momento final. Por ejemplo, si se introducen
//los números 1, 2, 30,15, 21, 1 entenderemos que el momento inicial es 1:02:30 am y
//el momento final es 15:21:1. El programa debe mostrar por pantalla la diferencia en
//el formato: hh:mm:ss.
public class eje9 {
    public static void main (String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Momento Incial:\n" +
                "==========\n");
        System.out.println("Introduce la hora:");
        int hh = sc.nextInt();
        System.out.println("Introduce la minutos:");
        int mm = sc.nextInt();
        System.out.println("Introduce la segundos:");
        int ss = sc.nextInt();
        int momento1 = hh + mm + ss;

        System.out.println("Introduce la hora:");
        int hh2 = sc.nextInt();
        System.out.println("Introduce la minutos:");
        int mm2 = sc.nextInt();
        System.out.println("Introduce la segundos:");
        int ss2 = sc.nextInt();
        System.out.println("Datos introducidos momento inicial: " + hh + ":" + mm + ":" + ss +
                ".     momento final: " + hh2 + ":" + mm2 + ":" + ss2 );
        int hhs =hh * 3600;
        int mms =mm * 60;
        int sss =ss * 3600;
        int d = hhs + mms +sss;

        int hh2s =hh2 * 3600;
        int mm2s =mm2 * 60;
        int ss2s =ss2 * 3600;
        int res1 =(hh2s - hhs);
        int res2 =(hh2s - hhs);
        int res3 =(hh2s - hhs);

        System.out.println("La difencia entra ambos es: " + (res1 / 3600) + ":" +(res2 % 60) + ":"
        + (res3 / 3600));
//        int horas = ti / 3600;
//        int minutos = ti % 60;
//        int seg = ti / 3600;

    }
}
