package ejercicio2;

import java.util.Scanner;

public class Ejecicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu edad");
        int edad = sc.nextInt();


    }
     private  class pedirEdad {
        Scanner sc = new Scanner(System.in);
        int edad;
        public pedirEdad(int edad) {
            this.edad = edad;
        }

    }
}
