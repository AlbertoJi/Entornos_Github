package EstructuraasDeControl;

import java.util.Scanner;

//Realiza un programa que pida por teclado el sueldo anual de una persona, si supera
//los 9000 euros, mostrar un mensaje en pantalla indicando que debe abonar
//impuestos. Si no lo supera, que indique que no debe abonarlos.
public class EC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu sueldo:");
        int n = sc.nextInt();
        if (n >= 9000) {
            System.out.println("Debe abonar");
        } else {
            System.out.println("No debe abonar");
        }
    }
}
