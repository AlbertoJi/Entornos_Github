package EstructuraasDeControl;

import java.util.Scanner;

//Escribe un programa que lea el número de dirección (1 - arriba, 2 - abajo, 3 -
//izquierda, 4 - derecha, 0 – no mover) y muestre el texto « subir », o «bajar», o «
//mover a la izquierda », o« mover a la derecha », o« no mover », según el número
//introducido). Si es un número que no pertenece a ninguna de las direcciones
//enumeradas, el programa debería generar: « ¡error! »
public class EC17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime un numero de direccion\n1 - Arriba\n2 - Abajo\n3 - izquierda\n4 - derecha\n0 - no mover");
        int direc = sc.nextInt();
        switch (direc) {
            case 1:
                System.out.println("subir");
                break;
            case 2:
                System.out.println("bajar");
                break;
            case 3:
                System.out.println("mover a la izquierda");
                break;
            case 4:
                System.out.println("mover a la derecha");
                break;
            case 0:
                System.out.println("no mover");
                break;
            default:
                System.out.println("error 404");
                break;
        }
    }
}
