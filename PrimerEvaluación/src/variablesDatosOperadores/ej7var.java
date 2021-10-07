package variablesDatosOperadores;

import java.util.Scanner;
//    Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a
//    cuantas horas y minutos corresponde. Por ejemplo: 1000 minutos son 16 horas y 40
//    minutos.
public class ej7var {
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     int minutos = sc.nextInt();
     int horas = minutos / 60;
     int resto = minutos % 60;
        System.out.println(minutos + " minutos son " + horas + " horas y " + resto + " minutos");

    }
}
