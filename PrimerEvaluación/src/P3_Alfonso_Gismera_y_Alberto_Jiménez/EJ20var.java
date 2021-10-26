package P3_Alfonso_Gismera_y_Alberto_Jiménez;
/**
 *@author 1daw : Alfonso Fco Gismera y Alberto Jiménez
 */
import java.util.Scanner;

public class EJ20var {
//    Realizar un programa que lea cuatro valores numéricos e imprima su suma y su
//    media. Ten en cuenta que la media puede contener decimales.
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("¿Cuantos números vas escribir?");
    int total = sc.nextInt();
    double num = 0;
    double suma = 0;
    int cont = 0;
    for (int i = 1 ; i <= total; i++) {
        System.out.println("Número:");
        num = sc.nextInt();
        suma = suma + num;
        cont++;
    }
    double media = suma/cont ;
    System.out.println("Suma: " + suma);
    System.out.println("Media: " + media);

    }
}
