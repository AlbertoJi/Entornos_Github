package EstructuraasDeControl;

import java.util.Scanner;

//Harry Potter necesita ayuda para identificar lo que significa cada casa. Lee una
//        cadena que represente una casa (puedes asociarla a un número para hacer más fácil
//        la entrada por teclado) y que obtenga lo siguiente:
//        • si es "gryffindor" , salida "valentía" ;
//        • si es "hufflepuff" , salida "lealtad" ;
//        • si es "slytherin" , salida "astucia" ;
//        • si es "ravenclaw" , salida "intelecto" ;
//        • de lo contrario, la salida "no es una casa válida" .
public class EC16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime una casa");
        String casa = sc.next();
        if (casa.equals("gryffindor")) {
            System.out.println("valentía");
        } else if (casa.equals("hufflepuff")) {
            System.out.println("lealtad");
        } else if (casa.equals("slytherin")) {
            System.out.println("astucia");
        } else if (casa.equals("ravenclaw")) {
            System.out.println("intelecto");
        } else {
            System.out.println("No es una casa valida (Muggle)");
        }

    }
}
