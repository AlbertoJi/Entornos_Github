package ExamenAlfonsoGismera_AlbertoJimenéz;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        while (seguir){
            System.out.println("Elige el operador\n1Suma\n2Resta\n3Multiplicación\n4División");
            int oper = sc.nextInt();
            while(true) {
                if (oper == 1) {
                    System.out.println("Elegiste sumar");
                    System.out.println("Primer número");
                    int oper1 = sc.nextInt();
                    System.out.println("Segundo número");
                    int oper2 = sc.nextInt();
                    int sumar =(oper1 + oper2);
                    System.out.println("Este es resultado:" + sumar);
                    break;
                } else if (oper == 2) {
                    System.out.println("Elegiste restar");
                    System.out.println("Primer número");
                    int oper1 = sc.nextInt();
                    System.out.println("Segundo número");
                    int oper2 = sc.nextInt();
                    int restar =(oper1 - oper2);
                    System.out.println("Este es resultado:" + restar);
                    break;
                }else if (oper == 3) {
                    System.out.println("Elegiste Multiplicar");
                    System.out.println("Primer número");
                    int oper1 = sc.nextInt();
                    System.out.println("Segundo número");
                    int oper2 = sc.nextInt();
                    int Multiplicar =(oper1 * oper2);
                    System.out.println("Este es resultado:" + Multiplicar);
                    break;
                }else if (oper == 4) {
                    System.out.println("Elegiste Dividir");
                    System.out.println("Primer número");
                    int oper1 = sc.nextInt();
                    System.out.println("Segundo número");
                    int oper2 = sc.nextInt();
                    int Dividir =(oper1 / oper2);
                    System.out.println("Este es resultado:" + Dividir);
                    break;
                }else {
                    System.out.println("Elegiste un valor incorrecto,vuelve a intentarlo");
                    oper = sc.nextInt();
                }

            }
            System.out.println("¿Quieres seguir?\nEscribre Si o No");
            String bucle = sc.next();
            if (bucle.equals("Si")){
                System.out.println("!!Sigamos divertiendonos!!");
            } else if (bucle.equals("No")) {
             seguir = false;
            System.out.println("!!divertiendonos!!");}
        }


    }
}