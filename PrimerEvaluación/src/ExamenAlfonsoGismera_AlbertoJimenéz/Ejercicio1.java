package ExamenAlfonsoGismera_AlbertoJimenéz;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas personas tiene una reserva");
        int reserva =sc.nextInt();
        int p1 = 95;
        int p2 = 85;
        int p3 = 75;

        if (reserva > 200 && reserva <= 300) {
            System.out.println(reserva * p2);
        } else if (reserva > 300){
            System.out.println(reserva * p3);
        }  else {
         System.out.println( "El precio es "+ reserva * p1 + "$ en total");
    }


    }
}
