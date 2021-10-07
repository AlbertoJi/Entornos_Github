package variablesDatosOperadores;
//Escribe un programa que lea un valor por teclado y verifique si es menor que 10. El
// programa debe imprimir un booleano (true o false).
import java.util.Scanner;

public class ej31var {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Di un número");
        int n = 10;
        int na = sc.nextInt();
        boolean f = n > na;
        System.out.println("Es " + f);
    }
}
