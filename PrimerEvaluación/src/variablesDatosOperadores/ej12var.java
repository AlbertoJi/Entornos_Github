package variablesDatosOperadores;

import java.util.Scanner;

//Escribe un programa que lea un número de tres cifras y muestre el número invertido.
//Por ejemplo: si introducimos el número 320, el programa debe mostrar 23; si
//introducimos 976, el programa debe mostrar 679.
public class ej12var {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Escribe un número");
        int n = sc.nextInt();
        int centena = n/ 100;
        int rest_centena = n % 100;
        int decena = rest_centena / 10;
        int uni = n % 10;
        System.out.println("Este es el número invertido " + uni + decena + centena);
    }
}
