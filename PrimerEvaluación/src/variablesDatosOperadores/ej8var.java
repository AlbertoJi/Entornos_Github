package variablesDatosOperadores;

import java.util.Scanner;

//Escribe un programa que reciba un tiempo en segundos y muestre por pantalla este
//        tiempo pero expresado en horas, minutos y segundos. Por ejemplo, 12.610 segundos
//        son 3 horas, 30 minutos y 10 segundos.
public class ej8var {

        public static void main (String[] args) {
        Scanner sc =new Scanner(System.in);
        int ti = sc.nextInt();
        int horas = ti / 3600;
        int minutos = ti % 60;
        int seg = ti / 3600;

        if ((seg >= 1) && (horas >= 0) && (minutos >= 0)) {
                System.out.println(ti + " minutos son " + horas + " horas y " + minutos + " minutos y " + seg + " segundos");
        } else {
                System.out.println("Error 404");
        }
    }
}
