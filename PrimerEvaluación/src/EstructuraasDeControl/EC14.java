package EstructuraasDeControl;

import java.util.Scanner;

//El director de una escuela está organizando un viaje de estudios, y requiere
//determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de
// viajes por el servicio. La forma de cobrar es la siguiente:
// a. si son 100 alumnos o más, el costo por cada alumno es de 65 euros;
//b. de 50 a 99 alumnos, el costo es de 70 euros,
//c. de 30 a 49, de 95 euros,
//d. y si son menos de 30, el costo de la renta del autobús es de 4000 euros, sin
//importar el número de alumnos.
// Escribe un programa que permita determinar el pago a la compañía de autobuses
//y lo que debe pagar cada alumno por el viaje.
public class EC14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos alumnos van al viaje?");
        int alum = sc.nextInt();
        int via1 = alum * 65;
        int via2 = alum * 70;
        int via3 = alum * 95;
        int via4 = 4000 /alum;
        if (alum >= 100) {
            System.out.println("El costo sera 65 euros por alumno y el coste total " + via1 +"€");
        } else if ((alum >=50) && (alum <= 99)) {
            System.out.println("El costo sera 70 euros por alumno y el coste total " + via2 +"€");
        } else if ((alum >= 30) && (alum <= 49)) {
            System.out.println("El costo sera 95 euros por alumno y el coste total " + via3 +"€");
        } else if (alum < 30) {
            System.out.println("El coste sera " + via4 + " y el total sera 4000");
        }

    }
}
