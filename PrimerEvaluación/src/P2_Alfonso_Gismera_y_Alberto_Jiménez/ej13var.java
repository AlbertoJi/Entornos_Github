package P2_Alfonso_Gismera_y_Alberto_Jiménez;

import java.util.Scanner;
/**
 *@author 1daw : Alfonso Fco Gismera y Alberto Jiménez
 */
//Escribe un programa que, dado un importe en euros, indique el número mínimo de
//billetes y la cantidad sobrente que se pueden utilizar para obtener dicha cantidad.
//Por ejemplo: 232 euros: 1 billete de 200, 1 billete de 20, un billete de 10, y sobren 2 euros.
public class ej13var {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número");
        int n = sc.nextInt();

        int b500 = n / 500;
        int rest = n % 500;

        int b200 = rest / 200;
        rest =rest % 200;

        int b100 = rest / 100;
        rest = rest % 100;

        int b50 = rest / 50;
        rest = rest % 50;

        int b20 = rest / 20;
        rest = rest % 20;

        int b10 = rest / 10;
        rest = rest % 10;

        int b5 = rest / 5;
        rest = rest % 5;
        int euros = rest;

        if (n >= 1)  {
            System.out.println("Este es el número de billetes  " + b500 +" billete de 500, " + b200 + " billete de 200, " + b100 + " billete de 100, "
                    + b50 + " billete de 50," + b20 + " billete de 20, " + b10 + " billete de 10, " + b5 + " billete de 5, " + euros + " euros.");
        } else {
            System.out.println("Error 404");
        }
    }
}
