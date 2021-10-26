package P3_Alfonso_Gismera_y_Alberto_Jiménez;
/**
 *@author 1daw : Alfonso Fco Gismera y Alberto Jiménez
 */
import java.util.Scanner;

public class ej22var {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime cuantas notas");
        int total = sc.nextInt();
        double num = 0;
        double suma = 0;
        int cont = 0;
        System.out.println("Dime las notas finales");
        for (int i = 1 ; i <= total; i++) {
            System.out.println("Nota final");
            num = sc.nextDouble();
            suma = suma + num;
            cont++;
            System.out.println("Nota del " + cont + " modulo" );
        }
        double media = suma/ cont;
        System.out.println("Media " + Math.round(media));
        if ((media >= 5) && (media <=10)) {
            System.out.println("Aprovado");
        }else {
            System.out.println("Suspendido");
        }
    }
}
