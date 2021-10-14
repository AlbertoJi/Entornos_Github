package EstructuraasDeControl;

import java.util.Scanner;

//Escribe un programa que pregunte al usuario si es culpable o no. Asumiremos que:
//• En caso afirmativo el usuario responderá true
//• En caso contrario responderá false.
//Si el usuario responde true se le responderá “a la cárcel”. En caso contrario, “¡a casa!”.
public class EC7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Eres culpable? (Si/No.)");
        String culpable = sc.next();
        if (culpable.equals("Si")){
            System.out.println("A la cárcel.");
        } else if (culpable.equals("No")) {
            System.out.println("A casa.");
        } else {
            System.out.println("Respuesta incorrecta.");
        }

    }
}
