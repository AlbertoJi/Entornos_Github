package String;

import java.util.Scanner;

//calculadora
public class metodosconparametros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime dos números");
        double numero = sc.nextDouble();
        double numero2 = sc.nextDouble();
        System.out.println("Dime la operación: \n1 Suma\n2 Resta\n3 Muliplicar\n4 Dividir");
        int ope = sc.nextInt();
        switch (ope) {
            case 1:
                double suma = numero + numero2;
                System.out.println("La suma: " + suma);
                break;
            case 2:
                double resta = numero - numero2;
                System.out.println("La resta: " + resta);
                break;
            case 3:
                double multi = numero * numero2;
                System.out.println("La multiplicación: " + multi);
                break;
            case 4:
                double dividir = numero / numero2;
                System.out.println("La división: " + dividir);
                break;
        }
    }
}
