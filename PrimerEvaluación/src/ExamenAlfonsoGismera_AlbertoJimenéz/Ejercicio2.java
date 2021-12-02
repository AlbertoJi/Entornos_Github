package ExamenAlfonsoGismera_AlbertoJimenéz;

import java.util.Scanner;

//Hacer un programa que nos diga el dinero que tenemos (en euros y
//céntimos) después de preguntarnos cuántas monedas tenemos (de 2€, 1€, 50 céntimos, 20
//céntimos o 10 céntimos). Por ejemplo, si introduzco 3 monedas de 2 €, 4 de 1 €, 5 de 50
//céntímos, ninguna de 20 céntimos y 1 de 10 céntimos, me contestará que tengo 12 euros y 60
//céntimos.
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime cuantas monedas de 2€ tienes");
        int €2 = sc.nextInt();
        System.out.println("Dime cuantas monedas de 1€ tienes");
        int €1 = sc.nextInt();
        System.out.println("Dime cuantas monedas de 50 centimos tienes");
        int c50 = sc.nextInt();
        System.out.println("Dime cuantas monedas de 20 centimos tienes");
        int c20 = sc.nextInt();
        System.out.println("Dime cuantas monedas de 10 centimos tienes");
        int c10 = sc.nextInt();
        int multi = €2 * 200;
        int multi2 = €1 * 100;
        int tc50 = c50 * 50;
        int tc20 = c20 * 20;
        int tc10 = c10 * 10;
        int suma = multi + multi2 + tc50 + tc20 + tc10;
        int resto = suma % 100;
        int total = suma / 100;
        System.out.println("Este son los euros que tenemos " + total + "€ y " + resto + " centimos." );


    }
}
