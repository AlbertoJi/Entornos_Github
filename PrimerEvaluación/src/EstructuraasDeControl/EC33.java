package EstructuraasDeControl;

import java.util.Scanner;

//Escribe un programa que, dados dos números, uno real (base) y un entero positivo
//(exponente), saque por pantalla el resultado de la potencia. No se puede utilizar el
//método el método Math.pow().
public class EC33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        int expo = sc.nextInt();
        double pote = 1;
        for (int i = 1; i <= expo ; i++) {
            pote = pote * base;

        }
        System.out.println("Resultado:" + pote);
    }
}
