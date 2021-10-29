package EstructuraasDeControl;
//Escribe un programa que cuente la cantidad de números que vamos introduciendo
//        por teclado. Cuando el programa lee 0, debe terminar y mostrar la longitud de la
//        secuencia (sin contar el 0 final).
import java.util.Scanner;

public class EC37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        System.out.println("Dime un numero");
        int n = sc.nextInt();
        while (n !=0) {
            System.out.println("Escribe mas números");
            n = sc.nextInt();
            cont++;
        }
        System.out.println(cont);
    }
}
